public  class Student extends Person {
    private double gpa;
    private int id;


    public Student() {
        super();
    }

    @Override
    public int compareTo(Person other) {
        return super.compareTo(other);
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        if(this.gpa> 2.67) return 36660.0;
        else return  0.0;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String getPosition() {
        return "Student";
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}