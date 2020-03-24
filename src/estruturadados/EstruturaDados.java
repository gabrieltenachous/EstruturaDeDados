package estruturadados;

import java.util.Scanner;
import modelos.Pessoa;
import vetores.Vetor;

public class EstruturaDados {

    public static void main(String[] args) {
        System.out.println("Digite opção desejkada");
        System.out.println("1. Gerenciamento de memoria: ");
        System.out.println("2. Vetores: ");
        try (Scanner scanf = new Scanner(System.in)) {
            int opcao = scanf.nextInt();

            switch (opcao) {
                case 1:
                    fazerGerenciamentoMemoria();
                    break;
                case 2:
                    fazerVetor();
                    break;
            }
        }

    }

    private static void fazerVetor() {
        Vetor<Pessoa> vetorPessoa = new Vetor(3);
        vetorPessoa.inserirEn(0, new Pessoa(0, "Treina"));
        System.out.println(vetorPessoa.recuperar(0).getNome());
        Vetor<Integer> vetorInteiros = new Vetor<>(2);
        vetorInteiros.inserirEn(0, 1);
        System.out.println(vetorInteiros.recuperar(0));
    }

    private static void fazerGerenciamentoMemoria() {
        int a = 3;
        System.out.println(a);
        int b = a;
        System.out.println(b);
        b = 2;
        System.out.println("--------");
        System.out.println(b);
        System.out.println(a == b);

        System.out.println("=========");
        Pessoa p1 = new Pessoa(1, "TreinaWeb");
        System.out.println(p1.toString());
        Pessoa p2 = new Pessoa(1, "TreinaWeb");

        System.out.println(p2.toString());
        p2.setNome("TreinaWeb");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        //Comeca a deixa de comparar a memoria
        //e compara o conteudo
        System.out.println(p1.equals(p2));

    }
}
