import java.util.Scanner;
class Factors{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
for(int i=1;i<=p;i++)
if(p%i==0){


System.out.print(i);
if(i!=p)
System.out.print(",");
}
}
}