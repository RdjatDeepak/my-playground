abstract class Animal
{
    public void displayinfo()
    {
        System.out.println("I am an animal.");
    }
    abstract void eat();
}
    abstract class Dog extends Animal
    {
        void eat()
        {
            System.out.println("Dog eat good and healthy food");
        }
    }
        
class main{
    public static void main(String[] args) {
         Labrador labrador = new Labrador();
        labrador.displayinfo();
        labrador.eat();
            
    }
}
class labrador extends Dog
{

}