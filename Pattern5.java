import java.util.Scanner;
public class Pattern5{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
for(int i=0;i<=a;i++)

{
for(int j=a;j>=i;j--)
System.out.print("#");
for(int s=0;s<=i;s++)
System.out.print("*");
System.out.println();
}
}
}