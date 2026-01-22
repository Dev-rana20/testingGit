package OOP;
public class WrapperClass {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(10);
        //Integer c = new Integer(10);
        Integer a=10;
        System.out.println(i+a);

        Byte b = Byte.valueOf("15");
        System.out.println(b);
        Byte c = 10;
        Byte bb =16;
        Byte e= Byte.valueOf(bb);

        Float f= 12.4f;
        Float g= Float.valueOf("14.67");
        float x =f.floatValue();
        float y =f;

        Double h= Double.valueOf(123.456);
        Character k = Character.valueOf('S');
        Boolean l= Boolean.valueOf("true");


        //Boxing & Unboxing auto and Mannual
        int m=10;
        Integer n = Integer.valueOf(m);
        Integer o=m;
        int p =n;
        int q=o.intValue();

    }
}
