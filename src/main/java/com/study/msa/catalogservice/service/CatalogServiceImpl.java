package com.study.msa.catalogservice.service;

import com.study.msa.catalogservice.domain.CatalogEntity;
import com.study.msa.catalogservice.repository.CatalogRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Data
@Service
@RequiredArgsConstructor
public class CatalogServiceImpl implements CatalogService{

    private final CatalogRepository catalogRepository;

    @Override
    public Iterable<CatalogEntity> getAllCatalogs() {
        return catalogRepository.findAll();
    }
}
