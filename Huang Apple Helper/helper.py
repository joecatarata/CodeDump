
#Data source: https://vynli.com/story-of-seasons-friends-of-mineral-town-earning-1000000g-from-won/
from os import system, name

def main():
    system("clear")
    permutation = {21: {"AHS": "ASH", "ASH": "AHS", "HAS": "HSA", "HSA": "HAS", "SAH": "SHA", "SHA":"SAH",},
                   31: {"AHS": "AHS", "ASH": "ASH", "HAS": "HAS", "HSA": "HSA", "SAH": "SAH", "SHA":"SHA",},
                   11: {"AHS": "AHS", "ASH": "ASH", "HAS": "HAS", "HSA": "HSA", "SAH": "SAH", "SHA":"SHA",},
                   12: {"AHS": "HAS", "ASH": "SAH", "HAS": "AHS", "HSA": "SHA", "SAH": "ASH", "SHA":"HSA",},
                   33: {"AHS": "SAH", "ASH": "HAS", "HAS": "SHA", "HSA": "AHS", "SAH": "HSA", "SHA":"ASH",},
                   13: {"AHS": "SHA", "ASH": "HSA", "HAS": "SAH", "HSA": "ASH", "SAH": "HAS", "SHA":"AHS",},
                   32: {"AHS": "HSA", "ASH": "SHA", "HAS": "ASH", "HSA": "SAH", "SAH": "AHS", "SHA":"HAS",}
                   }

    # MAIN LOOP
    current_order = "SHA"
    for x in range(10):
        print("Rounds left until Goddess Flower: " + str((10-x)))
        print("The current order is now " + current_order)
        order = -1
        while order not in permutation.keys():
            order = int(input("Enter the last 2 moves: "))
            try:
                current_order = permutation[order][current_order]
            except:
                print("Please input a valid order!\n\n")
        system("clear")

    print("Congratulations on winning the Goddess Flower!")



if __name__ == "__main__":
    main()
