import java.lang.ref.SoftReference;
import java.util.LinkedList;

public class UnitTests {

    public static void main(String args[]) {

        printTest();
        printLinkedListTest();
        abbreviationTest();
        nameTest();
        toStringTest();
        numberTest();
        binaryTest();
        sortTest();
        getTest();


    }

    public static void printTest() {
        Department department = new Department("Engineering", "John Smith", "CS");
        department.print();
    }

    public static void printLinkedListTest() {
        Class subject = new Class("Engineering", "John Smith", "CS", 108, "CompSci", "Spring");
        LinkedList<Class> classList = new LinkedList<>();
        classList.add(new Class("Engineering", "Smith", "CS", 101, "Intro to Comp Sci", "Summer"));
        classList.add(new Class("Engineering", "Smith", "CS", 150, "Computer Programming", "Spring"));
        classList.add(new Class("Engineering", "Smith", "CS", 105, "Intermediate Comp Sci", "Fall"));
        classList.add(new Class("Engineering", "Smith", "CS", 130, "Intro to Python", "Winter"));
        classList.add(new Class("Engineering", "Smith", "CS", 250, "Data Analysis", "Spring"));
        classList.add(subject);
        ClassList classes = new ClassList(classList);
        classes.InsertionSort(classList);
        classes.printLinkedList(classList);
    }

    public static void abbreviationTest() {
        Department department = new Department("Engineering", "John Smith", "CS");
        department.setAbbreviation("BS");
        if (department.getAbbreviation().equals("BS")) {
            System.out.println("Success abbreviation");
        } else {
            System.out.println("Failed abbreviation");
        }
    }

    public static void nameTest() {
        Class subject = new Class("Engineering", "John Smith", "CS", 108, "CompSci", "Spring");
        subject.setName("Marketing");
        if (subject.getName().equals("Marketing")) {
            System.out.println("Success name");
        } else {
            System.out.println("Failed name");
        }
    }

    public static void toStringTest() {
        Class subject = new Class("Engineering", "John Smith", "CS", 108, "CompSci", "Spring");
        if (subject.toString().equals("Class number = 108, name = 'CompSci', semester = Spring")) {
            System.out.println("Success toString");
        } else {
            System.out.println("Failed toString");
        }
    }

    public static void numberTest() {
        Class subject = new Class("Engineering", "John Smith", "CS", 108, "CompSci", "Spring");
        subject.setNumber(50);
        if (subject.getNumber()==50) {
            System.out.println("Success number");
        } else {
            System.out.println("Failed number");
        }
    }

    public static void binaryTest() {
        LinkedList<Class> classList = new LinkedList<>();
        classList.add(new Class("Engineering", "Smith", "CS", 101, "Intro to Comp Sci", "Summer"));
        classList.add(new Class("Engineering", "Smith", "CS", 150, "Computer Programming", "Spring"));
        classList.add(new Class("Engineering", "Smith", "CS", 105, "Intermediate Comp Sci", "Fall"));
        classList.add(new Class("Engineering", "Smith", "CS", 130, "Intro to Python", "Winter"));
        classList.add(new Class("Engineering", "Smith", "CS", 250, "Data Analysis", "Spring"));
        Class subject = new Class("Engineering", "John Smith", "CS", 108, "CompSci", "Spring");
        classList.add(subject);
        ClassList classes = new ClassList(classList);
        if(classes.get(classes.BinarySearch(classList, 0, classList.size(), 108)).toString().equals("Class number = 108, name = 'CompSci', semester = Spring")) {
            System.out.println("Success Binary Search");
        }
        else {
            System.out.println("Failed Binary Search");
        }
    }
        public static void sortTest() {
            Class subject = new Class("Engineering", "John Smith", "CS", 108, "CompSci", "Spring");
            LinkedList<Class> classList = new LinkedList<>();
             classList.add(new Class("Engineering", "Smith", "CS", 101, "Intro to Comp Sci", "Summer"));
             classList.add(new Class("Engineering", "Smith", "CS", 150, "Computer Programming", "Spring"));
             classList.add(new Class("Engineering", "Smith", "CS", 105, "Intermediate Comp Sci", "Fall"));
             classList.add(new Class("Engineering", "Smith", "CS", 130, "Intro to Python", "Winter"));
             classList.add(new Class("Engineering", "Smith", "CS", 250, "Data Analysis", "Spring"));
                classList.add(subject);
                ClassList classes = new ClassList(classList);
                classes.InsertionSort(classList);
                if(classList.get(0).toString().equals("Class number = 101, name = 'Intro to Comp Sci', semester = Summer")) {
                    System.out.println("Success sort");
                }
                else{
                    System.out.println("Failed sort");
                }
        }
        public static void getTest() {
            Class subject = new Class("Engineering", "John Smith", "CS", 108, "CompSci", "Spring");
            LinkedList<Class> classList = new LinkedList<>();
            classList.add(new Class("Engineering", "Smith", "CS", 101, "Intro to Comp Sci", "Summer"));
            classList.add(new Class("Engineering", "Smith", "CS", 150, "Computer Programming", "Spring"));
            classList.add(new Class("Engineering", "Smith", "CS", 105, "Intermediate Comp Sci", "Fall"));
            classList.add(new Class("Engineering", "Smith", "CS", 130, "Intro to Python", "Winter"));
            classList.add(new Class("Engineering", "Smith", "CS", 250, "Data Analysis", "Spring"));
            classList.add(subject);
            ClassList classes = new ClassList(classList);
            if(classList.get(0).toString().equals("Class number = 101, name = 'Intro to Comp Sci', semester = Summer")) {
                System.out.println("Success get");
            }
            else{
                System.out.println("Failed get");
            }
        }

}


