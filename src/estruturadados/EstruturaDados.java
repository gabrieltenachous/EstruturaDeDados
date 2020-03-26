package estruturadados;

import estruturadadolistaligada.ListaLigada;
import java.util.Scanner;
import modelos.Pessoa;
import vetores.Vetor;

public class EstruturaDados {

    public static void main(String[] args) {
        System.out.println("Digite opção desejkada");
        System.out.println("1. Gerenciamento de memoria: ");
        System.out.println("2. Vetores: ");
        System.out.println("3 Lista ligada: ");
        try (Scanner scanf = new Scanner(System.in)) {
            int opcao = scanf.nextInt();

            switch (opcao) {
                case 1:
                    fazerGerenciamentoMemoria();
                    break;
                case 2:
                    fazerVetor();
                    break;
                case 3:
                    fazerListaLigada();
                    break;
            }
        }

    }

    private static void fazerVetor() {
        Vetor<Pessoa> vetorPessoa = new Vetor(3);
        vetorPessoa.inserir(new Pessoa(1, "treinaWeb 1"));
        vetorPessoa.inserir(new Pessoa(2, "treinaWeb 2"));
        vetorPessoa.inserir(new Pessoa(3, "treinaWeb 3"));
        vetorPessoa.inserir(new Pessoa(4, "treinaWeb 4"));
        vetorPessoa.inserirEn(1, new Pessoa(5, "treinaWeb 5"));
        System.out.println(vetorPessoa);
        System.out.println("Lista de pessoas: ");
        for (int i = 0; i < vetorPessoa.tamanho(); i++) {
            System.out.println(vetorPessoa.recuperar(i).getNome());
        }
        Pessoa p = vetorPessoa.recuperar(1);
        Pessoa pessoaErrada = new Pessoa(100, "TreinaWeb 100");
        System.out.println("********** Pessoa Errada");
        System.out.println(vetorPessoa.contem(pessoaErrada));
        System.out.println(vetorPessoa.indice(p));
        System.out.println(vetorPessoa.indice(pessoaErrada));
        vetorPessoa.remover(2);
        System.out.println(vetorPessoa.toString());
        vetorPessoa.remover(p);

        System.out.println(vetorPessoa.toString());
        
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

    private static void fazerListaLigada() {
        ListaLigada<Pessoa> listaPessoa= new ListaLigada<Pessoa>();
        listaPessoa.inserir(new Pessoa(1, "TreinaWeb"));
        listaPessoa.inserir(new Pessoa(2 , "TreinaWeb"));
        System.out.println(listaPessoa.toString());
    }
}
