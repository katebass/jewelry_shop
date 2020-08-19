package com.edu.jewelry.service.cafedra.interfaces;
/*
 * @author Kateryna Basova
 * @version 14.08.2020
 */

import com.edu.jewelry.model.Cafedra;

import java.util.List;

public interface ICafedraBusinessInterface {
    Cafedra findBestCafedra();
    List<Cafedra> sortByName(String name, String order);
}
