public class Singleton {

    private static Singleton singleton;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }

        return singleton;
    }}

class A{

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1.equals(s2));

    }
}
