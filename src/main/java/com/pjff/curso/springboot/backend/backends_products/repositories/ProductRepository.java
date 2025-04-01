package com.pjff.curso.springboot.backend.backends_products.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.pjff.curso.springboot.backend.backends_products.entities.Product;

//Vid 245, es importante agregar esto para que no haya un error entre el backend y front end
//Vid 269, para angular y react
@CrossOrigin(origins = { "http://localhost:5173", "http://localhost:4200" })
@RepositoryRestResource(path = "products")
// Vid 242
public interface ProductRepository extends CrudRepository<Product, Long> {

}
