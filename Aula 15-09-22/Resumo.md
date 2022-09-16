# Resumo de Aula

## Datas

Date, DateFormat, SimpleDateFormat e Calendar são classes do java, incluida nos pacotes `java.util`, `java.text` e `java.sql`. Essas classes contém métodos e parâmetros relacionados à medidas de tempo datas (Ninguém esperava por essa).

- Alguns métodos da classe Date:

```
    after(Date d);
    before(Date d);
    equals(Date d);
    getTime();
    setTime();
    toString();
```



---

## Formatando Datas

A classe `DateFormat` é usada para formatar a data de acordo com formatações padrão  do sistema. A classe `SimpleDateFormat` é usada para criar suas próprias formatações de data.

## Calendar

A classe `Calendar` oferece mecanismos adequados para realização de cálculos com datas ou para identificação das propriedades de uma data, como por exemplo, para identificar o dia da semana ou o dia do mês em relação ao ano.