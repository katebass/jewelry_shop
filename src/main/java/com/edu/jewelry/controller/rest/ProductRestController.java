package com.edu.jewelry.controller.rest;
/*
 * @author Kateryna Basova
 * @version 18.08.2020
 */

import com.edu.jewelry.model.Product;
import com.edu.jewelry.responses.JsonResponse;
import com.edu.jewelry.service.product.impls.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/products")
@RestController
public class ProductRestController {

    @Autowired
    ProductServiceImpl productService;

    @CrossOrigin
    @RequestMapping("/hello")
    String getHello() {
        return "Hello from product rest controller";
    }

    @CrossOrigin
    @RequestMapping(value = "", method = RequestMethod.GET)
    List<Product> getProductsList() {
        return productService.getAll();
    }

    @CrossOrigin
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Product getProduct(@PathVariable("id") String id) {
        return productService.get(id);
    }

    @CrossOrigin
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    Product deleteProduct(@PathVariable("id") String id){
        return productService.delete(id);
    }

    @CrossOrigin
    @RequestMapping(value = "", method = RequestMethod.POST)
    Product createProduct(@RequestBody Product product){
        return productService.create(product);
    }

    @CrossOrigin
    @RequestMapping(value = "", method = RequestMethod.PUT)
    Product updateProduct(@RequestBody Product product){
        return productService.update(product);
    }
}
