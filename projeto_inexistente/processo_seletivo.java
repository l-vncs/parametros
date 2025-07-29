package projeto_inexistente;
import java.util.concurrent.ThreadLocalRandom;
public class processo_seletivo {
    public static void main(String[] args) {
        imprimirSelect();
    }
    static void imprimirSelect(){
        String[] candidatos = {"João", "Maria", "Pedro", "Ana", "Lucas",};
        System.out.println("Lista de candidatos selecionados informando o indice");
        for(int i = 0; i< candidatos.length; i++){
            System.out.println("O candidato de nº" + (i+1) + " é: " + candidatos[i]);
        }
        System.out.println("Forma abreviada de interacao");
        for(String candidato: candidatos){
            System.out.println("O candidato é: " + candidato);
        }

    }
    static void selecao() {
        String[] candidatos = {"João", "Maria", "Pedro", "Ana", "Lucas", "Fernanda",
                               "Carlos", "Juliana", "Roberto", "Sofia"};
        int candidatosSelected = 0;
        int candidatosAtual = 0;
        double salarioST = 2000.0;
        while (candidatosSelected<5 && candidatosAtual<candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioInten= valorInten();
            System.out.printf("O candidato %s solicitou este valor: %s \n", candidato, salarioInten);
            if(salarioST>=salarioInten){
                System.out.printf("O candidato %s foi selecionado \n", candidato);
                candidatosSelected++;
            }
            candidatosAtual++;
        }

    }
    static double valorInten(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }
    static void analise(double salarioInten) {
        double salarioST = 2000.0;
        if (salarioST>salarioInten) {
            System.out.println("Ligar para o candidato");
        }
        else if (salarioST==salarioInten){
            System.out.println("Ligar para contra proposta");

        }
        else{
            System.out.println("Aguardando outros candidatos");
        }


    }
}
