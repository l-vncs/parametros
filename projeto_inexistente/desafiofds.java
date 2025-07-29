package projeto_inexistente;
import java.util.Scanner;
public class desafiofds {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();


        try {
            //chamando o metodo contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm>=parametroDois){
            throw new ParametrosInvalidosException ("O segundo parâmetro deve ser maior que o primeiro");
        }

        int count = parametroDois - parametroUm;
        for(int i = 0; i <= count; i++) {
            System.out.println(parametroUm + i);
        }
    }
}
