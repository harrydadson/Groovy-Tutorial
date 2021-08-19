// how to read file sin groovy

// reading file as String
String filePath = "file path>"
File myfile = new File(filePath)
println(myfile.text)

// collect lines into a list
def lst = myfile.collect{ it }
println("list: $lst")

// store file content in an array
def arr = myfile as String[]
println("array: $arr")

// read file into a list of string
def lines = myfile.readLines()
println("lines: $lines")

// read file line by line
myfile.eachLine{ line -> println("line: $line")}

// read file line by line by linenumber
myfile.eachLine{ line, lineNo -> println("$lineNo: $line")}

// reader with reader
def line1
myfile.withReader {
    reader -> while((line1 = reader.readLine()) != null) {
        println("line1: $line1")
    }
}

// reading with new reader
def outputFile = "<file path>"
def reader = myfile.newReader()
new File(outputFile).append(reader)
reader.close()

// working with binary files, read contents as bytes
byte[] contents = myfile.bytes
println contents

// size in bytes
println(myfile.length())

// check if is a file or dir
println(myfile.isFile())
println(myfile.isDirectory())

// get list of all files in a dir
new File("<dir path>").eachFile{
    files -> println(files.getAbsolutePath())
}

// recursively display all files in a dir & its sub-dir
new File("<dir path>").eachFileRecurse{
    files -> println(files.getAbsolutePath())
}

// copy file data to another file
def newFile = new File("<file path>")
newFile << myfile.text
