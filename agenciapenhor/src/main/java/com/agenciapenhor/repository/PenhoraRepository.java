package com.agenciapenhor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.agenciapenhor.entity.Penhora;

@Repository 
public interface PenhoraRepository extends JpaRepository<Penhora, Integer> {
	@Query("SELECT a.nome AS Nome_Agencia, op.descricao AS Descricao_Objeto, p.valor AS Valor_Penhora " +
            "FROM Penhora p " +
            "JOIN p.agencia a " +
            "JOIN p.objetoPenhorado op " +
            "ORDER BY a.nome")
    List<Object[]> findPenhorasPorAgencia(int agenciaId);
}
