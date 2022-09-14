package service;
import model.*;

public class Livraria {
    public boolean pesquisar(Livro[] livros, String nome){

        for(int i =0 ;i<livros.length;i++){
            if(livros[i]!=null)
                if(livros[i].getNome().equals(nome))
                    return true;
        }
        return false;
    }
}
