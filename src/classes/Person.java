package classes;

import java.time.LocalDate;

public class Person {

	 private final String name;
	 private final String surname;
	 private LocalDate DateOfBirth;
	 
	 public Person (String name, String surname) {
		 this.name = name;
		 this.surname = surname;
	 }
	 
// Getters & Setters
	 
	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

@Override
		public String toString() {
			return "Name: " + this.name;
		}
	 
}
