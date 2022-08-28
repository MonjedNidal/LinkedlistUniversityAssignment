public class Main {

    public static void main(String[] args) {
        University university = new University("Khadoori");
        College art = new College("Art");
        College science = new College("Science");
        College business = new College("Business");

        university.addCollege(art);
        university.addCollege(science);
        university.addCollege(business);
        System.out.println(university.findCollege("Science"));
        university.deleteCollege("Business");
        university.printColleges();

        System.out.println("------------------");

        Division physics = new Division("Physics");
        Division biology = new Division("Biology");
        science.addDivision(physics);
        science.addDivision(biology);
        science.deleteDivision("Biology");
        science.printDivisions();

        System.out.println("------------------");

        Teacher alaa = new Teacher("Alaa","Mechanics",43);
        Teacher mohammad = new Teacher("Mohammad","Quantum",36);
        Teacher ahmad = new Teacher("Ahmad","General Physics", 47);
        physics.addTeacher(alaa);
        physics.addTeacher(mohammad);
        physics.addTeacher(ahmad);
//        div1.deleteTeacher();
        physics.printTeachers();
        System.out.println(physics.findTeacher("Alaa"));
//        System.out.println("------------------");

        Student ali = new Student("Ali","Ramallah",21, 95.5);
        Student mostafa = new Student("Mostafa","Nablus",22, 89.3);
        Student Rami = new Student("Rami","Hebron",20, 83.8);
        physics.addStudent(ali);
        physics.addStudent(mostafa);
        physics.addStudent(Rami);
        physics.printStudents();
        System.out.println(physics.findStudent("Ali"));

        System.out.println("------------------");

        alaa.teacherInfo();
    }

}
