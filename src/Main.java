import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Exercicio 1:
        ArrayList<String> list = new ArrayList();
        list.add("Banana");
        list.add("Maça");
        list.add("Laranja");
        list.add("Pera");
        list.add("Uva");
        System.out.println(list.size());
        System.out.println(list.get(2));
        list.remove(0);
        System.out.println(list.contains("Maça"));
        System.out.println("===================");
        list.forEach(item -> System.out.println(item));

        //Exercicio 2:
        Set<String> cores = new HashSet<>();

        cores.add("Amarelo");
        cores.add("Roxo");
        cores.add("Preto");
        cores.add("Marrom");
        cores.add("Rosa");

        System.out.println(cores.size());
        cores.add("Amarelo");
        cores.remove("Amarelo");
        System.out.println(cores.contains("Amarelo"));
        cores.forEach(cor -> System.out.println(cor));

        //Exercicio 3:
        ArrayList<Integer> numeros = new ArrayList();
        Set<Integer> number = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        number.add(1);
        number.add(2);
        number.add(3);
        //Garante que será na Ordem correta.
        System.out.println("========================");
        numeros.forEach(item -> System.out.println(item));
        //Não contém ordem em especifico.
        System.out.println("===========================");
        number.forEach(item -> System.out.println(item));

        //exercicio 4:
        ArrayList<String> palavras = new ArrayList<>();
        palavras.add("A");
        palavras.add("B");
        palavras.add("C");
        palavras.add("D");
        Set<String> palavrasHash = new HashSet<String>(palavras);

        palavrasHash.forEach(item -> System.out.println(item));

        palavras = new ArrayList<>(palavrasHash);
        palavras.forEach(item -> System.out.println(item));

        //Exercicio 5:
        ArrayList<Integer> inteiros = new ArrayList<>();
        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(3);
        inteiros.add(4);
        inteiros.add(5);
        inteiros.removeIf(inteiro -> inteiro % 2 == 0);
        Set<Integer> setInteiros = new HashSet<>(inteiros);
        System.out.println(inteiros.contains(3));
    }
}