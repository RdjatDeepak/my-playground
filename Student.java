class Student
{
    int id,age;
    String name;
    Student(int i,String m)
    {
        id=i;
        name=m;
    }
    Student(int i,String m,int n)
    {
        id=i;
        name=m;
        age=n;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+age);
    }
    public static void main(String args[])
    {
        Student s1=new Student(11,"Deepak");
        Student s2=new Student(12,"Roshan",22);
        s1.display();
        s2.display();
    }

}