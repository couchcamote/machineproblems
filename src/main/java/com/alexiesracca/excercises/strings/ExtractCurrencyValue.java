package com.alexiesracca.excercises.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Extract Value of the current currency of the text string
 * TODO In progress
 */
public class ExtractCurrencyValue {

    public static void main(String[] args) {
        test();
    }

    public static void test(){
        System.out.println(extractCurrency("$", "The pricess are $5 1 piece not €5 and this 1 is $45.00 , this one on the other hand is $ 500,000 currently, no budget meals, need to earn $ ,./.. "));
    }

    public static List<String> extractCurrency(String currency, String text){
        List<String> l = new ArrayList<String>();

        char currencyChar = currency.toCharArray()[0];
        boolean valueStart = false;
        StringBuilder sb = new StringBuilder();

            if(currency!=null && currency.length() >  0 && text!=null && text.length() > 0) {
   
                for(char current : text.toCharArray()){

                    //System.out.print(current);
                    if(Character.isWhitespace(current)){
                        continue;
                    }

                    if(!valueStart && current == currencyChar){
                        valueStart = true;
                        continue;
                    }
                    if(valueStart){
                        if((Character.isDigit(current) || current == '.' || current == ',' )){
                            sb.append(current);
                            continue;
                        }else{            
                            String str = sb.toString();    
                            if(valid(str)){
                                l.add(str.trim());
                            }
                            valueStart = false;
                            sb = null;
                            sb = new StringBuilder();
                            continue;
                        }

                    }
            }
        }

        return l;
    }

    public static boolean valid(String s){
        //temp (regular expression?)
        return true;
    }

}