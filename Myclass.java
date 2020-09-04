package pass;

class MyClass {    static MyClass ref;    String[] arguments;    public static void main(String[] args) {        ref = new MyClass();        ref.func(args);    }    public void func(String[] args) {        ref.arguments = args;    } }