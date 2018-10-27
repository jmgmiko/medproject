/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rococo.springboot.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

/**
 *
 * @author UESR
 */
@Entity // This tells Hibernate to make a table out of this class
@Table(name="disease_medicine") // This tells Hibernate to name the table as Person and not PersonModel
public class DiseaseMedicine implements Serializable {
    @EmbeddedId
    private DiseaseMedicineId id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("disease")
    private DiseaseModel disease;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("medicine")
    private MedicineModel med;
    
    @Column(name = "created_on")
    private Date createdOn = new Date();
}
