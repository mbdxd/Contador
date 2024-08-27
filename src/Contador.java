import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

public class Contador {
    public static void main(String[] args) {
         try (Scanner terminal = new Scanner(System.in)) {
             System.out.println("Digite o primeiro parâmetro");
             int parametroUm = terminal.nextInt();
             System.out.println("Digite o segundo parâmetro");
             int parametroDois = terminal.nextInt();


             try {
                 contar(parametroUm, parametroDois);

             } catch (ParametrosInvalidosException exception) {
                 System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
             }
         }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois){
            throw new ParametrosInvalidosException("O primeiro parâmetro deve ser menor que o segundo.");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
        }
    }
}