class Solver():

    def __init__(self):
        pass

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
        evenString = convertStringToAscii(evenString)
        return evenString

    
def main():
    solver = Solver()
    message1 = "zoo grsrmtu vevm"
    message2 = "gtqhke lspnwarkbe xmdunskt aczotmeet hddoiwgn"
    #Game 1
    decryptedMessage = solver.reverseLetters(message1)
    print(decryptedMessage)
    # #Game 2
    # decryptedMessage = solver.decryptEven(message2)
    # print(decryptedMessage)
    


if __name__ == "__main__":
    main()
