package model.util;

import model.exceptions.InputMismatchBinary;
import model.exceptions.InputMismatchHexadecimal;

public class Calculator{

    public static long decimalToBinary(long decimal) {

        String ret = "";
        while(decimal != 0){
            if(decimal % 2 == 0){
                decimal = decimal / 2;
                long longDecimal = (long) decimal;
                decimal = longDecimal;
                ret +="0";
            }else{
                decimal = decimal / 2;
                long longDecimal = (long) decimal;
                decimal = longDecimal;
                ret +="1";
            }
        }
        
        char[] caracteres = ret.toCharArray();
        int inicio = 0;
        int fim = caracteres.length -1;
        
        while (inicio < fim){
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio++;
            fim--;
        }
        
        ret = new String (caracteres);
        long retornoLong = Long.parseLong(ret);
        return retornoLong;
        
    }
    
    public static String binarioParaDecimal(String binario) throws InputMismatchBinary{

        char[] verificaBinario = binario.toCharArray();
        for (int a = 0 ; a < verificaBinario.length; a++)
            if(verificaBinario[a] != '0' && verificaBinario[a] != '1')
                throw new InputMismatchBinary("Invalid binary input. Please enter a valid option");
            
            char[] cBinario = binario.toCharArray();
            int base = 2;
            int expoente = 0;
            int somaFinal = 0;
            double x = 0;
            double resultado = 0;
            
            for(int i = cBinario.length-1; i >= 0 ; i--){
                x = Math.pow (base, expoente);
                String cI = String.valueOf(cBinario[i]);
                double cId = Double.parseDouble(cI);
                
                resultado = cId * x;
                somaFinal += resultado;
                expoente +=1;
            }
            
            String r = String.valueOf(somaFinal);
            return r;
            
    }
    
    public static int hexaDecimalParaDecimal(String hexaDecimal) throws InputMismatchHexadecimal{
        char [] cHexaDecimal = hexaDecimal.toCharArray();
        for(char a : cHexaDecimal){
            if(a != '1' || a !='2' || a != '3' || a != '4' || a != '5' || a != '6' || a != '7' || a != '8' || a != '9'
                     || Character.toString(a).equalsIgnoreCase("a") || Character.toString(a).equalsIgnoreCase("b") 
                           || Character.toString(a).equalsIgnoreCase("c") || Character.toString(a).equalsIgnoreCase("d")
                               || Character.toString(a).equalsIgnoreCase("e") || Character.toString(a).equalsIgnoreCase("f"))
                                    {
                                     throw new InputMismatchHexadecimal("Invalid input. Please enter a valid hexadecimal value.");
                                    }
        }

        int base = 16;
        int expoente = 0;
        double mathRound = 0;
        double resultado = 0;
        int retorno = 0;
        for(int i = cHexaDecimal.length-1; i >= 0; i--){
            if(cHexaDecimal[i] == 'a' || cHexaDecimal[i] == 'A' ){
                mathRound = Math.pow(base, expoente);
                resultado = 10 * mathRound;
                retorno += resultado;
                expoente +=1;
            }else if(cHexaDecimal[i] == 'b' || cHexaDecimal[i] == 'B'){
                mathRound = Math.pow(base, expoente);
                resultado = 11 * mathRound;
                retorno += resultado;
                expoente +=1;
            }else if(cHexaDecimal[i] == 'c'|| cHexaDecimal[i] == 'C'){
                mathRound = Math.pow(base, expoente);
                resultado = 12 * mathRound;
                retorno += resultado;
                expoente +=1;
            }else if(cHexaDecimal[i] == 'd' || cHexaDecimal[i] == 'D'){
                mathRound = Math.pow(base, expoente);
                resultado = 13 * mathRound;
                retorno += resultado;
                expoente +=1;
            }else if(cHexaDecimal[i] == 'e' || cHexaDecimal[i] == 'E'){
                mathRound = Math.pow(base, expoente);
                resultado = 14 * mathRound;
                retorno += resultado;
                expoente +=1;
            }else if(cHexaDecimal[i] == 'f' || cHexaDecimal[i] == 'F'){
                mathRound = Math.pow(base, expoente);
                resultado = 15 * mathRound;
                retorno += resultado;
                expoente +=1;
            }else{
                mathRound = Math.pow(base, expoente);
                String charToInt = String.valueOf(cHexaDecimal[i]);
                double intToDouble = Double.parseDouble(charToInt);
                resultado = intToDouble * mathRound;
                retorno += resultado;
                expoente +=1;
            }
        }
            
        return retorno;
    }
    
