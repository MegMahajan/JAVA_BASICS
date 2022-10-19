package staticPractice;

public class Student {
    static int count =10;
    Student(){
        count++;//incrementing the value of static variable
        System.out.println(count);
    }

    public static void main(String[] args) {
        Student s1 =new Student();
        Student s2 =new Student();
        Student s3 =new Student();
        //System.out.println(s1.toString());
    }

}
