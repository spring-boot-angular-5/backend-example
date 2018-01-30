package com.example.demo.user;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public enum Role {
	ADMIN(1),
	STUDENT(2),
	INSTRUCTOR(3);

	private final int roleId;

	Role(int roleId) {
		this.roleId = roleId;
	}

	public int getRoleId() {
		return roleId;
	}
}
