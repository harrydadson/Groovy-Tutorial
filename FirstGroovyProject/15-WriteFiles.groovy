

File myfile = new File("<file path>")
myfile.write("This is line 1")
myfile << "\nThis is line 2"

// myfile.text = "This is line 3" overwrites everything

// myfile.withWriter{
//     writer -> writer.writeLine("This is line 4")
// } overwrites everythin

myfile.append("This is Line 5")

println(myfile.length())
println(myfile.isFile())
println(myfile.isDirectory())
println(myfile.isHidden())

// copy file into new file
def newFile = new File("<file path>")
newFile << myfile.text 

// remove file contents
//myfile.bytes = []

// rename
// myfile.renameTo(new File("newFile.txt"))

println(myfile.text)