package model.util;

import model.exceptions.InputMismatchBinary;
import model.exceptions.InputMismatchHexadecimal;

public class Calculator{

    public static String decimalToBinary(long decimal) {

        StringBuilder binary = new StringBuilder();

        while(decimal != 0){
            binary.insert(0, decimal % 2);
            decimal /=2;
        } 
        return binary.toString();
    }
    
    public static String binaryToDecimal(String binary) throws InputMismatchBinary{

        char[] verifyBinary = binary.toCharArray();
        for (int a = 0 ; a < verifyBinary.length; a++)
            if(verifyBinary[a] != '0' && verifyBinary[a] != '1')
                throw new InputMismatchBinary("Invalid binary input: " + verifyBinary[a] + ". Please enter a valid option");
            
            char[] arrayBinary = binary.toCharArray();
            int base = 2;
            int expoent = 0;
            int finalSum = 0;
            double x = 0;
            double result = 0;
            
            for(int i = arrayBinary.length-1; i >= 0 ; i--){
                x = Math.pow (base, expoent);
                String stringValue = String.valueOf(arrayBinary[i]);
                double doubleValue = Double.parseDouble(stringValue);
                
                result = doubleValue * x;
                finalSum += result;
                expoent +=1;
            }
            
            String finalReturn = String.valueOf(finalSum);
            return finalReturn;
            
    }
    
    public static int hexadecimalToDecimal(String hexadecimal) throws InputMismatchHexadecimal {
        char[] arrayDecimal = hexadecimal.toCharArray();
        int base = 16;
        int ret = 0;
        int expoent = 0;
    
        for (int i = arrayDecimal.length - 1; i >= 0; i--) {
            char c = Character.toLowerCase(arrayDecimal[i]); 
    
            int value = -1; 
    
            if (c >= '0' && c <= '9') {
                value = c - '0';
            } 
            else if (c >= 'a' && c <= 'f') {
                value = c - 'a' + 10; 
            }
    
            if (value == -1) {
                throw new InputMismatchHexadecimal("Invalid hexadecimal input: " + arrayDecimal[i] + ". Please enter a option.");
            }
    
            ret += value * Math.pow(base, expoent);
            expoent += 1;
        }
    
        return ret;
    }
    
    
    public static String decimalToHexadecimal(int decimal){
        int count = 0;
        int temp = decimal;
        while (temp != 0){
            temp = temp / 16;
            count++;
        }
        
        char[] remainders = new char[count];
        
        char[] hexas ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        for(int i = 0; i < count; i ++){
            int remainder = decimal % 16;
            remainders[count - 1 - i] = hexas[remainder];
            decimal = decimal / 16; 
        }
        
        return new String (remainders);
    }
    
    public static String hexadecimalToBinary(String hex) {
        hex = hex.toUpperCase();
    
        StringBuilder binary = new StringBuilder();
    
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
    
            if (Character.isDigit(c)) {
                int decimalValue = Character.getNumericValue(c);
                binary.append(String.format("%4s", Integer.toBinaryString(decimalValue)).replace(' ', '0'));
            } else if (c >= 'A' && c <= 'F') {
                int decimalValue = c - 'A' + 10;
                binary.append(String.format("%4s", Integer.toBinaryString(decimalValue)).replace(' ', '0'));
            } else {
                throw new IllegalArgumentException("Invalid hexadecimal input: " + c + ". Please enter a valid option");
            }
        }
    
        return binary.toString();
    }
    
   public static String binaryToHexadecimal(String binary) throws InputMismatchBinary {
    char[] isValidBinary = binary.toCharArray();
    for (int a = 0; a < isValidBinary.length; a++) {
        if (isValidBinary[a] != '0' && isValidBinary[a] != '1') {
            throw new InputMismatchBinary("Invalid binary input: " + isValidBinary[a] + ". Please enter a valid option");
        }
    }

    int decimalValue = 0;

    for (int i = 0; i < binary.length(); i++) {
        char bit = binary.charAt(i);
        decimalValue = (decimalValue << 1) + (bit - '0');
    }

    String hexadecimal = Integer.toHexString(decimalValue).toUpperCase();
    return hexadecimal;
    }
}


