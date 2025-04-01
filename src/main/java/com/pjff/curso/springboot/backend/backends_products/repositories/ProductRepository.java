package com.pjff.curso.springboot.backend.backends_products.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.pjff.curso.springboot.backend.backends_products.entities.Product;

/*
  V-245,paso 4.4 es importante agregar esto para que no haya un error entre el backend 
  y front end de cross origin

  Vid 269, para angular y react
*/
@CrossOrigin(origins = { "http://localhost:5173", "http://localhost:4200" })
// Paso 1.4
@RepositoryRestResource(path = "products")

// Paso 1.1 extendemos
public interface ProductRepository extends CrudRepository<Product, Long> {

}
