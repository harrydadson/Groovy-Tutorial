/* single quoted - '...'
    double quoted - "..."
    triple quoted - '''...'''
    triple double quoted - """..."""
    slashy /.../
    dollar slashy $/.../$
    */

def name = "Harry"
println("name is " + name)
println("name is ${name}")

// multi-lines
def s1 = """This is groovy class,
I love learning"""
println(s1)

def s2 = "Steve"
println(s2.length())
println(s2[2])
println(s2.indexOf("v"))
println(s2[0..2])
println(s2[0,2,4])
println(s2.substring(2))
println(s2.subSequence(1, 4))

def s3 = "This is groovy code"
println(s3.split(" "))
println(s3-("groovy"))
println(s3.replace("class", "session"))
println(s3.toLowerCase())
println(s3.toUpperCase())
println(s3.toList())
println("ABC". equals("abc"))
println("Abc".equalsIgnoreCase("abc"))

def s4 = /a green sky/
def s5 = $/a blue tree/$
println(s4)
println(s5) 