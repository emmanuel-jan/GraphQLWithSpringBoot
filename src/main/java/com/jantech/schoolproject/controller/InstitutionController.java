package com.jantech.schoolproject.controller;

import java.util.Optional;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.jantech.schoolproject.models.Institution;
import com.jantech.schoolproject.repo.InstitutionRepo;

@Controller
public class InstitutionController {

    private final InstitutionRepo institutionRepo;

    public InstitutionController(InstitutionRepo institutionRepo){
        this.institutionRepo = institutionRepo;
    }
    
    @QueryMapping
    Iterable<Institution> institutions(){
        return institutionRepo.findAll();
    }

    @QueryMapping
    Optional<Institution> institutionById(@Argument Long id){
        return institutionRepo.findById(id);
    }

}
