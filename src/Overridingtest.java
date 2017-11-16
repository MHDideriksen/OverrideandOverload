public class Overridingtest  {

    public static void main(String[] args) {
Cycle cycle=new Cycle();
cycle.printInfo();
Bicycle bicycle=new Bicycle();
        bicycle.printInfo();
    }
}
//Dette er SuperClass'en
class Cycle
{
    int weight=10;
    //Dette er metoderne
    public void printInfo()
    {
        System.out.println("superclass"+ weight);
    }
}
//Dette er SubClass'en
class Bicycle extends Cycle
{
    String brand="hero";
    //Dette er metoderne
    public void printInfo()
    {
        System.out.println("subclass" + brand);
    }
}
