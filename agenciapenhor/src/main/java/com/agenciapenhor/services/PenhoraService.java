package com.agenciapenhor.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.agenciapenhor.repository.PenhoraRepository;

@Service
public class PenhoraService {

    private final PenhoraRepository penhoraRepository;

    public PenhoraService(PenhoraRepository penhoraRepository) {
        this.penhoraRepository = penhoraRepository;
    }

    public List<Object[]> encontrarPenhorasPorAgencia(Integer agenciaId) {
        return penhoraRepository.findPenhorasPorAgencia(agenciaId);
    }
}

