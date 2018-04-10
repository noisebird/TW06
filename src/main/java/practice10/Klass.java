package practice10;

import java.util.HashMap;
import java.util.Map;

public class Klass {
    private  int number;
    private Student leader;
    private Map<Integer, Student> mapnew=new  HashMap<Integer, Student>();

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
        if(mapnew.containsKey(student.getId())){
            setLeader(student);
        }else{
            System.out.println("It is not one of us.");
        }
    }
    public void appendMember(Student student) {
       mapnew.put(student.getId(),student);
    }
    public boolean isIn(Student student){
        if(this.getNumber()==student.getKlass().getNumber()){
            return true;
        }
        return false;
    }
}
