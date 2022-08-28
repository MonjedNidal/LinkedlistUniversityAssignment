public class Student {

    private String name;
    private String address;
    private int age;
    private double grade;
    private Student next;

    public Student(String name, String address, int age, double grade) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Student getNext() {
        return next;
    }

    public void setNext(Student next) {
        this.next = next;
    }

    public void studentInfo(){
        System.out.println("Student "+name+" grade is "+grade+" and he lives in "+address+" and his age is "+age+" years old");
    }
}
