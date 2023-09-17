package atos.user.register.model;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Username is required")
    private String username;

    @NotNull(message = "Birthdate is required")
    private LocalDate birthdate;

    @NotBlank(message = "Country of residence is required")
    private String countryOfResidence;

    private String phoneNumber;
    private String gender;
	public Long getId() {
		return id;
	}
	
	public User() {
		
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	public String getCountryOfResidence() {
		return countryOfResidence;
	}
	public void setCountryOfResidence(String countryOfResidence) {
		this.countryOfResidence = countryOfResidence;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public User(Long id, @NotBlank(message = "Username is required") String username,
			@NotNull(message = "Birthdate is required") LocalDate birthdate,
			@NotBlank(message = "Country of residence is required") String countryOfResidence, String phoneNumber,
			String gender) {
		super();
		this.id = id;
		this.username = username;
		this.birthdate = birthdate;
		this.countryOfResidence = countryOfResidence;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
	}

   
}

