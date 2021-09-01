//Adriano Siqueira - 9/1/2021 - Exercício Java Map - DIO Capgemini Fullstack Java and Angular Bootcamp

/* Dada a população estimada de alguns estados do NE Brasileiro, faça:
    Estado = PE - População = 9.616.621
    Estado = Al - População = 3.351.543
    Estado = CE - População = 9.187.103
    Estado = RN - População = 3.534.265
Crie um dicionário e relacione os estados e as suas populações;
Substitua a população do estado do RN por 3.534.165;
Confira se o estado PB está no dicionário, caso nao, adicione: PB - 4.039.277;
Exiba a população de PE;
Exiba todos os estado e as suas populações na ordem em que foram informados;
Exiba os estados e as suas populações em ordem alfabética;
Exiba o estado com menor população e a sua quantidade;
Exiba o estado com maior população e a sua quantidade;
Exiba a soma da população desses estados;
Exiba a média da população desse dicionário de estados;
Remova os estados com a população menor que 4.000.000;
Apague o dicionário;
Confira se o dicionário esta vazio;
 */

import java.util.*;

public class Exercicio {
    public static void main(String[] args) {
//      Crie um dicionário e relacione os estados e as suas populações;
        Map<String, Integer> estados = new LinkedHashMap<>();
        estados.put("PE", 9616621);
        estados.put("AL", 3351543);
        estados.put("CE", 9187103);
        estados.put("RN", 3534265);

        System.out.println(estados);

        System.out.println("Substitua a população do estado do RN por 3.534.165:");
        estados.put("RN", 3534165);
        System.out.println(estados);

        System.out.println("Confira se o estado PB está no dicionário, caso nao, adicione: PB - 4.039.277:");
        if (!estados.containsKey("PB")) {
            estados.put("PB", 4039277);
        }
        System.out.println(estados);

        System.out.println("Exiba a população de PE:");
        System.out.println("População de Pernambuco: " + estados.get("PE"));

        System.out.println("Exiba todos os estado e as suas populações na ordem em que foram informados;");
        System.out.println(estados);

        System.out.println("Exiba os estados e as suas populações em ordem alfabética:");
        Map<String, Integer> estadosTree = new TreeMap<>();
        estadosTree.put("PE", 9616621);
        estadosTree.put("AL", 3351543);
        estadosTree.put("CE", 9187103);
        estadosTree.put("RN", 3534265);

        System.out.println(estadosTree);

        System.out.println("Exiba o estado com menor população e a sua quantidade");
        Integer min = Collections.min(estados.values());
        String estadoMin = "";
        for (Map.Entry<String, Integer> uf : estados.entrySet()) {
            if (uf.getValue().equals(min)) {
                estadoMin = uf.getKey();
                System.out.println("O estado menos populoso é: " + estadoMin + ", com população de: " + min + " habitantes");
            }
        }

        System.out.println("Exiba o estado com maior população e a sua quantidade:");
        Integer max = Collections.max(estados.values());
        String estadoMax = "";
        for (Map.Entry<String, Integer> uf : estados.entrySet()) {
            if (uf.getValue().equals(max)) {
                estadoMax = uf.getKey();
                System.out.println("O estado mais populoso é: " + estadoMax + ", com população de: " + max + " habitantes");
            }
        }

        System.out.println("Exiba a soma da população desses estados: ");
        Integer soma = 0;
        for (Map.Entry<String, Integer> uf :estados.entrySet()) {
            soma += uf.getValue();
        }
        System.out.println(soma);

        System.out.println("Exiba a média da população desse dicionário de estados:");
        System.out.println(soma/estados.size());

        System.out.println("Remova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator = estados.values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < 4000000) {
                iterator.remove();
            }
        }
        System.out.println(estados);

        System.out.println("Apague o dicionário");
        estados.clear();

        System.out.println("Confira se o dicionário esta vazio:");
        System.out.println(estados);
    }
}
