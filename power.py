def power(a, b):
    p = 1
    while (b > 0):
        p = p * a
        b = b-1
    return p
a = int(input("no1 : "))
b = int (input("no2 : "))

print(power(a, b))
