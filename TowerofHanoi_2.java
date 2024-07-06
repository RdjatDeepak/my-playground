public class TowerofHanoi_2
{
    public static int Towers(int ndisc,int source,int auxiliary,int destination)
    {
        if(ndisc==1)
        {
            System.out.println("Move disc 1 from tower " + source + " to tower " + destination);
            return 1;
        }else{

        int move1=Towers(ndisc-1, source,  destination, auxiliary);
        System.out.println("Move disc " + ndisc + " from tower " + source + " to tower " + destination);
        int move2=Towers(ndisc-1, auxiliary, source, destination);
        return move1+move2+1;
        }
    }
    public static void main(String[] args) 
    {
        int result=Towers(4, 1, 2, 3);
        System.out.println("Total moves"+result);
    }
}