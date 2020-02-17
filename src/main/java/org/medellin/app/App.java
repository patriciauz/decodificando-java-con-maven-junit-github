package org.medellin.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    private static final Logger logger= LoggerFactory.getLogger(BasicCalculator.class);

    public static void main( String[] args ) throws IOException {

        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader( System.in ));

        System.out.println("Ingrese el primer número");
        String text1= bufferedReader.readLine();

        System.out.println("Ingrese el segundo número");
        String text2= bufferedReader.readLine();

        System.out.println("Ingrese la operación a realizar (+, -, *, /)");
        String oper= bufferedReader.readLine();

        Long num1= Long.valueOf(text1);
        Long num2= Long.valueOf(text2);

        BasicCalculator basicCalculator= new BasicCalculator();
        Long result=null;

         switch (oper){
            case "+" :
                result =basicCalculator.sum(num1, num2);
             break;

             case "-" :
                 result=  basicCalculator.subst(num1,num2);
                 break;

             case "*" :
                 result= basicCalculator.multi(num1,num2);
                 break;

                 default:
            System.err.println("operation " + oper + " doesn't exist");
        }

        System.out.println("num1"+oper+"num2"+"=" +result);

        logger.info( "Closing calculator console client" );

    }
}
