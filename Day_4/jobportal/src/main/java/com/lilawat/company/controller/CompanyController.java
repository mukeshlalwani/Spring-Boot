package com.lilawat.company.controller;

import com.lilawat.company.dto.CompanyDto;
import com.lilawat.company.service.ICompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/companies")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:5173"})
public class CompanyController {

    private final ICompanyService companyService;

//    @Autowired
//    public CompanyController(ICompanyService companyService) {
//        this.companyService = companyService;
//    }

    @GetMapping(version="1.0" )
    public ResponseEntity<List<CompanyDto>> getAllCompanies() {
        List<CompanyDto> companiesList = companyService.getAllCompanies();
//        return ResponseEntity.ok().body("Companies List");
        return ResponseEntity.ok().body(companiesList);
    }


}
