package practice09;

public class Student extends Person {
    private Klass klass;

    public Student() {
    }

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String str=super.introduce();
        if (klass.getLeader()!=null && klass.getLeader().getName().equals(this.getName())) {

            return str + " I am a Student. I am Leader of " + klass.getDisplayName() + ".";
        } else {
            return str + " I am a Student. I am at " + klass.getDisplayName() + ".";
        }
    }

}
