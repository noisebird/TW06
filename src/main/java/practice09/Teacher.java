package practice09;


public class Teacher extends Person {
    private Klass klass;

    public Teacher() {
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
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
        if(klass!=null){
            return str+" I am a Teacher. I teach "+klass.getDisplayName()+".";
        }else{
            return str+" I am a Teacher. I teach No Class.";
        }

    }
    public String introduceWith(Student student){
        String str=super.introduce();
        if(student.getKlass().getNumber()==klass.getNumber()){
            return str+" I am a Teacher. I teach " + student.getName() + ".";
        }else{
            return str+" I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }
}
