package application;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.exceptions.InputMismatchBinary;
import model.exceptions.InputMismatchHexadecimal;
import model.util.Calculator;

public class Program{
    public static void main (String[] args){
    
        Scanner s = new Scanner(System.in);
        
        int init = 0;

             while (init != 7){
                try{
                    switch (init){
                        case 0:
                            System.out.println("\nEnter the desired option:");
                            System.out.println("1 | decimal to binary");
                            System.out.println("2 | binário para decimal");
                            System.out.println("3 | hexadecimal to decimal");
                            System.out.println("4 | decimal to hexadecimal");
                            System.out.println("5 | hexadecimal to binary");
                            System.out.println("6 | binary para hexadecimal");
                            System.out.println("7 | END");
                            int x = s.nextInt();
                            s.nextLine();
                            
                            switch (x){
                                case 1:
                                    init = 1;
                                    break;
                                case 2:
                                    init = 2;
                                    break;
                                case 3:
                                    init = 3;
                                    break;
                                case 4:
                                    init = 4;
                                    break;
                                case 5:
                                    init = 5;
                                    break;
                                case 6:
                                    init = 6;
                                    break;
                                case 7:
                                    init = 7;
                                    break;
                                default:
                                    System.out.println("\nInvalid option\n");
                                    init = 0;
                                    break; 
                            }
                            break;
                        
                        case 1:
                            System.out.println("\nEnter a decimal number:");
                            long decimal = s.nextLong();
                            s.nextLine();
                            System.out.println("\nBinary: " + Calculator.decimalToBinary(decimal));
                            init = 0;
                            break;
                        
                        case 2:
                            System.out.println("\nEnter a binary number:");
                            String binary = s.nextLine();
                            System.out.println("\nDecimal: " + Calculator.binaryToDecimal(binary));
                            init = 0;
                            break;
    
                        case 3:
                            System.out.println("\nEnter a hexadecimal number:");
                            String hexa = s.nextLine();
                            System.out.println("\nDecimal: " + Calculator.hexadecimalToDecimal(hexa));
                            init = 0;
                            break;
                            
                        case 4:
                            System.out.println("\nEnter a decimal number:");
                            int decimal2 = s.nextInt();
                            s.nextLine();
                            System.out.println("\nHexadecimal: " + Calculator.decimalToHexadecimal(decimal2));
                            init = 0;
                            break;
                        
                        case 5:
                            System.out.println("\nEnter a hexadecimal number:");
                            String hexaDecimal = s.nextLine();
                            System.out.println("\nBinary: " + Calculator.hexadecimalToBinary(hexaDecimal));
                            init = 0;
                            break;
                            
                        case 6:
                            System.out.println("\nEnter a binary number:");
                            String bin = s.nextLine();
                            System.out.println("\nHexadecimal: " + Calculator.binaryToHexadecimal(bin));
                            init = 0;
                            break;
                            
                        default:
                            System.out.println("\nInvalid Option\n");
                            init = 6;
                            break;
                    }   
                }
                catch (InputMismatchException e){
                    System.out.println();
                    System.out.println("Invalid input. Please enter a valid option.");
                    s.nextLine();
                    init = 0;
                }
                catch (InputMismatchBinary e){
                    System.out.println();
                    System.out.println(e.getMessage());
                    init = 0;
                }
                catch (InputMismatchHexadecimal e){
                    System.out.println();
                    System.out.println(e.getMessage());
                    init = 0;
                }
                catch (IllegalArgumentException e){
                    System.out.println();
                    System.out.println(e.getMessage());
                    init = 0;
                }
                
            }
            System.out.println("Program Ended");
        }       
}


