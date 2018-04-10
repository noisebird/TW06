package practice08;

public class Klass {
    private  int number;
    private Student leader;

    public Klass() {
    }

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public String getDisplayName(){
        return "Class "+getNumber();
    }

    public void assignLeader(Student student){
        setLeader(student);
    }
}
