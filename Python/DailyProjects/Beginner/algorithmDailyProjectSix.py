#Check username
print("----Check an Username----")
user_check = str(input("Input your username: "))
def check_name(username):
    if len(username) > 4 and len(username) < 15:
        if username.isalnum():
            if username.isalpha():
                print("The username is valid")
            else:
                print("The username is invalid")
        else:
            print("The username is invalid")
    else:
        print("The username is invalid")
user = user_check
check_name(user)