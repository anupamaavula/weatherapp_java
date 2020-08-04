package com.tts.demo.model;


//import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Zipcode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @NonNull
    private Long id;

    @NonNull
    @Column(unique = true)
    private String zip;

    public Zipcode(String zip) {
        this.zip = zip;
    }

}


// @Entity
// public class ZipCode {
    
//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     private Long id;

//     @Column(name = "recent_zipcode")
//     private String zipCode;

//     @CreationTimestamp
//     private Date submittedAt;

//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public String getZipCode() {
//         return zipCode;
//     }

//     public void setZipCode(String zipCode) {
//         this.zipCode = zipCode;
//     }

//     public Date getSubmittedAt() {
//         return submittedAt;
//     }

//     public void setSubmittedAt(Date submittedAt) {
//         this.submittedAt = submittedAt;
//     }

    
// }