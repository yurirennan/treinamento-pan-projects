package for_json;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ModificarForWhile {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        
        //Desafio
        for (int i = 0; i < 5; i++) {
            System.out.println("Consegui " + (i + 1));
        }


        String exemple = "2021.10.10";
        Pattern pattern  = Pattern.compile("(\\d{4})[.](\\d{2})[.](\\d{2})");
        Matcher matcher = pattern.matcher(exemple);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        Pattern p  = Pattern.compile("\\d+");
        Matcher m = pattern.matcher("hello1234goodboy789very2345");
        while (m.find()) {
            System.out.println(m.group());
        }

        String text = "John speak  and John writes about that,"
                + " and John think 2021.10.10 about everything.";

        String nominho = "(John)";
        Pattern patternNominho = Pattern.compile(nominho);
        Matcher matcherNominho = patternNominho.matcher(text);


        while (matcherNominho.find()) {
            System.out.println("Found: " + matcherNominho.group());
        }
    }
}
