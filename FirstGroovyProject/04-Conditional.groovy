
def num = 11

if (num % 2 == 0) {
    println("num is + pos")
} else {
    println("num is - neg")
}

// switch-case
def x = 10
def result = ""

switch(x) {
    case 0:
        result = "x is zero"
        break
    case {x > 0}:
        result = "x is + pos"
        break
    case {x < 0}:
        result = "x is - neg"
        break
    default:
        result = "Invalid number"
}

