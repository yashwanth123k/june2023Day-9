import java.util.Scanner;
import java.util.Arrays;

class SortElement1{
public static void main(String args[]){
int n,z=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no. of elements you want in array:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter all the elements:");
for(z=0;z<n;z++)
{    
a[z]=sc.nextInt();
}
for(int i=0;i<a.length;i++){
for(int j=i+1;j<a.length;j++)
{
int temp=0;
if(a[i]<a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;}
}
}
for(int x:a) System.out.println(x+"");
}
}