package com.example.demo.services;

import com.example.demo.documents.CidadeDocument;

import java.util.List;

public interface CidadeService {
    List<CidadeDocument> listarCidades();
    void cadastrarCidade(CidadeDocument cidade);
}
