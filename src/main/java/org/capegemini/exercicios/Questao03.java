package org.capegemini.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Questao03 {

    public static void teste(String[] args) {
        Integer contagem = getQuantidadeDeAnagramasPares("ifailuhkqq");
        System.out.println(contagem);
    }

    public static Integer getQuantidadeDeAnagramasPares(String texto) {
        List<String> listaDeLetras = Arrays
                .stream(texto.split(""))
                .collect(Collectors.toList());
        return getAnagramas(listaDeLetras);
    }

    private static Integer getAnagramas(List<String> listaDeLetras) {
        int value = 0;
        for (int quantidadeDeLetras = 1; quantidadeDeLetras < listaDeLetras.size(); quantidadeDeLetras++) {
            for (int i = 0; i < listaDeLetras.size(); i++) {
                if (i + quantidadeDeLetras < listaDeLetras.size()) {
                    List<String> primeira = listaDeLetras.subList(i, i + quantidadeDeLetras).stream().sorted().collect(Collectors.toList());
                    for (int j = i + 1; j < listaDeLetras.size(); j++) {
                        if (j + quantidadeDeLetras <= listaDeLetras.size()) {
                            List<String> segunda = listaDeLetras.subList(j, j + quantidadeDeLetras).stream().sorted().collect(Collectors.toList());
                            if(primeira.equals(segunda)) {
                                value ++;
                            }
                        }
                    }
                }
            }
        }
        return value;
    }
}