    public static String decimalParaHexadecimal(int decimal){
        int count = 0;
        int temp = decimal;
        while (temp != 0){
            temp = temp / 16;
            count++;
        }
        
        char[] restos = new char[count];
        
        char[] hexas ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        for(int i = 0; i < count; i ++){
            int resto = decimal % 16;
            restos[count - 1 - i] = hexas[resto];
            decimal = decimal / 16; 
        }
        
        return new String (restos);
    }
    
    public static String hexadecimalParaBinario(String hexa) throws InputMismatchHexadecimal{
        
        char[] hexaChar = hexa.toCharArray();
        for(char a : hexaChar){
            if(a != '1' || a !='2' || a != '3' || a != '4' || a != '5' || a != '6' || a != '7' || a != '8' || a != '9'
                     || Character.toString(a).equalsIgnoreCase("a") || Character.toString(a).equalsIgnoreCase("b") 
                           || Character.toString(a).equalsIgnoreCase("c") || Character.toString(a).equalsIgnoreCase("d")
                               || Character.toString(a).equalsIgnoreCase("e") || Character.toString(a).equalsIgnoreCase("f"))
                                    {
                                     throw new InputMismatchHexadecimal("Invalid input. Please enter a valid hexadecimal value.");
                                    }
        }
        String hexaUpperCase = hexa.toUpperCase();
        String binario = "";
        for(int i = 0; i < hexaChar.length; i++){
            char c = Character.toUpperCase(hexaChar[i]);
            if (Character.isDigit(hexaChar[i])){
                switch (c){
                    case '0':
                        binario +="0000";
                        break;
                    case '1':
                        binario +="0001";
                        break;
                    case '2':
                        binario +="0010";
                        break;
                    case '3':
                        binario +="0011";
                        break;
                    case '4':
                        binario +="0100";
                        break;
                    case '5':
                        binario +="0101";
                        break;
                    case '6':
                        binario +="0110";
                        break;
                    case '7':
                        binario +="0111";
                        break;
                    case '8':
                        binario +="1000";
                        break;
                    case '9':
                        binario +="1001";
                         break;
                    default:
                        throw new IllegalArgumentException("O valor binário " + hexaChar[i] + " é inválido");
                }
            }else if (hexaChar[i] >= 'A' || hexaChar[i] <= 'F'){
                switch (hexaChar[i]){      
                    case 'A':
                        binario +="1010";
                        break;
                    case 'B':
                        binario +="1011";
                        break;
                    case 'C':
                        binario +="1100";
                        break;
                    case 'D':
                        binario +="1101";
                        break;
                    case 'E':
                        binario +="1110";
                        break;
                    case 'F':
                        binario +="1111";
                        break;
                }    
            }else
                throw new IllegalArgumentException("O valor binário " + hexaChar[i] + " é inválido");
        }
        
        String binarioS = String.valueOf(binario);
        
        char[] verifica = binarioS.toCharArray();
        
        for (int i = 0; i < verifica.length; i++)
            if(verifica[i] == '0')
                verifica [i] = '\0';
            else
                break;        
         
        return String.valueOf(verifica);
    }
    
    public static String binarioParaHexadecimal(String binario) throws InputMismatchBinary{
        char[] verificaBinario = binario.toCharArray();
        for (int a = 0 ; a < verificaBinario.length; a++)
            if(verificaBinario[a] != '0' && verificaBinario[a] != '1')
                throw new InputMismatchBinary("Invalid binary input. Please enter a valid option");

        char[] cBinario = binario.toCharArray();
        int base = 2;
        int expoente = 0;
        double resultado = 0;
        int soma = 0;
        double mP = 0;
        
        for(int i = cBinario.length-1; i >= 0; i--){
            mP = Math.pow(base, expoente);
            String rS = String.valueOf(cBinario[i]);
            double rD = Double.parseDouble(rS);
            resultado = rD * mP;
            soma += resultado;
            expoente++;
        }
        
        int count = 0;
        int temp = soma;
        
        while(temp != 0){
            temp = temp / 16;
            count++;
        }
        
        char[] restos = new char[count];
        char[] hexas ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        for(int i = 0; i < count; i ++){
            int resto = soma % 16;
            restos[count - 1 - i] = hexas[resto];
            soma = soma / 16; 
        }
        
        return new String (restos);
    }
}

