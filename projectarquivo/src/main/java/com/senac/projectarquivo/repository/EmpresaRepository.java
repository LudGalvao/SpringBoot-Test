package com.senac.projectarquivo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senac.projectarquivo.entity.ListaCompatilhadaArquivo;

@Repository
public interface EmpresaRepository extends JpaRepository <ListaCompatilhadaArquivo, Long>{

}
