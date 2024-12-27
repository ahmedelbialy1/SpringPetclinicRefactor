
package com.example.petclinic.repository;

import com.example.petclinic.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OwnerRepository extends JpaRepository<Owner, Integer> {
    List<Owner> findAllByLastName(String lastName);
}
