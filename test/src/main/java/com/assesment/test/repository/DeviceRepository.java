package com.assesment.test.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.assesment.test.model.Device;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RepositoryRestResource(collectionResourceRel = "device", path = "device")
public interface DeviceRepository extends CrudRepository<Device, Long> {

	List<Device> findByFuelFormula(String fuelFormula);
	List<Device> findByManufacturer(String lastName);
	Optional<Device> findById(Long id);

}
