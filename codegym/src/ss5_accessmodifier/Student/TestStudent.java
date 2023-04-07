package ss5_accessmodifier.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student st=new Student();
        st.setName("tai");
        System.out.println("Lớp hiện tại "+st.toString());
        st.setClasse("c03");
        System.out.println("Lớp tháng sau "+st.toString());

    }
}
