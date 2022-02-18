package org.example;

import org.capegemini.exercicios.Questao03;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AnagramaTest {


    @ParameterizedTest
    @MethodSource("getStrings")
    void deveRetornarONomeroDeAnagramasEncontradoNaStringInformada(String texto, Integer esperado) {

        Integer result = Questao03.getQuantidadeDeAnagramasPares(texto);
        assertEquals(esperado, result);
    }

    private static Stream<Arguments> getStrings() {
        return Stream.of(
                Arguments.of("ovo", 2),
                Arguments.of("ifailuhkqq", 3)
        );
    }


}