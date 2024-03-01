package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static String FizzBuzz(int n){
        if(n%3==0 && n%5==0){
            return"FizzBuzz";
        }
        else if(n % 3 == 0){
            return "Fizz";
        }
        else if(n%5==0){
            return "Buzz";
        }



        return "";
    }

}
