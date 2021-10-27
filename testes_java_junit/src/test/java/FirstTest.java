import org.junit.Test;

public class FirstTest {
    @Test
    public void firstMethod(){}

    //Todos os testes tem que retornar void
    //@Test
    public String metodoExemploDeTesteInvalidoComRetornoDiferenteDeVoid() {
        return "";
    }

    //Todos os testes tem que ser public
    //@Test
    private void metodoExemploDeTesteInvalidoComPrivate(){}

    //@Test
    protected void metodoExemploDeTesteInvalidoComProtected(){}

    @Test
    public void metodoExemploDeTesteImpressaoNaTela(){
        System.out.println("Imprime");
    }

    //@Test
    public void metodoExemploDeTesteQueNaoImprimeNaTela(){
        System.out.println("Imprime");
    }

}
