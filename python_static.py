def mystery():
    print("stuff")

def mystery2(num):
    return "You sent " + str(num)


# the runnable code
mystery() # no parameter, no return
ans = mystery2(42) # one parameter, with return
print(ans)

