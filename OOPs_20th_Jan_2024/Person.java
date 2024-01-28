package OOPs_20th_Jan_2024;

public class Person {
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private Integer age;
    public String getname(){
        return  name;
    }
}
