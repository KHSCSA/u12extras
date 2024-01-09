class Widget:
    def __init__(self, num):
        self.x = num

    def mystery(self):
        print("the object called this method")

    def __str__(self):
        return "this object has this property: " + str(self.x)
    










# create a object, call a method, print
thing = Widget(42)
thing.mystery()
print(thing)


