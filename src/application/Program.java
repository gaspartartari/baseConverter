package application;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.exceptions.InputMismatchBinary;
import model.exceptions.InputMismatchHexadecimal;
import model.util.Calculator;

public class Program{
    public static void main (String[] args){
    
        Scanner s = new Scanner(System.in);
        
        int inicio = 0;

             while (inicio != 7){
                try{
                    switch (inicio){
                        case 0:
                            System.out.println("\nDigite a opção desejada:");
                            System.out.println("1 | decimal para binário");
                            System.out.println("2 | binário para decimal");
                            System.out.println("3 | hexadecimal para decimal");
                            System.out.println("4 | decimal para hexadecimal");
                            System.out.println("5 | hexadecimal para binário");
                            System.out.println("6 | binario para hexadecimal");
                            System.out.println("7 | sair");
                            int x = s.nextInt();
                            s.nextLine();
                            
                            switch (x){
                                case 1:
                                    inicio = 1;
                                    break;
                                case 2:
                                    inicio = 2;
                                    break;
                                case 3:
                                    inicio = 3;
                                    break;
                                case 4:
                                    inicio = 4;
                                    break;
                                case 5:
                                    inicio = 5;
                                    break;
                                case 6:
                                    inicio = 6;
                                    break;
                                case 7:
                                    inicio = 7;
                                    break;
                                default:
                                    System.out.println("\nOpção Inválida\n");
                                    inicio = 0;
                                    break; 
                            }
                            break;
                        
                        case 1:
                            System.out.println("\nDigite um numero decimal:");
                            long decimal = s.nextLong();
                            s.nextLine();
                            long resposta = Calculator.decimalToBinary(decimal);
                            System.out.println("\nBinário: " + resposta);
                            inicio = 0;
                            break;
                        
                        case 2:
                            System.out.println("\nDigite um numero binario:");
                            String binario = s.nextLine();
                            String resposta2 = Calculator.binarioParaDecimal(binario);
                            System.out.println("\nDecimal: " + resposta2);
                            inicio = 0;
                            break;
    
                        case 3:
                            System.out.println("\nDigite um numero hexadecimal:");
                            String hexa = s.nextLine();
                            System.out.println("\nDecimal: " + Calculator.hexaDecimalParaDecimal(hexa));
                            inicio = 0;
                            break;
                            
                        case 4:
                            System.out.println("\nDigite um numero decimal:");
                            int d = s.nextInt();
                            s.nextLine();
                            System.out.println("\nHexadecimal: " + Calculator.decimalParaHexadecimal(d));
                            inicio = 0;
                            break;
                        
                        case 5:
                            System.out.println("\nDigite um numero hexadecimal:");
                            String h = s.nextLine();
                            System.out.println("\nBinário: " + Calculator.hexadecimalParaBinario(h));
                            inicio = 0;
                            break;
                            
                        case 6:
                            System.out.println("\nDigite um numero binário:");
                            String bin = s.nextLine();
                            System.out.println("\nHexadecimal: " + Calculator.binarioParaHexadecimal(bin));
                            inicio = 0;
                            break;
                            
                        default:
                            System.out.println("\nOpção inválida\n");
                            inicio = 6;
                            break;
                    }   
                }
                catch (InputMismatchException e){
                    System.out.println();
                    System.out.println("Invalid input. Please enter a valid option.");
                    s.nextLine();
                    inicio = 0;
                }
                catch (InputMismatchBinary e){
                    System.out.println();
                    System.out.println(e.getMessage());
                    inicio = 0;
                }
                catch (InputMismatchHexadecimal e){
                    System.out.println();
                    System.out.println(e.getMessage());
                    inicio = 0;
                }
                
            }
            System.out.println("Program Ended");
        }       
}


