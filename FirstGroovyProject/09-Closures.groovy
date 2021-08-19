// bock of code that can take params, refer vars, return vals, passed as a param in a method

//Closure 1
def myClosure1 = { name -> println("Hello ${name}") }

myClosure1.call("Harry")

def myfunc(close) {
    close.call("Groovy")
}
myfunc(myClosure1)

//Closure 2
def myClosure2 = {
    a,b,c ->
    return (a + b + c)
}
def res = myClosure2(10, 20, 30)
println(res)

//Closure 3
def myList1 = ["apples", "oranges", "grapes"]
println(myList1.each{it})

//Closure 4
def myMap = [
    'subject': 'groovy',
    'topic': 'closures'
]
println(myMap.each{it})

//Closure 5
def myList2 = [1, 3, 4, 5, 6]
println(myList2.find{item -> item == 6})
println(myList2.findAll{item -> item > 3})
println(myList2.any{item -> item > 5})
println(myList2.every{item -> item > 3})
println(myList2.collect{item -> item * 2})