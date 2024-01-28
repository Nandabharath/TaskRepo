package OOPs_21st_Jan_2024;


 //
// class SortByIdAsc implements Comparator<> {


import java.util.Comparator;

class SortByIdAsc implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}

class  SortByDesc implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}

class SortbynameAsc implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
class  Sortbynamedesc implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getName().compareTo(o1.getName());
    }
}


public class Student implements Comparable<Student> {
    Integer id ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name ;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.id, o.id);
    }

    //    @Override
//    public int compareTo(Student o) {
//        return CharSequence.compare(this.name, o.name);
//    }
}
