package com.edu.jewelry.service;
/*
 * @author Kateryna Basova
 * @version 14.08.2020
 */

import java.util.List;

public interface IGenericService<T> {
    T create(T cafedra);
    T get(String id);
    T update(T cafedra);
    T delete(String id);
    List<T> getAll();
}
