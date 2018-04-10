package practice11;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Teacher extends Person {
    private Set<Klass> classes = new HashSet<Klass>();

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
        String str = "";
        int i = 0;
        Iterator<Klass> iterator = classes.iterator();
        while (iterator.hasNext()) {
            Klass item = iterator.next();
            if (i == classes.size() - 1) {
                str += item.getNumber();
            } else {
                str += item.getNumber() + ", ";
            }
            i++;
        }
        if (classes.size() != 0) {
            return "My name is "+super.getName()+". I am "+super.getAge()+" years old. I am a Teacher. I teach Class "+str+".";
        } else {
            return "My name is " + super.getName() + ". I am " + super.getAge() + " years old. I am a Teacher. I teach No Class.";
        }

    }

    public boolean isTeaching(Student student) {
        boolean flag = false;
        for (Klass item : classes) {
            if (item.isIn(student)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public String introduceWith(Student student) {
        boolean flag = isTeaching(student);
        String str = super.introduce();
        if (flag) {
            return str + " I am a Teacher. I teach " + student.getName() + ".";
        } else {
            return str + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }

    public void knowLeader(Student student) {
        System.out.println("I am Tom. I know " + student.getName() + " become Leader of Class " + student.getKlass().getNumber() + ".");
    }

    public void knowMember(Student student) {
        System.out.println("I am Tom. I know " + student.getName() + " has joined Class " + student.getKlass().getNumber() + ".");
    }
}
