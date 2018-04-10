package practice10;


import java.util.*;

public class Teacher extends Person {
    private Set<Klass> classes=new HashSet<Klass>();

    public Teacher() {
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }


    public Teacher(int id, String name, int age, Set<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Set<Klass> getClasses() {
        return classes;
    }

    public void setClasses(Set<Klass> classes) {
        this.classes = classes;
    }

    @Override
    public String introduce() {
        String str="";
        int i=0;
        Iterator<Klass> iterator=classes.iterator();
        while(iterator.hasNext()){
            Klass item=iterator.next();
            if(i==classes.size()-1){
                str+=item.getNumber();
            }else{

                str+=item.getNumber()+", ";
            }
            i++;
        }
        String str1=super.introduce();
        if(classes.size()!=0){
            return str1+" I am a Teacher. I teach Class "+str+".";
        }else{
            return str1+" I am a Teacher. I teach No Class.";
        }

    }
    public boolean isTeaching(Student student){
        boolean flag=false;
        for(Klass item:classes){
            if(item.isIn(student)){
                flag=true;
                break;
            }
        }
        return  flag;
    }
    public String introduceWith(Student student){
        String str1=super.introduce();
        boolean flag=isTeaching(student);
        if(flag){
            return str1+" I am a Teacher. I teach " + student.getName() + ".";
        }else{
            return str1+" I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }
}
