

def fruits = ['apples', 'oranges', 'grapes']
println(fruits[1])
println(fruits.get(2))

def myList1 = [1, 2, 3, ['A', 'B', "Groovy"], 4]
println(myList1[3])
println(myList1[3][2])
println(myList1[0..2])
println(myList1[3].contains("Groovy"))
println(myList1[3].size())
println(myList1.add(7))
//println(myList1.add<<20)
println(myList1.add(2, 22))

myList1 = myList1 + [30, 40]
println(myList1)

myList1 = myList1.reverse()
println(myList1)

myList1 = myList1.sort()
println(myList1)

myList1 = myList1.clear()
println(myList1)