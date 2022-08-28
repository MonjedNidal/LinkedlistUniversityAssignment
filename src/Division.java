public class Division {

    private String name;
    private Teacher teacherRoot;
    private Student studentRoot;
    private Division next;

    public Division(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Division getNext() {
        return next;
    }
    public void setNext(Division next) {
        this.next = next;
    }


    public void addTeacher(Teacher teacher){
        Teacher cur = teacherRoot, prev = null;
        while(cur != null && cur.getName().compareTo(teacher.getName())<0){
            prev = cur;
            cur = cur.getNext();
        }
        if(prev == null){   // empty OR at head
            teacherRoot = teacher;
            teacher.setNext(cur);
        }
        else{   // in between OR at tail
            prev.setNext(teacher);
            teacher.setNext(cur);
        }
    }
    public String findTeacher(String teacher){
        if (teacherRoot != null){
            Teacher cur = teacherRoot;
            while (cur != null){
                if (cur.getName().equals(teacher)){
                    return "Teacher "+teacher+" is found.";
                }
                cur = cur.getNext();
            }
            return "Teacher not found!";
        }else {
            return "There is no teachers yet!";
        }
    }
    public void deleteTeacher(String name) {
        Teacher prev = null;
        Teacher curr = teacherRoot;

        while (curr != null && !curr.getName().equals(name)) {
            prev = curr;
            curr = curr.getNext();
        }
        if (curr != null) {
            if (prev == null) {
                teacherRoot = curr.getNext();
            } else {
                prev.setNext(curr.getNext());
            }
        } else {
            System.out.println("Teacher not found!");
        }
    }
    public void printTeachers(){
        if (teacherRoot != null){
            Teacher cur = teacherRoot;
            System.out.println(name+" division teachers : ");
            while (cur != null){
                System.out.println(cur.getName());
                cur = cur.getNext();
            }
        }
    }


    public void addStudent(Student student){
        Student cur = studentRoot, prev = null;
        while(cur != null && cur.getName().compareTo(student.getName())<0){
            prev = cur;
            cur = cur.getNext();
        }
        if(prev == null){   // empty OR at head
            studentRoot = student;
            student.setNext(cur);
        }
        else{   // in between OR at tail
            prev.setNext(student);
            student.setNext(cur);
        }
    }
    public String findStudent(String student){
        if (studentRoot != null){
            Student cur = studentRoot;
            while (cur != null){
                if (cur.getName().equals(student)){
                    return "Student "+student+" is found.";
                }
                cur = cur.getNext();
            }
            return "Student not found!";
        }else {
            return "There is no Students yet!";
        }
    }
    public void deleteStudent(String name) {
        Student prev = null;
        Student curr = studentRoot;

        while (curr != null && !curr.getName().equals(name)) {
            prev = curr;
            curr = curr.getNext();
        }
        if (curr != null) {
            if (prev == null) {
                studentRoot = curr.getNext();
            } else {
                prev.setNext(curr.getNext());
            }
        } else {
            System.out.println("Student not found!");
        }
    }
    public void printStudents(){
        if (studentRoot != null){
            Student cur = studentRoot;
            System.out.println(name+" division students : ");
            while (cur != null){
                System.out.println(cur.getName());
                cur = cur.getNext();
            }
        }
    }
}
