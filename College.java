public abstract class College {

    private String nameCollege;
    private String deanName;

    // getters and setters for college and dean name
    public void setNameCollege(String nameCollege) {
        this.nameCollege=nameCollege;
    }

    public String getNameCollege() {
        return nameCollege;
    }
    public String getDeanName() {
        return deanName;
    }

    public void setDeanName(String deanName) {
        this.deanName = deanName;
    }

    public College(String nameCollege, String deanName) {
        this.nameCollege=nameCollege;
        this.deanName=deanName;
    }

    public abstract void print();
}
