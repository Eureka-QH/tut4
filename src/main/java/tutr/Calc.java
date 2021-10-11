package tutr;

import java.util.Scanner;

public class Calc
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int arg0 = input.nextInt();
        int arg1 = input.nextInt();
        int arg2 = input.nextInt();
        int arg3 = input.nextInt();
        add( arg1,arg2);
        subtract(arg2,arg3);
    }
    public static int add(int arg0,int arg1)
    {
        return arg0+arg1;
    }
    public static int subtract(int arg2, int arg3 )
    {

        return arg2+arg3;
    }

}
