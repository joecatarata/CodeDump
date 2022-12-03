# 4x4 grid = 16 size
# e.g. 0 2 4 8
# resulting tile cannot merge again in the same move

def cleanRows(row, movement): # move numbers to open 0's
	if movement == 0 or movement == 1 or movement == 3:
		for i in range(0,3):
			if row[i] == 0:
				temp = i
				while row[temp] == 0 and temp != 3:
					temp += 1
				if temp > i and temp <= 3 :
					row[i] = row[temp]
					row[temp] = 0
	if movement == 2:
		for i in reversed(range(1,4)):
			if row[i] == 0:
				temp = i
				# print("Current value of i: " + str(i))
				while row[temp] == 0:
					temp -= 1
					# print("Current value of temp: " + str(temp))
				if temp < i and temp >= 0 :
					row[i] = row[temp]
					row[temp] = 0
	# print(row)
	return row

def move(grid, movement):
	for i in range(0,4):
		current_row = []
		if movement == 0: #left
			current_row = grid[i]
			if grid[i].count(0) != 0:
				for j in range(0,3):
					if current_row[j] != 0: # find similar if not 0
						temp = j+1
						while current_row[temp] == 0 and temp != 3:
							temp += 1
						if current_row[j] == current_row[temp]:
							current_row[j] *= 2
							current_row[temp] = 0

			else: # no zeroes in row, all have value
				for j in range(0,3):
					if current_row[j] == current_row[j+1]:
						current_row[j] *= 2
						current_row[j+1] = 0
			grid[i] = cleanRows(current_row,movement)

		if movement == 1: # up
			current_row.append(grid[0][i])
			current_row.append(grid[1][i])
			current_row.append(grid[2][i])
			current_row.append(grid[3][i])
			if grid[i].count(0) != 0:
				for j in range(0,3):
					if current_row[j] != 0: # find similar if not 0
						temp = j+1
						while current_row[temp] == 0 and temp != 3:
							temp += 1
						if current_row[j] == current_row[temp]:
							current_row[j] *= 2
							current_row[temp] = 0

			else: # no zeroes in row, all have value
				for j in range(0,3):
					if current_row[j] == current_row[j+1]:
						current_row[j] *= 2
						current_row[j+1] = 0
			temporary_row = cleanRows(current_row,movement)

			for j in range(0,4):
				grid[j][i] = temporary_row[j]

		if movement == 2: #right
			current_row = grid[i]
			if grid[i].count(0) != 0:
				for j in reversed(range(1,4)):
					if current_row[j] != 0: # find similar if not 0
						temp = j-1
						while current_row[temp] == 0 and temp != 0:
							temp -= 1
						if current_row[j] == current_row[temp]:
							current_row[j] *= 2
							current_row[temp] = 0

			else: # no zeroes in row, all have value
				for j in reversed(range(1,4)):
					if current_row[j] == current_row[j-1]:
						current_row[j] *= 2
						current_row[j-1] = 0
			grid[i] = cleanRows(current_row,movement)

		if movement == 3: # up
			current_row.append(grid[3][i])
			current_row.append(grid[2][i])
			current_row.append(grid[1][i])
			current_row.append(grid[0][i])
			if grid[i].count(0) != 0:
				for j in range(0,3):
					if current_row[j] != 0: # find similar if not 0
						temp = j+1
						while current_row[temp] == 0 and temp != 3:
							temp += 1
						if current_row[j] == current_row[temp]:
							current_row[j] *= 2
							current_row[temp] = 0

			else: # no zeroes in row, all have value
				for j in range(0,3):
					if current_row[j] == current_row[j+1]:
						current_row[j] *= 2
						current_row[j+1] = 0
			temporary_row = cleanRows(current_row,movement)

			for j in range(0,4):
				grid[len(temporary_row)-(j+1)][i] = temporary_row[j]

	return grid


grid = []
for x in range (1,5):
	catcher = input("")
	grid.append([int(y) for y in catcher.split()])

movement = int(input(""))
grid = move(grid,movement)

for i in range(0,4):
	for j in range(0,4):
		print(str(grid[i][j]), end=" ")
	print(" ")
