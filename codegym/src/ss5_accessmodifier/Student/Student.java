package ss5_accessmodifier.Student;

public class Student {
    private String name="John";
    private String classe="C02";
    public Student(){
    }

    public String getName() {
        return name;
    }

    public String getClasse() {
        return classe;
    }

    protected void setName(String name){
        this.name=name;
    }
    protected void setClasse(String classe){
        this.classe=classe;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classe='" + classe + '\'' +
                '}';
    }
}
