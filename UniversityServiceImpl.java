package com.spring.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UniversityServiceImpl implements UniversityService{
    @Autowired
    private UniversityRepository universityRepository;

    @Override
    public void deleteById(Long id) {
        universityRepository.deleteById(id);
    }

    @Override
    public List<University> findByName(String name) {
        return universityRepository.findByName(name);
    }

    @Override
    public List<University> findByAddress(String address) {
        return universityRepository.findByAddress(address);
    }

    @Override
    public void deleteByName(String name) {
        universityRepository.deleteByName("name");
    }

    @Override
    public List<University> countByNumberOfStudents(int numberOfStudents) {
        return universityRepository.countUniversityByNumberOfStudents(numberOfStudents);
    }
}
