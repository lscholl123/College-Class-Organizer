public class Department extends College {

   private String abbreviation;

   public Department(String nameCollege, String deanName, String abbr) {
       super(nameCollege, deanName);
       this.abbreviation=abbr;
       }
//getter and setter for abbreviation
    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
//print out college and dean name
    @Override
    public void print() {
        System.out.println("College of " +getNameCollege()+ ", Dean: "+ getDeanName());
    }
}

