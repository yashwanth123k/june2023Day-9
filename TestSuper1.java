class Animal1{
String color="blue";
}
class Dog extends Animal1{
String color="green";
void printColor(){
System.out.println(color);
System.out.println(super.color);
}
}
class  TestSuper1{
public static void main(String args[]){
Dog d=new Dog();
d.printColor();
}
}
