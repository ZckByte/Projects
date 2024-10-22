#Funtion that calculates the sum of a list


print("-----------------------")
while True:
        try:
            mount = int(input("What a mount the numbers?: "))
        except:
            print("Input INTEGERS")
            continue
        nums = []
        for i in range(mount):
            try:
                nums1 = int(input("Input numbers: "))
            except:
                print("Num invalids, input integers.")
                continue
            nums.append(nums1)
        print(f"The sum of {nums} your numbers is: {sum(nums)}")
        break
