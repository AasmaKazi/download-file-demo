package com.fileDownload.demoDownloadFile.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
public class Emlopyee {

    private Integer id;
    private String name;
    private String email;
    private String address;
    private String contactNumber;
    private Integer salary;


    public Emlopyee(Integer id, String name, String email,
                    String address, String contactNumber,Integer salary) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.contactNumber = contactNumber;
        this.salary = salary;
    }
}
