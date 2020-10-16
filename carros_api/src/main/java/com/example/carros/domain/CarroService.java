package com.example.carros.domain;

import com.example.carros.domain.DTO.CarroDTO;
import com.example.carros.repository.CarrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CarroService {
    @Autowired
    private CarrosRepository carrosRepository;

    public List<CarroDTO> getCarros() {
        return carrosRepository.findAll().stream().map(CarroDTO::create).collect(Collectors.toList());

    }

    public Optional<CarroDTO> getCarrosById(Long id) {
        return carrosRepository.findById(id).map(CarroDTO::create);
    }

    public List<CarroDTO> getCarrosByTipo(String tipo) {

        return carrosRepository.findByTipo(tipo).stream().map(CarroDTO::create).collect(Collectors.toList());
    }

    public Carro save(Carro carro) {
        return carrosRepository.save(carro);
    }

    public CarroDTO update(Carro carro, Long id) {
        Assert.isNull(carro.getId(), "Não foi possivel atualizar o registro");

        //Busca o carro no banco de dados
        Optional<Carro> optional = carrosRepository.findById(id);
        if (optional.isPresent()) {
            Carro db = optional.get();
            //Copiar as propriedades
            db.setNome(carro.getNome());
            db.setTipo(carro.getTipo());
            System.out.println("Carro id " + db.getId());
            //Atualiza o carro
            carrosRepository.save(db);
            return CarroDTO.create(db);
        } else {
            return null;
            // throw new RuntimeException("Não foi possivel atualizar o registro");
        }

    }

    public boolean delete(Long id) {
        if (getCarrosById(id).isPresent()) {
            carrosRepository.deleteById(id);
            return true;
        }
        return false;
    }


    public CarroDTO insert(Carro carro) {
        Assert.isNull(carro.getId(), "Nao foi possivel inserir o registro");
        return CarroDTO.create(carrosRepository.save(carro));

    }
}
