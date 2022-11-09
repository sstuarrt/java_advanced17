package com.spring.springdatajpa;

import java.util.List;

public interface UniversityService {
    void deleteById(Long id);

    List<University> findByName(String name);

    List<University> findByAddress(String address);

    void deleteByName(String name);

    List<University> countByNumberOfStudents(int numberOfStudents);
}
