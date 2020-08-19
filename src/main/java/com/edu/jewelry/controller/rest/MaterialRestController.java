package com.edu.jewelry.controller.rest;
/*
 * @author Kateryna Basova
 * @version 18.08.2020
 */

import com.edu.jewelry.model.Material;
import com.edu.jewelry.service.material.impls.MaterialServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/materials")
@RestController
public class MaterialRestController {
    @Autowired
    MaterialServiceImpl materialService;

    @RequestMapping("/hello")
    String getHello() {
        return "Hello from material rest controller";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Material> getMaterialsList() {
        return materialService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Material getMaterial(@PathVariable("id") String id) {
        return materialService.get(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    Material deleteMaterial(@PathVariable("id") String id){
        return materialService.delete(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    Material createMaterial(@RequestBody Material material){
        return materialService.create(material);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    Material updateMaterial(@RequestBody Material material){
        return materialService.update(material);
    }
}