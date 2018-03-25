
def main():
    n = int(input())
    stacks = {i:[] for i in range(n)}
    print(stacks)
    command = ""

    while(command != "quit"):
        command = str.split(input())
        action = command[0]
        firstNum = int(command[1])
        action_two = command[2]
        secondNum = int(command[3])

        if action == "move" and firstNum != secondNum:
            if action_two == "onto":
                for key, value in stacks.items():
                    if value.count(firstNum) >= 1:
                        prevNum = key
                        stacks[prevNum].remove(firstNum)
                        break
                stacks[secondNum].clear()
                stacks[firstNum].clear()
                stacks[secondNum].append(firstNum)

            if action_two == "over":
                isStacked = False
                for key, value in stacks.items():
                    if value.count(firstNum) >= 1:
                        isStacked = True
                        prevNum = key
                        break

                if isStacked is True:
                    startIndex = stacks[prevNum].index(firstNum)
                    stacks[prevNum].remove(firstNum)
                    newList = []
                    ctr = 0
                    for x in stacks[prevNum]:
                        if ctr > startIndex-1:
                            break
                        ctr += 1
                        newList.append(x)
                    stacks[prevNum] = newList
                stacks[secondNum].append(firstNum)



        if action == "pile":
            if action_two == "onto":
                for key, value in stacks.items():
                    if value.count(firstNum) >= 1:
                        prevNum = key
                        stacks[prevNum].remove(firstNum)
                        break

                stacks[secondNum].clear()
                stacks[secondNum] = [x for x in stacks[firstNum]]
                stacks[firstNum].clear()

            if action_two == "over":
                for key, value in stacks.items():
                    if value.count(firstNum) >= 1:
                        prevNum = key
                        stacks[prevNum].remove(firstNum)
                        break

                for x in stacks[firstNum]:
                    stacks[secondNum].append(x)
                
                stacks[firstNum].clear()

        print(stacks)


if __name__ == '__main__':
    main()
