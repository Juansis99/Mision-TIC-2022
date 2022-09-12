package com.example.ProyectoCiclo3Grupo19ACME.repositories;

import com.example.ProyectoCiclo3Grupo19ACME.entities.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MovimientoDineroRepository extends JpaRepository<MovimientoDinero, Long> {
    @Query(value = "SELECT * FROM movimiento_dinero WHERE nit_empresa = ?", nativeQuery = true)
    public abstract List<MovimientoDinero> getMovimientoDineroByIdEmpresaList(int nit);
}
