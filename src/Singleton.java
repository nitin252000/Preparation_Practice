public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {
        System.out.println("Singleton Object is created");
    }

    public static Singleton getInstance() {

        if (instance == null) {

            synchronized (Singleton.class) {

                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
    public void show(){
        System.out.println("Hello from Singleton Object");
    }


public static void main(String[] args) {
    Singleton s1=Singleton.getInstance();
    Singleton s2=Singleton.getInstance();
    Singleton s3=Singleton.getInstance();
    s1.show();
    System.out.println("HashCode of s1 : " + s1.hashCode());
    System.out.println("HashCode of s2 : " + s2.hashCode());
    System.out.println("HashCode of s3 : " + s3.hashCode());

    System.out.println("s1 == s2 : " + (s1 == s2));
    System.out.println("s2 == s3 : " + (s2 == s3));

}}