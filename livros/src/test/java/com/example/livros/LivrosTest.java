package com.example.livros;

import org.junit.jupiter.api.Test;

public class LivrosTest {


    @Test
    public void deveCriarUmLivro(){
        Livro livro = new Livro();
        livro.setId(1);
        livro.setNome("Iracema");
        livro.setAutor("José de Alencar");

    }
}
