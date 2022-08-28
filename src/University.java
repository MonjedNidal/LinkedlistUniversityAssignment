public class University {

    String name;
    College root;

    public University(String name) {
        this.name = name;
    }

    public void addCollege(College college) {
        College cur = root, prev = null;
            while(cur != null && cur.getName().compareTo(college.getName())<0){
                prev = cur;
                cur = cur.getNext();
            }
            if(prev == null){   // empty OR at head
                root = college;
                college.setNext(cur);
            }
            else{   // in between OR at tail
                prev.setNext(college);
                college.setNext(cur);
            }

    }

    public String findCollege(String college){
        if (root != null){
            College cur = root;
            while (cur != null){
                if (cur.getName().equals(college)){
                    return college+" college is found";
                }
                cur = cur.getNext();
            }
            return "College not found!";
        }else {
            return "There is no colleges yet!";
        }
    }
    public void deleteCollege(String name) {
        College prev = null;
        College curr = root;

        while (curr != null && !curr.getName().equals(name)) {
            prev = curr;
            curr = curr.getNext();
        }
        if (curr != null) {
            if (prev == null) {
                root = curr.getNext();
            } else {
                prev.setNext(curr.getNext());
            }
        } else {
            System.out.println("College not found!");
        }
    }
    public void printColleges(){
        if (root != null){
            College cur = root;
            System.out.println(name+" colleges : ");
            while (cur != null){
                System.out.println(cur.getName());
                cur = cur.getNext();
            }
        }
    }
}
