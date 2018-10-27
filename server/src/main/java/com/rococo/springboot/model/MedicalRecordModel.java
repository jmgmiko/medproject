package com.rococo.springboot.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "medical_record") // This tells Hibernate to name the table as User and not UserModel
public class MedicalRecordModel implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@NotNull
	@NotEmpty
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "patient_id")
	private PatientModel patient;

	@NotNull
	@NotEmpty
	private Double total;

        public Double getTotal() {
            return total;
        }

        public void setTotal(Double total) {
            this.total = total;
        }

	@NotNull
	@NotEmpty
	@Size(min = 2, message = "First Name should at least have 2 characters")
	@Size(max = 15, message = "FirstName should not exceed 15 characters")
	private String first_name;

	public String getFirst_name() {
		return this.first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	@NotNull
	@NotEmpty
	@Size(min = 2, message = "Last Name should at least have 2 characters")
	@Size(max = 15, message = "Last Name should not exceed 15 characters")
	private String last_name;

	public String getLast_name() {
		return this.last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	private String email;

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
        
        @Column(name = "created_on", updatable=false)
        private Date creationDate = new Date();
        
        @Column(name = "modified_on")
        private Date modificationDate = new Date();
        
        @PreUpdate
        public void setLastUpdate() {  this.modificationDate = new Date(); }

        public Date getCreationDate() {
            return creationDate;
        }

        public Date getModificationDate() {
            return modificationDate;
        }     
     
}
