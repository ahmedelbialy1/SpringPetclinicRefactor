
package com.example.petclinic.controller;

import com.example.petclinic.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.WebDataBinder;

@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @InitBinder("owner")
    public void initOwnerBinder(WebDataBinder dataBinder) {
        validateOwner(dataBinder);
        setAllowedFields(dataBinder);
    }

    private void validateOwner(WebDataBinder dataBinder) {
        // Add owner-specific validation logic here if needed
    }

    private void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }
}
