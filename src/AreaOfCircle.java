public class AreaOfCircle {
   static double pie=3.14; // because 3.14 never change for anybody
    // it is const for whole universe hence we use static
    float radius; // radius user can change it he hence uses as non-static
    public AreaOfCircle(float radius) // uses parametrised cons for initialising non-static var
    {
        this.radius=radius; // uses this. to avoid ambiguity prblm between class var & object var 3)
    }
    public static double getArea() // uses static method for returning result
    {
        AreaOfCircle a1 = new AreaOfCircle(100); // created object & passing radius to cons 2)
        return (pie*a1.radius*a1.radius); // returning result // accessing non-static var using object 4)
    }

    public static void main(String[] args) {
        float result= (float) getArea(); // casting & calling static method 1) ,5)
        System.out.println("Area of Circle of Provided Radius = "+result); // 6)
    }

}
