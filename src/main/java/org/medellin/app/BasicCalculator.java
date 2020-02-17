package org.medellin.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {

    private static final Logger logger= LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long num1, Long num2){
        logger.info("Sumando {} + {}",num1,num2);
        return num1 + num2;
    }

    public Long multi(Long num1, Long num2){
        logger.info("Multiplying {} + {}",num1,num2);
        return num1 * num2;
    }

    public Long subst(Long num1, Long num2){
        logger.info("subtracting {} + {}",num1,num2);
        return num1 - num2;
    }

    public Long div(Long num1, Long num2){

        logger.info("div {} + {}",num1,num2);
         if(num2==0){
           throw new IllegalArgumentException("No es posible dividir entre cero");
         }

        return num1 / num2;
    }
}
