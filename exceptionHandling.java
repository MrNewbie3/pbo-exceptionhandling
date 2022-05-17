package exception;

import java.util.Scanner;

public class exceptionHandling {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the value for c");
        try {
            int c = console.nextInt();
            int res=c/0;
            System.out.println(" The result is "+res);
        }
        catch (Exception exception_message){
            System.out.println("adalah = "+exception_message);
        }
    }
}
