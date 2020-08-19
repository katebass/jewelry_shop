package com.edu.jewelry.dao.cafedra.interfaces;

import com.edu.jewelry.model.Cafedra;

import java.util.List;

public interface IDaoCafedra {
    Cafedra create(Cafedra cafedra);
    Cafedra get(String id);
    Cafedra update(Cafedra cafedra);
    Cafedra delete(String id);
    List<Cafedra> getAll();
}
