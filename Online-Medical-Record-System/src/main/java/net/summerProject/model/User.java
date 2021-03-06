package net.summerProject.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "userProfile")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	private String username; // username is the unique identifier for the user
	
	private String firstName;
    private String lastName;
    private String password;
    private String passwordConfirm;
    private String email;
    private String dateofbirth;
   
    //Relational Mapping between User entity and the Medical Record and Doctor entity 

    @OneToOne(mappedBy = "user", cascade = CascadeType.MERGE)
    private MedicalRecord medicalRecord;
    
    @ManyToMany
    @JoinTable(name = "user_doctor", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "doctor_id"))
    private Set<Doctor> doctor; 
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Appointment> appointments;  
    
    
    //getters and setters
    
    public Long getId() {
       return id;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Transient
    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
   
	public MedicalRecord getMedicalRecord() {
		return medicalRecord;
	}
	
	public void setMedicalRecord(MedicalRecord medicalRecord) {
		this.medicalRecord = medicalRecord;
	}
	
	public Set<Doctor> getDoctor() {
		return doctor;
	}
	
	public void setDoctor(Set<Doctor> doctor) {
		this.doctor = doctor;
	}
	
	public Set<Appointment> getAppointments() {
		return appointments;
	}
	
	public void setAppointments(Set<Appointment> appointments) {
		this.appointments = appointments;
	}

}