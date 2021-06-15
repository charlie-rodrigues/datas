package br.com.projeto.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author Charlie
 */
public class Datas {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");  //formato simples 1
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //formato simples 2
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");//formato simples 3
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date x1 = new Date();//data agora
        Date x2 = new Date(System.currentTimeMillis());//data agora
        Date x3 = new Date(0L);//origem das datas
        Date x4 = new Date(1000L * 60L * 60L * 5L); //5 horas a mais na data
        Date y1 = sdf1.parse("26/05/2021"); //sdf1
        Date y2 = sdf2.parse("26/05/2021 22:00:00");//sdf2
        Date y3 = Date.from(Instant.parse("2021-05-26T22:00:00z"));// instant GMT
        System.out.println("____________UNDEFORMATTED_________________");
        System.out.println("x1: "+x1+" agora");
        System.out.println("x2: "+x2+" agora");
        System.out.println("x3: "+x3+" origem da data");
        System.out.println("x4: "+x4+" a data origem mais 5 horas");
        System.out.println("y1: "+y1+" aplicação do sdf1");
        System.out.println("y2: "+y2+" aplicação sdf2");
        System.out.println("y3: "+y3+" aplicação sdf3 GMT");
         System.out.println("______________UTC_______________");
        System.out.println("x1: "+sdf2.format(x1));
        System.out.println("x2: "+sdf2.format(x2));
        System.out.println("x3: "+sdf2.format(x3));
        System.out.println("x4: "+sdf2.format(x4));
        System.out.println("y1: "+sdf2.format(y1));
        System.out.println("y2: "+sdf2.format(y2));
        System.out.println("y3: "+sdf2.format(y3));
         System.out.println("______________GMT_______________");
        System.out.println("x1: "+sdf3.format(x1));
        System.out.println("x2: "+sdf3.format(x2));
        System.out.println("x3: "+sdf3.format(x3));
        System.out.println("x4: "+sdf3.format(x4));
        System.out.println("y1: "+sdf3.format(y1));
        System.out.println("y2: "+sdf3.format(y2));
        System.out.println("y3: "+sdf3.format(y3));
    }

}
