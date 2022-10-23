package com.study.msa.catalogservice.service;

import com.study.msa.catalogservice.domain.CatalogEntity;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}
