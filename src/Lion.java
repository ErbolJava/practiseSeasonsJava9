public class Lion {
    private int age;

    @Override
    public String toString() {
        return "Lion{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lion(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
