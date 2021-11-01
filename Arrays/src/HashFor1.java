import java.util.HashMap;
import java.util.Map;

public class HashFor1 {
    public static void main(String[] args) {
        Map<String, String> tableCursos = new HashMap<String, String>();

        tableCursos.put("Ang", "Angular9");
        tableCursos.put("J..", "Java");
        tableCursos.put("O..", "Oracle");

        for (Map.Entry<String, String> conjunto : tableCursos.entrySet()) {
            System.out.println(conjunto.getKey() + " = " + conjunto.getValue());
        }

        System.out.println("-------------------------------------");

        for (Map.Entry<String, String> conjunto : tableCursos.entrySet()) {
            if (conjunto.getKey() == "Ang") {
                System.out.println(conjunto.getKey() + " = " + conjunto.getValue());
            }
        }
    }
}
