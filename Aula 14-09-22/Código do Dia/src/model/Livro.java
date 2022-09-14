package model;

public class Livro {
    private int codigo;
    private String nome;
    private static int qtde;

    public Livro(){

    }

    public Livro(int codigo, String nome){
        setCodigo(codigo);
        setNome(nome);
        qtde++;
        System.out.println("Foi criado o livro: "+qtde);
    }

    public static void imprimeTeste(){
        System.out.println("Método estático");
    }

    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public static int getQtde() {
        return qtde;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.getCodigo() + this.getNome() + this.getQtde();
    }
}
