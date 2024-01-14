package jani.food.diner.core.service.map;

import jani.food.diner.core.model.BaseEntity;

import java.util.*;

public class AbstractMapService<T extends BaseEntity,ID extends Long>{

    protected Map<Long,T> map = new HashMap<>();

    public Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    public T findById(ID id){
        return map.get(id);
    }

    public T save(T object){
        if(object != null){
            if(object.getId() == null){
                object.setId(getNextId());
            }
            map.put(object.getId(),object);
        }else{
            throw new RuntimeException("Object Not Found");
        }
        return object;
    }

    public Long getNextId(){
        Long nextId = null;
        try {
            nextId = Collections.max(map.keySet());
            nextId++;
        }catch (NoSuchElementException e){
            nextId = 1L;
        }
        return nextId;
    }
    public void deleteById(ID id) {
        map.remove(id);
    }

    public void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
}
