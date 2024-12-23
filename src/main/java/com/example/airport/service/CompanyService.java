package com.example.airport.service;

//Internal Imports
import com.example.airport.exception.ObjectNotFoundException;
import com.example.airport.models.entities.Company;
import com.example.airport.repositories.CompanyRepository;

//External Imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

//Java Imports
import java.util.List;
import java.util.Optional;

@Configuration
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> searchAllCompanies() {

        return companyRepository.findAll();

    }

    public Company searchCompanyByID(Long id) {

        Optional<Company> company = companyRepository.findById(id);
        return company.orElseThrow(() -> new
                ObjectNotFoundException("Company not found"));

    }

    public Company saveCompany(Company company){

        return companyRepository.save(company);

    }

    public Company updateCompany(Long id, Company company) {

        Company companyDB = companyRepository.findById(id).orElse(null);

        if (companyDB != null) {
            companyDB.setId(companyDB.getId());
            companyDB.setName(companyDB.getName());
            return companyRepository.save(companyDB);
        } else {
            return null;
        }

    }

    public String deleteCompany(Long id){

        Company company = companyRepository.findById(id).orElse(null);

        if(company != null){
            companyRepository.deleteById(id);
            return "Company deleted!";
        }
        return "Company not found.";

    }

}