package com.tts.demo.repository;

import com.tts.demo.model.Zipcode;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ZipcodeRepository extends JpaRepository<Zipcode, Long> {
    public Zipcode findByZip(String zipCode);

}

















