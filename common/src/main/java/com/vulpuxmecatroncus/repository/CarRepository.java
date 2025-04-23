package com.vulpuxmecatroncus.repository;

import org.springframework.data.repository.CrudRepository;
import com.vulpuxmecatroncus.model.Car;

public interface CarRepository extends CrudRepository<Car, Long> {
    
}
