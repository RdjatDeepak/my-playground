class Address
{
    String state,city,country;
    public Address(String state,String city,String country)
    {
        this.state=state;
        this.city=city;
        this.country=country;
    }
}
public class Emp
{
    int id;
    String name;
    Address address;  //aggregation
    public Emp(int id,String name,Address address)
    {
        this.id=id;
        this.name=name;
        this.address=address;
    }
    void display()
    {
        System.out.print(id+"  "+name);
        System.out.println(" " +address.state+"  "+address.city+"  "+address.country);
    }
    public static void main(String args[])
    {
        Address address1=new Address("Rajsthan","jaipur","India");
        Address address2=new Address("Up","noida","India");
        Emp e=new Emp(11,"Deepak",address1);
        Emp e2=new Emp(12,"Vivek",address2);
        e.display();
        e2.display();
    }
}