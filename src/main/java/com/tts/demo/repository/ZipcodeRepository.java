package com.tts.demo.repository;

import com.tts.demo.model.Zipcode;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ZipcodeRepository extends JpaRepository<Zipcode, Long> {
    public Zipcode findByZip(String zipCode);

}

















// package com.tts.demo.repository;


// import com.tts.demo.model.ZipCode;

// import org.springframework.data.jpa.repository.JpaRepository;
// // import org.springframework.stereotype.Repository;

// public interface ZipRepository extends JpaRepository<ZipCode, Long> {
//     public Zipcode findByZip(String zipCode);
// }