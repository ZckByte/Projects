#Store multiple lines in text file

name = str(input("Input a name for the text file: "))
try:
    with open(f"Python/DailyProjects/Beginner/algorithmTen/{name}.txt", "x") as file:
        if name == "":
            print("The name is invalid")
        else:
            print("Text File created")
        while True:
            line = str(input("Input text for your text file: "))
            file.write(f"{line} \n")
            print("!Line Writed!")
            ans = str(input("Input another line?, S = yes, N = not: "))
            ans = ans.lower()
            if ans != "s":
                print("Thanks for use")
                break
            else:
                continue 
except:
    with open(f"Python/DailyProjects/Beginner/algorithmTen/{name}.txt", "w") as file:
        if name == "":
            print("The name is invalid")
        else:
            print("Text File created")
        while True:
            line = str(input("Input text for your text file: "))
            file.write(f"{line} \n")
            print("!Line Writed!")
            ans = str(input("Input another line?, S = yes, N = not: "))
            ans = ans.lower()
            if ans != "s":
                print("Thanks for use")
                break
            else:
                continue