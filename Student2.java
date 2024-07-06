class Student2
{
    int rollnum;
    String name;
    static String college="GU";
    static void change()
    {
        college="Delhi tech uni";
    }
    Student2(int n,String m)
    {
        rollnum=n;
        name=m;
    }
    void display()
    {
        System.out.println(rollnum+" "+name+" "+college);
    }
    public static void main(String args[])
    {
        Student2.change();
        Student2 s1= new Student2(111,"Karan");
        Student2 s2 = new Student2(222,"Aryan");
        Student2 s3=new Student2(333,"Sonoo");
        s1.display();
        s2.display();
        s3.display();
    }
}