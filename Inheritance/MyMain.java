public class MyMain {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c = new ClassC();
        ClassD d = new ClassD ();
        ClassE e = new ClassE ();
        c.callMyMethod(a); // Output: Method from ClassA
        c.callMyMethod(b); // Output: Method from ClassB
        c.callMyMethod(d); // Output: Method from ClassD
        c.callMyMethod(e); // Output: Method from ClassE
    }
}