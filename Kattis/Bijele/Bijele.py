def main():
    pieces_found = [int(x) for x in input().split()] # Split input using whitespace and convert each element to string
    pieces_needed = []
    for x in range(6): # can be len(pieces_found) but it's always 6 anyways
        if(x == 0):
            pieces_needed.append((pieces_found[0]-1)*-1)
        elif(x == 1):
            pieces_needed.append((pieces_found[1]-1)*-1)
        elif(x == 2):
            pieces_needed.append((pieces_found[2]-2)*-1)
        elif(x == 3):
            pieces_needed.append((pieces_found[3]-2)*-1)
        elif(x == 4):
            pieces_needed.append((pieces_found[4]-2)*-1)
        elif(x == 5):
            pieces_needed.append((pieces_found[5]-8)*-1)
    # print(pieces_found)
    # print(pieces_needed)
    for piece in pieces_needed:
        print(piece, end = " ")
if __name__ == "__main__":
    main()
