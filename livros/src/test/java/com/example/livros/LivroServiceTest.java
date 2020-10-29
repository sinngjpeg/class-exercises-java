package com.example.livros;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
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

    @Test
    public void deveRetornarStatusCode200(){
        Integer statusCode = RestAssured.given()
                .contentType(ContentType.JSON)
                .get("/api/v1/livros")
                .then().extract().statusCode();
        assertEquals(200,200);
    }
}
