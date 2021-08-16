try{
    int num = 1/0
}catch(Exception exp){
    println "I am inside exception block"
    println "Exception is "+ exp
}

try{
    int num1 = 1/1
}catch(Exception exp1){
    println "I am inside exception block"
}catch(ArithmeticException exp1){
    println "I am inside block to catch arithmetic exception"
}
finally{
    println "I am inside finally block"
}
println "I am outside exception"