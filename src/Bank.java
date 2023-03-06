public class Bank {

    public Bank()
    {
        this("BOM","MAHB000",2120212020l,"Ambajogai");// chaining 2)
        //calling another const
        // of same class which has 3 String args & 1 long
        System.out.println("Calling parametrised cons in non-parametrised cons"); // 9)
    }
    public Bank(String name,String IFC,long phone,String Branch)
    {
        this("SBI","Pune"); //calling another const 3)
        // of same class which has 2 String args

        System.out.println("Bank Name: "+name+", Bank IFC: "+IFC+", Bank Phone: "+phone+", Bank Branch: "+Branch); // 8)
    }
    public Bank(String name,String Branch)
    {
        this(9898989898l,"AXIS"); // 4)
        //calling another const
        // of same class which has 1 String arg & 1 long arg
        System.out.println("Bank Name: "+name+", Bank Branch: "+Branch); // 7)
    }
    public Bank(long phone,String name)
    {
        // 5)
        System.out.println("Bank phone: "+phone+", Bank Name: "+name); // 6)
    }

    public static void main(String[] args) {
        Bank b1 = new Bank(); // 1)

    }
}
