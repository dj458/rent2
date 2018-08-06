package com.uberrent.core.repository;

import com.uberrent.core.domain.Equipment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface EquipmentRepository extends CrudRepository<Equipment,Long> {

}
