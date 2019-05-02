package Day45_static_block_inheritance;

public class BlocksTest {
    public static void main(String[] args) {

        Blocks b = new Blocks();
        Blocks b1 = new Blocks();

        System.out.println(b.num);
        System.out.println(b.str);
        System.out.println(b1.num);
        System.out.println(b1.str);
        System.out.println(Blocks.num);
        System.out.println(Blocks.str);
        System.out.println(Blocks.num);
        System.out.println(Blocks.str);

    }
}
