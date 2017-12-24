#Using Python 3
class Solver():
    chessBoard = {}
    banner = {}
    def __init__(self):
        self.chessBoard = { #For Game 3
            'A': ['A', 'F', 'K', 'P', 'U'],
            'B': ['B', 'G', 'L', 'Q', 'V'],
            'C': ['C', 'H', 'M', 'R', 'W'],
            'D': ['D', 'I', 'N', 'S', 'X'],
            'E': ['E', 'J', 'O', 'T', 'Y']
        }

        self.bannerKey = {
            'R': "Reindeer",
            "W": "Wolf",
            "F": "Fish",
            "D": "Dragon",
            "L": "Lion"
        }

    def convertStringToAscii(self, string):
        return [ord(ch) for ch in string]
    def convertAsciiToString(self, string):
        return ''.join(string)

    def reverseLetters(self, message): #Game 1
        #ABCDEFGHIJKLMNOPQRSTUVWXYZ
        #ZYXWVUTSRQPONMLKJIHGFEDCBA
        string = self.convertStringToAscii(message)
        string = [c-97 for c in string]
        decryptedString = [((c-25)*-1)+97 for c in string]
        ctr = 0
        while ctr < len(decryptedString):
            if(decryptedString[ctr] > 127):
                decryptedString[ctr] = 32
            ctr += 1
        decryptedString = [chr(c) for c in decryptedString]
        decryptedString = self.convertAsciiToString(decryptedString)
        return decryptedString


    def decryptEven(self, message): #Game 2
        temp = self.convertStringToAscii(message)
        print(temp)
        asciiValues = []
        ctr = 0
        for value in temp:
            if(value == 32):
                ctr=1
            if(ctr%2==1 or value == 32):
                asciiValues.append(value)
            ctr+=1
        evenString = [chr(asciiVal) for asciiVal in asciiValues]
        evenString = self.convertAsciiToString(evenString)
        return evenString

    def decryptChess(self, messageList, isBanner=None): #Game 3
        message = []
        for code in messageList:
            letter = code[0]
            number = int(code[1])
            letterList = self.chessBoard[letter]
            message.append(letterList[number-1])

        #For banner
        if isBanner is not None:
            bannerMessage = []
            for letter in message:
                bannerMessage.append(self.bannerKey[letter])
                bannerMessage.append(" ")

            message = bannerMessage



        return self.convertAsciiToString(message)


def main():
    solver = Solver()
    message1 = "zoo grsrmtu vevm"
    message2 = "gtqhke lspnwarkbe xmdunskt aczotmeet hddoiwgn"
    bannersMessage = ["C4", "C5", "A2", "D1", "B3"]
    message3 = ["D4", "A5", "C4", "B5", "D2", "B5", "E3", "C4"]

    # #Game 1
    # decryptedMessage = solver.reverseLetters(message1)
    # print(decryptedMessage)
    # #Game 2
    # decryptedMessage = solver.decryptEven(message2)
    # print(decryptedMessage)

    #Game 3
    print("Encrypted: ")
    print(message3)
    decryptedMessage = solver.decryptChess(message3)
    print("Decrypted: " + decryptedMessage)
    print(solver.decryptChess(bannersMessage, True))

    #Banners

if __name__ == "__main__":
    main()
