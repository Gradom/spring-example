package it.dg.springexample.data.domain.dto;

import java.io.Serializable;

/**
 * @author Grasso Domenico
 *
 *         Time: 14:42:10 Date: 24 apr 2020
 * 
 */
public class UserDto implements Serializable {

	private static final long serialVersionUID = -1091302494400255469L;

	private String name;
	private String surname;

	public UserDto() {
	}

	public UserDto(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "UserDto [name=" + name + ", surname=" + surname + "]";
	}

}
