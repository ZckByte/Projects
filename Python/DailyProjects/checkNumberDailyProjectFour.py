print("------------------Positive or Negative------------------")

follow=True
while follow:
    try:
        num = float(input("Input the number: "))
    except:
        continue
    if num < 0:
        print("The number is Negative")
    elif num > 0:
        print("The number is Positive")
    elif num == 0: 
        print("The number is Zero")
    follow2 = str(input("wish follow?, S = yes, N = Not: "))
    follow2 = follow2.lower()
    if follow2 != "s":
        print("!Thanks for use!")
        follow=False
    else:
        continue
