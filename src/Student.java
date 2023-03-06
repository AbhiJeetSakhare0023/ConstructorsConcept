public class Student {
    String name; // non-static global
    int age;// non-static global

    public Student()// non-parameterised
    {
        name="Abhii";
        age=23;
    }
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2= new Student();
        Student s3 = new Student();

        System.out.println("Name of 1st Student: "+s1.name+" , Age :"+s1.age);
        System.out.println("Name of 2nd Student: "+s2.name+" , Age :"+s2.age);
        System.out.println("Name of 3rd Student: "+s3.name+" , Age :"+s3.age);

    }
}
