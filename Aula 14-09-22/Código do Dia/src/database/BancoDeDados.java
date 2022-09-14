package database;

public class BancoDeDados {
    private static BancoDeDados bd;
    private static String nomes[];

    private BancoDeDados(){
        nomes = new String[10];
    }

    public static BancoDeDados getInstance(){
        if(bd  == null)
            bd = new BancoDeDados();
        
        return bd;
    }

    public void inserir(String nome){
        for(int i =0;i<nomes.length;i++){
            if(nomes[i]==null){
                nomes[i] = nome;
                break;
            }
        }
    }

    public static void listar(){
        for(int i =0;i<nomes.length;i++){
            if(nomes[i]!=null)
                System.out.println(nomes[i]);
            }
    }
}

