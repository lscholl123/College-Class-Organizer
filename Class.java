public class Class extends Department {

   private int number;
   private String name;
   private String semester;

    public Class(String nameCollege, String deanName, String abbr, int number, String name, String semester) {
        super(nameCollege, deanName, abbr);
        this.name=name;
        this.semester=semester;
        this.number=number;
    }
//setters and getters for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//returns string of class information
    @Override
    public String toString() {
        return "Class " +
                "number = " + number +
                ", name = '" + name + '\'' +
                ", semester = " + semester;
    }
//setters and getters for class number
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }



}
