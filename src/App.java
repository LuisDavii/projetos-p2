import java.util.Scanner;

public class App {
    public static void main(String[] args){

         Scanner insira = new Scanner(System.in);

         System.out.println("Calculadora de potencia \nInsira a base da sua potencia: ");
         double base = insira.nextInt();
         
         System.out.println("Insira o expoente: ");
         double expo = insira.nextInt();

         System.out.println("O resultado é: "+potencia(base, expo));
         insira.close();
    } 
    
    public static double potencia(double base, double expoente){
        
        Boolean expoNeg = false;
        Boolean negativo = false;

        if(base<0){
            negativo = true;
            base = base*-1;
        }

        if(expoente<0){
            expoNeg = true;
            expoente = -1*expoente; 
        }
        
        double resultado = 1;
        
        for(int i = 0 ; i < expoente ; i++){
            resultado = multiplica(resultado,base);
        }
        if(negativo && !(expoente % 2 == 0)){
            resultado = resultado*-1;
        }
        if(expoNeg){
            resultado = 1/resultado;
        }

        return resultado;
    }
    public static double multiplica(double base, double vezes){

        double resultado1 = 0;
        
        for(int i = 0 ; i < vezes ; i++){
            resultado1 += base;
        }
        return resultado1;
       
   
    }
}  
