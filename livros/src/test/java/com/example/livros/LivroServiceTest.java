package com.example.livros;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LivroServiceTest {

    @Test
    public void deveRetornarUmaListaDeLivros(){
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro(2L, "Dom Casmurro","Machado De Assis"));
        livros.add(new Livro(3L,"O Colecionador de Ossos","Jeffery Deaver"));
        assertEquals(2, livros.size());
    }
}
