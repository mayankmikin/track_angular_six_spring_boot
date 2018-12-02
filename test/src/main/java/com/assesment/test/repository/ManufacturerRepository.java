package com.assesment.test.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.assesment.test.model.Manufacturer;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RepositoryRestResource(collectionResourceRel = "manufacturer", path = "manufacturer")
public interface ManufacturerRepository extends CrudRepository<Manufacturer, Long> {

}
	