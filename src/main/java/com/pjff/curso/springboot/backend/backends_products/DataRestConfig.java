package com.pjff.curso.springboot.backend.backends_products;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.pjff.curso.springboot.backend.backends_products.entities.Product;

@Configuration
public class DataRestConfig implements RepositoryRestConfigurer {

    // V-243,paso 1.5
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        // Para ver el id
        config.exposeIdsFor(Product.class);
    }

}
