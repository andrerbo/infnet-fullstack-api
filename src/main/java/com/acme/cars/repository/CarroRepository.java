package com.acme.cars.repository;

import com.acme.cars.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarroRepository extends JpaRepository<Carro, Long> {

    @Query("SELECT DISTINCT c.cor FROM Carro c")
    List<String> findDistinctByCor();

    @Query("SELECT DISTINCT c.pais FROM Carro c")
    List<String> findDistinctByPais();

    @Query("SELECT DISTINCT c.fabricante FROM Carro c")
    List<String> findDistinctByFabricante();

}
