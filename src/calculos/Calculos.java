package calculos;

import java.util.Scanner;

public class Calculos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
                            
        boolean voltar = true;

        while (voltar) {

            System.out.println("\n\n\t*************  CALCULADORA  *************\n\n");

            System.out.print("Digite um número: ");
            double nr1 = sc.nextDouble();
            System.out.print("Digite outro número: ");
            double nr2 = sc.nextDouble();

            Calculadora calculo1 = new Calculadora();

            calculo1.resultadoSoma(nr1, nr2);
            calculo1.resultadoSub(nr1, nr2);
            calculo1.resultadoMult(nr1, nr2);
            calculo1.resultadoDiv(nr1, nr2);

            System.out.println("\n\t- Método Somar entre os valores: " + nr1 + " e " + nr2 + " o resultado é: " + calculo1.mostrarSoma());
            System.out.println("\n\t- Método Subtrair entre os valores: " + nr1 + " e " + nr2 + " o resultado é: " + calculo1.mostrarSub());
            System.out.println("\n\t- Método Multiplicar entre os valores: " + nr1 + " e " + nr2 + " o resultado é: " + calculo1.mostrarMult());
            System.out.println("\n\t- Método Dividir entre os valores: " + nr1 + " e " + nr2 + " o resultado é: " + calculo1.mostrarDiv());

            System.out.print("\n\n\t******* DESEJA REALIZAR OUTRO CÁLCULO? s-sim ou n-não: ");
            String opcao = sc.next();
            if (opcao.equals("n")) {
                voltar = false;
                System.out.println("\n\n");
            }

        }
    }

}
