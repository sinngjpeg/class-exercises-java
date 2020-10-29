package com.example.livros;

import org.junit.jupiter.api.Test;

public class LivroTest {


    @Test
    public void deveCriarUmLivro(){
        Livro livro = new Livro();
        livro.setId(1L);
        livro.setNome("Iracema");
        livro.setAutor("José de Alencar");

    }

    @Test
    public void deveRetornarUmLivro(){
        Livro livro = new Livro();
        livro.getId(1L);
        livro.getNome("Iracema");
        livro.getAutor("José de Alencar");
    }
}
