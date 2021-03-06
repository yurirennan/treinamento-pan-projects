package criacao;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class JsonArray {

    //This method creates an JSONArray of labels in which those are generated by their positions
    private static org.json.JSONArray listNumberArray(int max){
        org.json.JSONArray res = new org.json.JSONArray();
        for (int i=0; i<max;i++) {
            //The value of the labels must be an String in order to make it work
            res.put(String.valueOf(i));
        }
        return res;
    }

    //Cria um array de string
    private static void JSONExampleArray1() {
        //Criamos a String
        String arrayStr =
                "["+"true,"+"false,"+ "\"true\","+ "\"false\","+"\"hello\","+"23.45e-4,"+
                        "\"23.45\","+"42,"+"\"43\","+"["+"\"world\""+"],"+
                        "{"+
                        "\"key1\":\"value1\","+
                        "\"key2\":\"value2\","+
                        "\"key3\":\"value3\","+
                        "\"key4\":\"value4\""+
                        "},"+
                        "0,"+"\"-1\""+
                        "]";

        //E passamos como parametro no construtor
        org.json.JSONArray array = new org.json.JSONArray(arrayStr);
        System.out.println("Values array: "+ array);

        //Podemos passar o array para formato JSON mas precisamos criar as chaves
        //Aqui utilizamos outra funcção que retorna as chaves de 0 até N-1 (N = tamanho do array)

        org.json.JSONArray list = listNumberArray(array.length());
        System.out.println("Label Array: "+ list.toString());

        //Agora constuimos chamando o array com a função toJSONObject passando como parametro
        // as chaves
        JSONObject object = array.toJSONObject(list);
        System.out.println("Final JSONOBject: " + object);
    }

    private static void JSONExampleArray2() {

        //Podemos também criar o array vazio, adicionando os elementos depois

        org.json.JSONArray array = new org.json.JSONArray();

        //Adicionamos os elementos com a função put()

        array.put("value");
        array.put(5);
        array.put(-23.45e67);
        array.put(true);

        //E então convertemos o array em JSON object

        //Criamos as chaves igual ao exemplo anterior
        org.json.JSONArray list = listNumberArray(array.length());

        JSONObject object = array.toJSONObject(list);
        System.out.println("Final JSONOBject: " + object);
    }


    public static void main(String[] args) {
        JSONExampleArray1();
        JSONExampleArray2();


    }

}
