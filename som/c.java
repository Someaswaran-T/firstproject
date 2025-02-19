class A{
A()
{
System.out.println("hello");
}
}
class B{

B()
{
System.out.println("selva");
}
}
class C{
public static void main(String args[]){
B p=new B();
}
}
//its only work for b's base class
//output is hello selva