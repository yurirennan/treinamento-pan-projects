import java.util.ArrayList;
import java.util.HashMap;

public class AquecimentoListaArray {

    public static void main(String[] args) {
        HashMap<String, String> hashMapinho = new HashMap<>();

        hashMapinho.put("procuro", "fui achado hash");
        hashMapinho.put("procuro 2", "fui achado hash 2");

        String value = hashMapinho.get("procuro");
        System.out.println(value);

        System.out.println("-----------------------------------------------");

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Topico 1");
        lista.add("Topico 2");

        String str1 = lista.get(0);
        System.out.println(str1);
    }
}
