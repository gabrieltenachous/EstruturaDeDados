package estruturadados;

import java.util.Scanner;
import modelos.Pessoa;

public class EstruturaDados {

    public static void main(String[] args) {
        System.out.println("Digite opção desejkada");
        System.out.println("1. Gerenciamento de memoria: ");
        Scanner scanf = new Scanner(System.in);
        int opcao = scanf.nextInt();

        switch (opcao) {
            case 1:
                fazerGerenciamentoMemoria();
                break;
        }
        scanf.close();

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
