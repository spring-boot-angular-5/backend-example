package com.example.demo.certification;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class CertificationParticipant {
	@Id
	@GeneratedValue
	private Long certificationParticipantId;
	private String title;
}
