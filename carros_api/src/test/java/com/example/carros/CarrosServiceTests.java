package com.example.carros;

import com.example.carros.domain.Carro;
import com.example.carros.domain.CarroService;
import com.example.carros.domain.DTO.CarroDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import java.util.Optional;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class CarrosServiceTests {

    @Autowired
    private CarroService service;

    @Test
    public void criaUmCarro() {
        Carro carro = new Carro();
        carro.setNome("Ferrari");
        carro.setTipo("esportivos");

        CarroDTO c = service.insert(carro);
        assertNotNull(c);

        Long id = c.getId();
        assertNotNull(id);

        //Buscar objeto
        Optional<CarroDTO> op = service.getCarrosById(id);
        assertTrue(op.isPresent());
        c = op.get();
        assertEquals("Ferrari", c.getNome());
        assertEquals("esportivos", c.getTipo());

        //Deletar o objeto
        service.delete(id);

        //Verificar se deletou
        assertFalse(service.getCarrosById(id).isPresent());

    }

    @Test
    public void buscaCarros() {
        List<CarroDTO> carros = service.getCarros();
        assertEquals(30, carros.size());

    }

    @Test
    public void buscaListaPorTipo() {

        assertEquals(10, service.getCarrosByTipo("classicos").size());
        assertEquals(10, service.getCarrosByTipo("esportivos").size());
        assertEquals(10, service.getCarrosByTipo("luxo").size());
        assertEquals(0, service.getCarrosByTipo("x").size());
    }
}
