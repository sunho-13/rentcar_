package org.example.rent;

import java.util.List;

public interface IVehicleService<T> {
    T findById(long id);
    List<T> getAllList();
    T insert(T dto) throws Exception;
    boolean remove(Long id) throws Exception;
    T update(Long id, T dto) throws Exception;


}
