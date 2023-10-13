no = int(input("Enter number : "))
div = 2
count = 0
while div <= no/2:
    if no % div == 0:
        count = count + 1
    div += 1
if count == 0:
    print(no, ' is a prime number')
else:
    print(no, ' is not a prime number')
