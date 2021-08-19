def printHello() {
    println("Hello!");
}
printHello();

def sum(int a = 2, int b = 2) { // default params
    println("sum is " + (a + b))
}
sum(5, 5)

def sub(int a, int b) {
    def c = a - b
    return c
}
def result = sub(5, 5)
println("result is:  " + result)