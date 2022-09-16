import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        Date data1 = new Date();             //cria uma nova data
        System.out.println(data1);
        System.out.println(data1.getTime()); 

        Thread.sleep(2000);

        Date data2 = new Date();             
        System.out.println(data2);
        long  tempo2 = data2.getTime(); //pega o tempo desde 1970 até a criação do objeto (em milisegundos)

        long milissegundosPorDia = 1000*60*60*24;

        System.out.println("Número de dias desde 1970: "+tempo2/milissegundosPorDia);
        System.out.println("Número de meses desde 1970: "+tempo2/milissegundosPorDia/30);
        System.out.println("Número de anos desde 1970: "+tempo2/milissegundosPorDia/365);

        System.out.println(milissegundosPorDia);

        Date agora = new Date();
        DateFormat df1, df2, df3, df4, df5;
        String f1, f2, f3, f4, f5;

        df1 = DateFormat.getDateInstance();
        df2 = DateFormat.getDateInstance(DateFormat.SHORT);     //formata de forma curta
        df3 = DateFormat.getDateInstance(DateFormat.MEDIUM);    //   "    "    "   média
        df4 = DateFormat.getDateInstance(DateFormat.LONG);      //   "    "    "   longa
        df5 = DateFormat.getDateInstance(DateFormat.FULL);      //   "    "    "   completa

        f1 = df1.format(agora);
        f2 = df2.format(agora);
        f3 = df3.format(agora);
        f4 = df4.format(agora);
        f5 = df5.format(agora);

        System.out.println("Formato default: "+ f1);
        System.out.println("Formato SHORT: "+ f2);
        System.out.println("Formato MEDIUM: "+ f3);
        System.out.println("Formato LONG: "+ f4);
        System.out.println("Formato FULL: "+ f5);


        Date hoje = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, Locale.JAPAN);
        System.out.println("Hoje no Japão: "+df.format(hoje));
        df = DateFormat.getDateInstance(DateFormat.FULL, Locale.TRADITIONAL_CHINESE);
        System.out.println("Hoje na China: "+df.format(hoje));
        df = DateFormat.getDateInstance(DateFormat.FULL, Locale.KOREA);
        System.out.println("Hoje na Coreia: "+df.format(hoje));

        
        Date a = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("dia/mes/ano: "+sdf.format(a));
        

        Date b = new Date();
        Calendar calendar = Calendar.getInstance();
        int dia = calendar.get(Calendar.DATE);
        int mes = calendar.get(Calendar.MONTH);

        System.out.println(""+dia+" "+(mes+1));
        
    }
}
