import java.util.Scanner;
class Factors1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
int count=0;
for(int i=1;i<=p;i++){
if(p%i==0){
count++;
System.out.print(i);
if(i!=p)
System.out.print(",");
}
}
System.out.println("\n Count of factors of "+p+" is "+count);
}
}