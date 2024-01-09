class Stuff:
    def mystery():
        print("stuff")

    def mystery2(num):
        return "You sent " + str(num)


# the runnable code
Stuff.mystery() # no parameter, no return
ans = Stuff.mystery2(42) # one parameter, with return
print(ans)

