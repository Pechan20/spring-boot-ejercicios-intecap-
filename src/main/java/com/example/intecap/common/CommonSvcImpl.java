package com.example.intecap.common;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;



public class CommonSvcImpl<E, R extends CrudRepository<E, Object>> implements CommonSvc<E> {

    @Autowired
    protected R repository;

    @Override
    @Transactional
    public Iterable<E> findAll() {
        return Repository.findAll();
    }

    @Override
    @Transactional
    public Optional<E> findById(int id) {
        return Repository.findById(id);
    }

    @Override
    @Transactional
    public E save(E entity) {
        return Repository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Repository.deleteById(id);
    }

    @Override
    @Transactional
    public Iterable<E> saveAll(Iterable<E> entities) {
        return Repository.saveAll(entities);
    }

}