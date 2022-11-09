package com.spring.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UniversityRepository extends JpaRepository<University, Long>{

    List<University> findByName(String name);

    List<University> findByAddress(String address);

    List<University> deleteByName(String name);

    List<University> deleteById(int id);

    List<University> countUniversityByNumberOfStudents(int number);
}
