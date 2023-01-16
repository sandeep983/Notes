#Question starts here
def anotherFunctionChallenge(input):
    a = 5   #O(1)
    b = 10  #O(1)
    c = 15  #O(1)

    for items in range(0, len(input)):  #O(n)
        x = items+1   #O(n)
        y = items+2   #O(n)
        z = items+3   #O(n)
    
    for items in range(0, len(input)):  #O(n)
        p = items*2   #O(n)
        q = items*2   #O(n)

    whoAmI = "I don't know"  #O(1)
#Ends here
    
    print(whoAmI, "\n", a, b, c, "\n", x, y, z, "\n", p, q)
#Answer: 3+7n --> Big O(3+7n) --> Big O(n)

anotherFunctionChallenge([1,2,3,4,5])