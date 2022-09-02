# Construtores, Encapsulamento e Pacotes

## Construtores:
<br>
- Construtor é um método que serve pra inicializar variáveis, instanciar objetos ou dar uma ação inicial ao objeto.
- É chamado logo após você instanciar seu objeto.
- **Toda** classe que criamos tem um construtor.
<br>

Como criar um construtor

	não tem retorno
	O nome é sempre o mesmo da classe
	
	public Classe(){
		//Isso é um construtor
	}
	
Quando criamos uma instância de uma variável, estamos chamando o construtor da classe
	
	Classe var = new Classe();  //o "Classe()" é o construtor

### Override e Overload:
<br>	
- **Override:** Sobrescrever um construtor com o outro;
- **Overload:** Fazer o mesmo construtor várias vezes, para dar opção ao programador, porém, os construtores devem ter parâmetros diferentes

	public Classe(){
		//info
	}

	public Classe(parametro){

Propriedades de classe:
- public (Público) - garante o acesso a todos os objetos;
- protected (Protegido) - garante o acesso à instância, ou seja, para o objeto e para todas as classes filhas.
- private (Privado) - só pode ser acessado pela própria classe.

### Geters and Seters
<br>
Quando temos nossas propriedades de classe públicas, isso as torna sucetíveis à alterações e mal uso, para isso, devemos colocá-las privadas, e usar os Getters e Setter para obter e retornar as informações, de modo a acessar a propriedade privada, além de poder imbutir código que faz as verificações necessárias para proteger o código.
<br>
- Get : obter da classe uma informação.
- Set : inserir algo na classe.

- Get 
	public tipo getAlgo(){
		reuturn retorno;
	}

*Get não precisa de parâmetro, mas precisa de retorno.*

- Set
	public void setAlgo(tipo parametro){
		variavel = parametro;
	}
	
*Set não precisa de retorno, mas precisa de parâmetro.*

> Tentar sempre evitar usar variáveis públicas, usar getters e setters é mais seguro e mais limpo.

> Em IDE's existem formas de criação automática de geters e seters.







## Código em sala
- Colocar construtores para as classes Livro e Autor, criadas anteriormente.
<br>
-Em Autor.java:

	public class Autor(){
		public String nome;
		public String cpf;
		
		public Autor(){
		
		}
		
		public String toString(){
			return "Autor: "+nome+"CPF: "+cpf;
		}
		
	}
	
-Em Livro.java:

	public class Livro(){
		public String nome;
		public String descricao;
		public String isbn;
		public double valor;
		public Autor  autor;
		
		
		public Livro(){
			autor = new Autor();
		}
		
		public String toString(){
			return "\nNome: "+nome+"\nDescrição: "+descricao+"\nISBN: "+isbn+"\nValor: "+valor+autor.toString;
		}
		
	}
	
## Exercício : Página 23 do Slide "10- OO - Encapsulamento.pdf" 


	
	
