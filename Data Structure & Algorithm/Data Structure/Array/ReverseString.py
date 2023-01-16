given_str = "Hi mom"

def reverseString(str):
    array = []

    for i in range(len(str)-1,-1,-1):
        array.append(str[i])
    return ''.join(array)

    # or just return str[::-1]

print(reverseString(given_str))
