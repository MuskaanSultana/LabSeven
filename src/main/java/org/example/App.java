package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            result.append(FizzBuzz(i));
            if (i < 100) {
                result.append(", ");
            }
        }

        System.out.println(result.toString());
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
        else{
            return Integer.toString(n);
        }
    }

}
