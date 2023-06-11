class Main1{
public static void main(String args[]){
int[] numbers ={2,-9,0,5,12,-25,22,9,8,12};
Double average;
for(int number:numbers)
{
sum+=number;
}
int arrayLength=numbers.length;
Double average=((double)sum/(double)arrayLength);
System.out.print("Sum="+sum);
System.out.print("Average="+average);
}
}
