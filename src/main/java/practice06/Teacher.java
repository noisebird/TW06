package practice06;

public class Teacher extends Person {
    private int klass;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
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
        String str=super.introduce();
        if(klass!=0){
            return str+" I am a Teacher. I teach Class "+klass+".";
        }else{
            return str+" I am a Teacher. I teach No Class.";
        }

    }
}
