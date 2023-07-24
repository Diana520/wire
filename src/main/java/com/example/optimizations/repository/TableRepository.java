package com.example.optimizations.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.optimizations.entity.Wire;

@Repository
public interface TableRepository extends CrudRepository<Wire, Long> {

}
