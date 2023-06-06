package Native;

import java.util.Scanner;

public class Input {
    public native boolean check(int num);
    static{
        System.loadLibrary("arm"); 
        //arm.lib
        //this method load the library file of c/c++ in native method area.
        //System  syntax: public static void loadLibrary(String libfilename)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        boolean bb = new Input().check(num);
        if (bb==true) {
            System.out.println(num+"is an armstrong number");
        }
        else{
            System.out.println(num+"is not an armstrong number");
        }

    }
}
