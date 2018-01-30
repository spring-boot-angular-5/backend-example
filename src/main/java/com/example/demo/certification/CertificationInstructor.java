package com.example.demo.certification;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class CertificationInstructor {
	@Id
	@GeneratedValue
	private Long certificationInstructorId;
}
