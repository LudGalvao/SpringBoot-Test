package com.agenciapenhor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agenciapenhor.repository.PenhoraRepository;
import com.agenciapenhor.services.PenhoraService;

@RestController
@RequestMapping("/agencias")
public class PenhoraController {
    private final PenhoraService penhoraService;
    private final PenhoraRepository penhoraRepository;
    
    @Autowired
    public PenhoraController(PenhoraService penhoraService, PenhoraRepository penhoraRepository) {
        this.penhoraService = penhoraService;
        this.penhoraRepository = penhoraRepository;
    }

    @GetMapping("/{agenciaId}/penhoras")
    public List<Object[]> getPenhorasPorAgencia(@PathVariable("agenciaId") Integer agenciaId) {
        return penhoraRepository.findPenhorasPorAgencia(agenciaId);
    }
}
