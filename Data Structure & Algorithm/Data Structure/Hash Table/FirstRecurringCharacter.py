#Google Question

#Given an array = [2,5,1,2,3,5,1,2,4] ---> It should return 2
#Given an array = [2,1,1,2,3,5,1,2,4] ---> It should return 1
#Given an array = [2,3,4,5] ---> It should return -1

#Solution
def firstRecurringCharacter(input):
    dict = {}
    for i in range(len(input)):
        if input[i] in dict:
            return input[i]
        else:
            dict[input[i]] = i
    return -1

# print(firstRecurringCharacter([2,1,1,2,3,5,1,2,4]))


#if done by array then but here's one issue instead of giving us first recurring
# characters it will give us the first repeated chars
def firstRecurringCharacter2(input):
    temp_list = []
    for i in range(len(input)):
        for j in range(len(input)):
            if input[i] == input[j] and input[i] in temp_list:
                return input[i]
            elif(input[i] not in temp_list):
                temp_list.append(input[i])

print(firstRecurringCharacter2([2,1,1,2,3,5,1,2,4]))


