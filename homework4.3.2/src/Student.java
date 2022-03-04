public class Student {
    private String name;
    private String group;
    private String studentIdAnInt;

    public Student (String name, String group, String studentIdAnInt){
        this.name = name;
        this.group = group;
        this.studentIdAnInt = studentIdAnInt;
    }

    @Override
    public int hashCode(){
        return studentIdAnInt.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        Student student = (Student) obj;
        if(studentIdAnInt.equals(student.studentIdAnInt)){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return name + ", " + group + ", " + studentIdAnInt;
    }
}
