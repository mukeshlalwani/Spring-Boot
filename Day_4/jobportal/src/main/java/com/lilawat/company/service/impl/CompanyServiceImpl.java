package com.lilawat.company.service.impl;

import com.lilawat.company.Entity.Company;
import com.lilawat.company.Repository.CompanyRepository;
import com.lilawat.company.dto.CompanyDto;
import com.lilawat.company.service.ICompanyService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyServiceImpl implements ICompanyService {

    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<CompanyDto> getAllCompanies() {
        List<Company> companies = companyRepository.findAll();
      return companies.stream().map(this::transformToDto).collect(Collectors.toList());
    }

    private CompanyDto transformToDto(Company company) {
        return new CompanyDto(company.getId(), company.getName(), company.getLogo(), company.getIndustry()
                , company.getSize(),company.getRating(), company.getLocations(), company.getFounded(), company.getDescription()
                , company.getEmployee(), company.getWebsite(), company.getCreatedAt());
    }
}
