 abstract class bank
{ 
    abstract int getrateofintrest();
}
class Sbi extends bank
{
    int getRateOfInterest()
    {
        return 7.5;
    }
}
class PNb extends bank
{
    int getRateOfInterest()
    {
        return 7;
    }
}
class testbank
{
    public static void main(String args[])
    {
        bank b=new sbi();
        int intrest=b.getRateOfInterest();
        System.out.println("Rate of intrest : "+intrest+"%");
    }
}
