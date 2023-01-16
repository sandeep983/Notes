def anotherFunction():
    pass

# Question starts here for Big O Notation
def funChallenge(input):
    a = 10      #O(1)
    a = 50+3    #O(1)

    for items in range(0, len(input)):  #O(n)
        anotherFunction();  #O(n)
        stranger = True     #O(n)
        a+=1                #O(n)
    return a    #O(1)
#Ends here
#Answer: 3+n+n+n+n --> 3+4n --> Big O(3+4n) --> Big O(n)

print(funChallenge([1,2,3,4,5]))
