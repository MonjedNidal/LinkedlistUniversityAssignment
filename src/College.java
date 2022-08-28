public class College {


    private String name;
    private Division root;
    private College next;

    public College(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public College getNext() {
        return next;
    }
    public void setNext(College next) {
        this.next = next;
    }


    public void addDivision(Division division) {

        Division cur = root, prev = null;
        while(cur != null && cur.getName().compareTo(division.getName())<0){
            prev = cur;
            cur = cur.getNext();
        }
        if(prev == null){   // empty OR at head
            root = division;
            division.setNext(cur);
        }
        else{   // in between OR at tail
            prev.setNext(division);
            division.setNext(cur);
        }
    }

    public String findDivision(String division){
        if (root != null){
            Division cur = root;
            while (cur != null){
                if (cur.getName().equals(division)){
                    return division;
                }
                cur = cur.getNext();
            }
            return "Division not found!";
        }else {
            return "There is no divisions yet!";
        }
    }
    public void deleteDivision(String name) {
        Division prev = null;
        Division curr = root;

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
            System.out.println("Division not found!");
        }
    }

    public void printDivisions(){
        if (root != null){
            Division cur = root;
            System.out.println(name+" College divisions : ");
            while (cur != null){
                System.out.println(cur.getName());
                cur = cur.getNext();
            }
        }
    }

}
