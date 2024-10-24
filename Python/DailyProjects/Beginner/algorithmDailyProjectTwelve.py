#Count Uppercase and Lowercase LEtter in String

strings = str(input("Input string for count cases: "))
countU = 0
countL = 0
for s in strings:
    if s.isupper():
        countU+=1
    elif s.islower():
        countL+=1
print(f"Uppercase: {countU} \nLowercase: {countL}")