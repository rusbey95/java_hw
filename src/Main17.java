public class Main17 {
    public static void main(String[] args) {

        // hw task 3
        byte    a = 2;
        short   b = -3;
        int     c = 120;
        long    d = 1000000000L;
        float   e = 20.1F;
        double  f = 3.4;
        boolean g = true;
        char    h = 234;

        System.out.println("Primitive type - byte = " + a);
        System.out.println("Primitive type - short = " + b);
        System.out.println("Primitive type - int = " + c);
        System.out.println("Primitive type - long = " + d);
        System.out.println("Primitive type - float = " + e);
        System.out.println("Primitive type - double = " + f);
        System.out.println("Primitive type - boolean = " + g);
        System.out.println("Primitive type - char = " + h);

        // hw task 4
        int number = 345;
        int number2 = number / 100;
        int number3 = number / 10 % 10;
        int number4 = (number / 1 % 100) % 10;
        System.out.println(number2 + "; " + number3 + "; " + number4);


    }
}