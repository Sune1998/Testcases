public class Testcases {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        int z = 3;

        boolean a = x <= 5 && z != y;

        //test til a
        if(a == true)
            System.out.println("A pass");
        else System.out.println("A fail");

        //boolean b
        boolean b = x == 5 || x == y && z == 3;

        //test til b
        if(b == true)
            System.out.println("b pass");
        else System.out.println("b fail");

        //boolean c
        boolean c = x / y > z / x;

        //test til c
        if (c == false)
            System.out.println("c pass");
        else System.out.println("c fail");

        //boolean d
        boolean d = !(x != y - z) == false;

        //test til d
        if (d == false)
            System.out.println("d pass");
        else System.out.println("d fail");

        //boolean e
        boolean e = 2 * x != x || x == 0;

        //test til e
        if (e == true)
            System.out.println("e pass");
        else System.out.println("e fail");

        //boolean f
        boolean f = ! true || ! false;

        //test til f
        if (f == true)
            System.out.println("f pass");
        else System.out.println("f fail");





    }




}
