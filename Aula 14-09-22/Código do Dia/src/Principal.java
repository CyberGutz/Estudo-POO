import java.util.*;

import database.BancoDeDados;
import model.Livro;
import service.*;

public class Principal {
    public static void main(String[] args) throws Exception {
        try (Scanner entrada = new Scanner(System.in)) {
            Livro livros[] = new Livro[10];
            String nome;

            for(int i = 0; i<livros.length;i++){
                Livro aux = new Livro();
                System.out.println("Digite o nome do livro:");
                aux.setCodigo(i+1);
                nome = entrada.next();
                aux.setNome(nome);
                livros[i] = aux;

                System.out.println("Deseja continuar? (s/n)");
                char opc = entrada.next().toLowerCase().charAt(0);
                if(opc =='n'){
                    break;
                }
            }

            Livraria cultura = new Livraria();

            System.out.println("Digite o nome do livro");
            String pesquisa = entrada.next();

            if(cultura.pesquisar(livros, pesquisa))
                System.out.println("Livro encontrado");
            else    
                System.out.println("Livro não encontrado");
        }

        BancoDeDados bd1 = BancoDeDados.getInstance();
        BancoDeDados bd2 = BancoDeDados.getInstance();
        BancoDeDados bd3 = BancoDeDados.getInstance();
        BancoDeDados bd4 = BancoDeDados.getInstance();
        bd1.inserir("juscleiton");
        bd2.inserir("kerolaine");
        bd3.inserir("xerox");
        bd4.inserir("carimbo");

        BancoDeDados.listar();
    }
}
