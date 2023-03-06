class Studentt {
    int rollno;
    String name;
    float fee;

    Studentt(int rollno, String name, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + fee);
    }


    public static void main(String args[]) {
        Studentt s1 = new Studentt(111, "ankit", 5000f);//0 null 0.0-- if not this keyword
        Studentt s2 = new Studentt(112, "sumit", 6000f);//0 null 0.0-- if not this keyword
        s1.display();
        s2.display();
    }
}