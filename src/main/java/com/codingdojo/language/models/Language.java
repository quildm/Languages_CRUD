package com.codingdojo.language.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Language {
		@Id
	    @GeneratedValue
	    private Long id;
	    
		@Column
		@Size(min = 3, max = 20)
	    private String name;
	    
		@Column
		@Size(min = 2, max = 20)
	    private String creator;
	    
		@Column
	    @NotNull()
	    private String currentVersion;
		
		  @Column
		    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
		    private Date created_at;

		    @Column
		    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
		    private Date updated_at;

		    
		    public Language() {

		    }

public Language(String name, String creator, String currentVersion) {
    this.name = name;
    this.creator = creator;
    this.currentVersion = currentVersion;
  }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCreator() {
	return creator;
}

public void setCreator(String creator) {
	this.creator = creator;
}

public String getCurrentVersion() {
	return currentVersion;
}

public void setCurrentVersion(String currentVersion) {
	this.currentVersion = currentVersion;
}

@PrePersist
protected void onCreate(){
    this.created_at = new Date();
}
@PreUpdate
protected void onUpdate(){
    this.updated_at = new Date();
}


}
