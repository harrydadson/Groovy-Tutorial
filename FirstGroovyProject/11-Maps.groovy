// Maps - [key: value] pair, unordered collection

def employee = [
    'name': 'John',
    'age': 40
]
println(employee)
println(employee.name)
println(employee['name'])
println(employee.get('age'))
println(employee.size())

employee.put('city', 'Paris')
println(employee)
println(employee.containsKey('city'))
println(employee.containsValue('Paris'))

// clone
def emp2 = employee.clone()
println(emp2)

// iterate
employee.each{ key, value -> println("$key:  $value")}

employee.eachWithIndex{ key, value, i -> println("$i | $key: $value")}

employee.each{entry -> println("$entry.key : $entry.value")}

def map1 = ['a': 1, 'b': 2]
def entries = map1.entrySet()
entries.each { entry -> 
                assert entry.key in ['a', 'b']
                assert entry.value in [1, 2]
                }