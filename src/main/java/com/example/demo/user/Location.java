package com.example.demo.user;

import lombok.Data;

import javax.persistence.Embeddable;
import java.math.BigDecimal;

@Data
@Embeddable
public class Location {
	private String name;
	private BigDecimal longitude;
	private BigDecimal latitude;
}
