package com.example.livros;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LivroTest {


    private Livro livro;

    @BeforeEach
    public void setUp(){

        livro = new Livro();

    }

    @Test
    public void deveCriarUmLivro(){
        livro.setId(1L);
        livro.setNome("Iracema");
        livro.setAutor("José de Alencar");

    }

    @Test
    public void deveRetornarUmLivro(){

    }
}
