package com.uom.trips.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uom.trips.model.Agency;
import com.uom.trips.model.Citizen;

public interface AgencyRepository extends JpaRepository<Agency, Integer>{
	Agency findByAfm(String afm);

}
