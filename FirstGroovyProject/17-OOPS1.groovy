class Student {

    String name;
    int sub1Marks;
    int sub2Marks;

    static void main(args) {

        Student student1 = new Student();
        student1.name = "John"
        student1.sub1Marks = 88
        student1.sub2Marks = 77
        student1.printTotal()

        Student student2 = new Student();
        student2.name = "Amy"
        student2.sub1Marks = 100
        student2.sub2Marks = 200
        student2.printTotal()
    }

    def printTotal() {
        println("$name has total marks = " + (sub1Marks + sub2Marks))
    }
}