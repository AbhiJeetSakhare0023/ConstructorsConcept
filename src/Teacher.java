public class Teacher {
    String name; // non-static global
    int age; // non-static global
    public Teacher(String tName,int tAge) // we can use all access modifiers
    {
        name=tName;
        age=tAge;
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Abhi",24);
        Teacher t2= new Teacher("Vaishu",21);
        Teacher t3 = new Teacher("Ajay",24);

        System.out.println("Name of 1st Teacher: "+t1.name+", Age :"+t1.age);
        System.out.println("Name of 2nd Teacher: "+t2.name+", Age :"+t2.age);
        System.out.println("Name of 3rd Teacher: "+t3.name+", Age :"+t3.age);
    }


}
