import java.util.Scanner;
public class OneDArray {
public static void main(String[] args) {
int marks[] = {10, 20, 30, 40, 50};
for (int i = 0; i < marks.length; i++) {
System.out.println(marks[i]);
}
int[] age=new int[5];
Scanner sc= new Scanner (System.in);
for (int i = 0; i < age.length; i++)
{
System.out.print("enter the age of " + i + "person" + ": ");
age[i] = sc.nextInt();
}
for (int i = 0; i < age.length; i++) {
System.out.println(age[i]);
}
}
}