public class DependencyInjection {

    private Car car;

    public DependencyInjection(Car car) {
        this.car = car;
    }

    public void test(){
        System.out.println("Test");
    }
}

class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }
}

class Demo{
    private DependencyInjection dependencyInjection;

    public Demo(DependencyInjection dependencyInjection) {
        this.dependencyInjection = dependencyInjection;
    }

    public void testDemo(){
        dependencyInjection.test();
    }
}

class XYZ {

//    All there are same we need to define only one

//    Field - Injection
    private Demo demo;

//    Constructor - Injection
    public XYZ(Demo demo) {
        this.demo = demo;
    }

//    Setter - Injection
    public void setDemo(Demo demo) {
        this.demo = demo;
    }

    public void testXYZ(){
        demo.testDemo();
    }
}

class T{
//    Just need to write this and call the function. It will automatically create it.
    private static XYZ x;

    public static void main(String[] args) {
//        XYZ x = new XYZ(
//                new Demo(
//                        new DependencyInjection(
//                                new Car("Tata Nexon")
//                        )
//                )
//        );

        x.testXYZ();
    }
}

/*
* Here XYZ dependent on Demo -> DependencyInjection -> Car.
* In order to run XYZ we need to provide all the dependency and need to manually create the Object.
* This all can be done by DI in Spring, we do not need to worry about instantiating the class object and consume them.
*  */



