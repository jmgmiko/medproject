/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rococo.springboot.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author UESR
 */
@Embeddable
public class DiseaseMedicineId implements Serializable {

    @Column(name = "disease_id")
    private Integer disease;
    
    @Column(name = "medicine_id")
    private Integer medicine;
    
    public DiseaseMedicineId() {
    }
    
    public DiseaseMedicineId(Integer diseaseId, Integer medId) {
        this.disease = diseaseId;
        this.medicine = medId;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
 
        if (o == null || getClass() != o.getClass()) 
            return false;
 
        DiseaseMedicineId that = (DiseaseMedicineId) o;
        return Objects.equals(disease, that.disease) && 
               Objects.equals(medicine, that.medicine);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(disease, medicine);
    }
}
