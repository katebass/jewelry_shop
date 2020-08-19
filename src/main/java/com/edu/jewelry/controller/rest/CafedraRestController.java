package com.edu.jewelry.controller.rest;

import com.edu.jewelry.model.Cafedra;
import com.edu.jewelry.service.cafedra.impls.CafedraServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/cafedra")
@RestController
public class CafedraRestController {

    @Autowired
    CafedraServiceImpl cafedraService;

    @RequestMapping("/hello")
    String getHello() {
        return "Hello from controller";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List<Cafedra> getCafedrasList() {
        return cafedraService.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    Cafedra getCafedra(@PathVariable("id") String id) {
        return cafedraService.get(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    Cafedra deleteCafedra(@PathVariable("id") String id){
        return cafedraService.delete(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Cafedra createCafedra(@RequestBody Cafedra cafedra){
        return cafedraService.create(cafedra);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    Cafedra updateCafedra(@RequestBody Cafedra cafedra){
        return cafedraService.update(cafedra);
    }

}
