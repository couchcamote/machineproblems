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
        System.out.println("\n\n===[Extract Value by Curency");
        String str = "The pricess are $5 for a piece not €5 and this 1 is $45.00 , this one on the other hand is $ 500,000 currently, no budget meals, need to earn $ ,./.. ";
        String currency1 = "$";
        String currency2 = "€";
        System.out.println("Currency: "+ currency1+", Text: "+ str);
        System.out.println(extractCurrency(currency1 , str));
        System.out.println("Currency: "+ currency2+", Text: "+ str);
        System.out.println(extractCurrency(currency2 , str));
    }

    public static List<String> extractCurrency(String currency, String text){
        List<String> l = new ArrayList<String>();
        
        if(currency!=null && currency.length() >  0 && text!=null && text.length() > 0) {

        char currencyChar = currency.toCharArray()[0];
        boolean currencyFound = false;
        boolean containsNumeric = false;
        StringBuilder sb = new StringBuilder();
    
                for(char current : text.toCharArray()){

                    if(Character.isWhitespace(current)){
                        continue;
                    }

                    if(current == ','){
                        continue;
                    }

                    if(!currencyFound && current == currencyChar){
                        currencyFound = true;
                        continue;
                    }
                    if(currencyFound){
                        if(Character.isDigit(current)){
                            sb.append(current);
                            containsNumeric= true;
                            continue;
                        }else if(current == '.'){
                            if(containsNumeric){
                                sb.append(current);
                            }
                            continue;
                        }else if (containsNumeric){            
                            String str = sb.toString();  
                            if(valid(str)){
                                l.add(str.trim());
                            }
                            currencyFound = false;
                            containsNumeric = false;
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