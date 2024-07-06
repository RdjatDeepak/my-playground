abstract class bike
{
    bike()
    {
        System.out.println("Bike is created");
    }
    abstract void run();
    void changegear()
    {
        System.out.println("gear is changed");
    }
}
class honda extends bike
{
    void run()
    {
        System.out.println("Run safely");
    }
}
class testabstraction
{
    public static void main(String args[])
    {
        bike obj=new honda();
        obj.run();
        obj.changegear();
        
    }
}