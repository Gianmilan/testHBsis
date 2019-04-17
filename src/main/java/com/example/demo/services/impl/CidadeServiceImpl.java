package com.example.demo.services.impl;

import com.example.demo.documents.CidadeDocument;
import com.example.demo.repositories.CidadesRepository;
import com.example.demo.services.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeServiceImpl implements CidadeService {

    private final CidadesRepository cidadesRepository;

    @Autowired
    public CidadeServiceImpl(CidadesRepository cidadesRepository) {
        this.cidadesRepository = cidadesRepository;
    }

    @Override
    public List<CidadeDocument> listarCidades() {
        return this.cidadesRepository.findAll();
    }

    @Override
    public void cadastrarCidade(CidadeDocument cidade) {
        this.cidadesRepository.save(cidade);
    }
}
