
package com.example.petclinic.service;

import com.example.petclinic.model.Owner;

import java.util.List;

public interface OwnerService {
    List<Owner> findAll();
    Owner findById(Integer id);
    void save(Owner owner);
    List<Owner> findAllByLastName(String lastName);
}
