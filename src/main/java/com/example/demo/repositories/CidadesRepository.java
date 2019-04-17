package com.example.demo.repositories;

import com.example.demo.documents.CidadeDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadesRepository extends MongoRepository<CidadeDocument, String> {
}
