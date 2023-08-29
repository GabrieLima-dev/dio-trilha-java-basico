package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        imprimirSelecionados();

    }
    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice!");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candiudato de n° " + (indice + 1) + " é o " + candidatos[indice]);
        }
    }


    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", " FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou o valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
                System.out.println("");
                candidatosSelecionados ++;
            }else {
                System.out.println("O candidato " + candidato + " não foi selecionado!");
                System.out.println("");
            }
            candidatosAtual++;
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0d;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato!");
        }else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar opara o candidato com uma contra proposta!");
        }else {
            System.out.println("Aguardando resultado dos demais candidatos!");
        }
    }
}
