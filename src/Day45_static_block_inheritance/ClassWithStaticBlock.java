package Day45_static_block_inheritance;

public class ClassWithStaticBlock {
    static {
        System.out.println("This is static block. I run once in the beginning");
    }
    public ClassWithStaticBlock(){
        System.out.println("This is a constructor. I run every time an object is created");
    }
    public static void staticMethod(){
        System.out.println("This is static method");
    }
}
