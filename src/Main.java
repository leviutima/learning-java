
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // declaração de variáveis
        int minhaIdade = 20;
        String meuNome = "levi";

        meuNome = "LEVI YUKI UTIMA";

        // var nomeDaMinhaVariavel = "fernanda";

        // tipos primitivos
        // byte, short, int, long

        // números inteiros
        // byte => 8bits => -128 a 127
        // short => 16bits => -32.768 a 32.767
        // int => 32bits => 2.147.483.648 a 2.147.483.647
        // long => 64bits;

        // números decimais
        // float => 32bits (precisão simples)
        // double => 64bits => (precisão dupla)

        // var teste = "legal";
        boolean testes = true;

        var numero = 20;

        var nomeDoMeio = "levi utima";

        if (nomeDoMeio == "levi yuki utima") {
            System.err.println("Boa, isso mesmo");
        } else if (nomeDoMeio == "levi utima") {
            System.out.println("Acertou por pouco");
        } else {
            System.err.println("Vacilou kkkkkk");
        }

        // vetores (arrays)
        int[] colecaoDeInteiros = { 1, 2, 3, 4, 5 };
        System.err.println(colecaoDeInteiros[0]);

        // ArrayLists
        ArrayList<String> lista = new ArrayList<>();
        lista.add("levi");
        lista.add("utima");
        lista.add("teste");

        // lista.remove(0);
        System.err.println(lista);

        // loops
        // for(int i = 0; i < lista.size(); i++){
        //    System.err.println(lista.get(i)); 
        // }

        for(String listas: lista) {
            System.err.println(listas);
        }

        int contador = 0;
        while (contador < 10) {
            System.err.println(); 
            contador++;
        }

        // casting 
        double resultado = 0.0;
        int resultadoInt = (int)resultado;

        int meuInt = 10;
        double conversaoParaDouble = meuInt;

        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString);
        System.err.println(meuInt2);

        String minhaString = String.valueOf(meuInt2);
    }

}
