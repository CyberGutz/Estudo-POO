# Resumo de Aula

## Modificador Static

Uma propriedade `static` significa que todos os objetos daquela classe compartilham do mesmo conteúdo, ou seja,  uma propriedade acessável por todos os objetos da mesma classe.

```
private String nome; //Propriedade de Objeto.
private static int qtd; //Propriedade de Classe.
```

Do mesmo jeito que é possível criar uma propriedade estática, é possível criar um método estático.

```
public static void imprimeTeste(){
    System.out.println("Método estático!");
}
```

Seguindo a lógica, podemos perceber que alguns métodos comuns são estáticos, como o `System.out.println()`, por exemplo.

- Para chamar um método estático, não precisa instanciar um objeto da classe. Por causa disso, não é possível utilizar variáveis de objeto dentro desses métodos.

<br>

> Dentro de um método estático só é possível usar variáveis e métodos estáticos, parâmetros de entrada e variáveis locais.

<br>

No diagrama, se o parâmetro ou método estiver em *italico* ou <u>sublinhado</u>, significa que este parâmetro ou método é estático.

