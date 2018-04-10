package practice04;

public class Student extends Person {
    private int klass;

    public Student() {
    }

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String str=super.basicIntroduce();
        return str+" I am a Student. I am at Class "+klass+".";
    }
}
