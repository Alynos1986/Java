package Day45_static_block_inheritance;

import javax.sound.midi.Soundbank;

public class DefaultValues {
    public int intValue;
    public byte byteValue;
    public double doubleValue;
    public boolean booleanValue;
    public char charValue;
    public String stringValue;
    public Integer integerValue;

    public static void main(String[] args) {
        System.out.println();
        DefaultValues d = new DefaultValues();
        System.out.println(d.intValue);
        System.out.println(d.byteValue);
        System.out.println(d.doubleValue);
        System.out.println(d.booleanValue);
        System.out.println(d.charValue);
        System.out.println(d.stringValue);
        System.out.println(d.integerValue);
        System.out.println(d.intValue +101);
        d.stringValue = "Hello World";
        System.out.println(d.stringValue.toUpperCase());
    }
}
