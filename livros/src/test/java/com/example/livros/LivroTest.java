package com.example.livros;

import org.junit.jupiter.api.Test;

public class LivroTest {


    @Test
    public void deveCriarUmLivro(){
        Livro livro = new Livro();
        livro.setId((long) 1);
        livro.setNome("Iracema");
        livro.setAutor("José de Alencar");

    }

    @Test
    public void deveRetornarUmLivro(){
        Livro livro = new Livro();
        livro.getId((long) 1);
        livro.getNome("Iracema");
        livro.getAutor("José de Alencar");
    }
}
