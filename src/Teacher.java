public class Teacher {
    private String name;
    private String specialty;
    private int age;
    private Teacher next;

    public Teacher(String name, String specialty, int age) {
        this.name = name;
        this.specialty = specialty;
        this.age = age;
    }

    public Teacher getNext() {
        return next;
    }
    public void setNext(Teacher next) {
        this.next = next;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void teacherInfo(){
        System.out.println("Teacher "+name+" specialty is "+specialty+" and his age is "+age+" years old");
    }
}
