public class OperadorTernario {
    
    public static void main(String[] args) {
        int a, b; 
        a = 5;
        b = 5;

        String resultado = a==b ? "verdadeiro" : "false";

        System.out.println(resultado);
        
       // Operadores relacionais

       String nome1= "sonia";
       String nome2= "joao";

       System.out.println(nome1 == nome2);


        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2) {
            System.out.println("A nossa condição é verdade");
        }

        System.out.println("numero1 é igual a numero2?" + simNao);

         simNao = numero1 != numero2;

         System.out.println("numero1 é diferente a numero2?" + simNao);

         simNao = numero1 > numero2;

         System.out.println("numero1 é maior que  numero2?" + simNao);
    }
}

