class practise
{
    int id;
    String name;
    String city;
    practise()
    {
        System.out.println("Default constructor is invoked");
    }
    practise(int id , String name)
    {
       this();
    this.id=id;
    this.name=name;
    }
    practise(int id,String name, String city)
    {
        this(id,name);
        this.city=city;
    }
    
    void display()
    {
        System.out.println(id+" "+name+" "+city);
    }
    public static void main(String args[])
    {
        practise p1=new practise(11,"Deepak");
        practise p2=new practise(22,"Roshan","Jaipur");
        p1.display();
        p2.display();
    }
} 