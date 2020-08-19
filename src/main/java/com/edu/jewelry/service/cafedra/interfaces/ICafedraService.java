package com.edu.jewelry.service.cafedra.interfaces;

import com.edu.jewelry.model.Cafedra;
import com.edu.jewelry.service.IGenericService;

import java.util.List;

public interface ICafedraService extends IGenericService<Cafedra> {
    List<Cafedra> searchByName(String name);
    List<Cafedra> searchByString(String str);
    List<Cafedra> sortByName(String name, String order);
//    Cafedra create(Cafedra cafedra);
//    Cafedra get(String id);
//    Cafedra update(Cafedra cafedra);
//    Cafedra delete(String id);
//    List<Cafedra> getAll();


}
