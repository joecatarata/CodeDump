
def moveBottles(bins):
    # largestB = 0
    # largestG = 0
    # largestC = 0
    # currBinIndex = 0
    # largestBIndex = 0
    # largestGIndex = 0
    # largestCIndex = 0
    # for ctr in range(0,10):
    #     print(ctr)
    #     if ctr <= 2:
    #         currBinIndex = 0
    #     elif ctr > 2 and ctr <= 5:
    #         currBinIndex = 1
    #     elif ctr > 5 and ctr <= 8:
    #         currBinIndex = 2
    #     if ctr % 3 == 0:
    #         if largestB <= bins[currBinIndex]['B']:
    #             largestB = bins[currBinIndex]['B']
    #             largestBIndex = currBinIndex
    #     elif ctr % 3 == 1:
    #         if largestG <= bins[currBinIndex]['G']:
    #             largestG = bins[currBinIndex]['G']
    #             largestGIndex = currBinIndex
    #     elif ctr % 3 == 2:
    #         if largestC <= bins[currBinIndex]['C']:
    #             largestC = bins[currBinIndex]['C']
    #             largestCIndex = currBinIndex
    #
    # print(largestB)
    # print(largestG)
    # print(largestC)
    # print(largestBIndex)
    # print(largestGIndex)
    # print(largestCIndex)
    min = 0
    answer = 
def main():
    bins = []
    bin1 = {'B': 0, 'G': 0, 'C': 0}
    bin2 = {'B': 0, 'G': 0, 'C': 0}
    bin3 = {'B': 0, 'G': 0, 'C': 0}
    userInput = str(input())

    userInput = str.split(userInput)
    while(len(userInput) == 9):
        userInput = [int(input) for input in userInput]
        print(userInput)
        # Initialize input
        for ctr in range(0, len(userInput)):
            index = ""
            if ctr % 3 == 0:
                index = 'B'
            elif ctr % 3 == 1:
                index = 'G'
            elif ctr % 3 == 2:
                index = 'C'
            if ctr <= 2:
                bin1[index] += userInput[ctr]
            elif ctr > 2 and ctr <= 5:
                bin2[index] += userInput[ctr]
            elif ctr > 5 and ctr <= 8:
                bin3[index] += userInput[ctr]

        bins.append(bin1)
        bins.append(bin2)
        bins.append(bin3)
        print(bins)
        moveBottles(bins)

        userInput = str(input())
        userInput = str.split(userInput)
if __name__ == "__main__":
    main()
