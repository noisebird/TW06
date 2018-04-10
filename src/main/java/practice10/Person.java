package practice10;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person() {
        super();
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String introduce() {

        return "My name is "+name+". I am "+age+" years old.";
    }

    @Override
    public boolean equals(Object obj) {

        Person person=(Person) obj;

        if (person!=null && this.id == person.getId()) {
            return true;
        }
        return false;

    }
}
