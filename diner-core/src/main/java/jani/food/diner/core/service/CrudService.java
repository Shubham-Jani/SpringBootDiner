package jani.food.diner.core.service;

import jani.food.diner.core.model.BaseEntity;

import java.util.Set;

public interface CrudService<T extends BaseEntity, ID extends Long> {
    public Set<T> findAll();

    public T findById(ID id);

    public T save(T object);

    public  void delete(T object);


}
