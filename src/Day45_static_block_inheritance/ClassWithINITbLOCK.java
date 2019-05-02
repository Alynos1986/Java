package Day45_static_block_inheritance;

public class ClassWithINITbLOCK {
    {
        System.out.println("This is Initializer block. I run automatically every time object is created");
    }
    public ClassWithINITbLOCK(){
        System.out.println("This is a constructor. I run every time object is created");
    }

}
