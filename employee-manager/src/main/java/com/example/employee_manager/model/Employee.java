package com.example.employee_manager.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
@Entity
@Table(name = "employees")

public class Employee {
    @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 @NotBlank(message = "Full name is required")
 @Size(max = 100, message = "Name must be at most 100 characters")
 private String fullName;
 @NotBlank(message = "Email is required")
 @Email(message = "Enter a valid email address")
 @Column(unique = true)
 private String email;
 @NotBlank(message = "Phone number is required")
 @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be exactly 10 digits")
 private String phone;

 @NotNull(message = "Age is required")
 @Min(value = 18, message = "Age must be at least 15")
 @Max(value = 100, message = "Age must be at most 100")
 private Integer age;
 public Employee() {
 }
 public Long getId() { return id; }
 public void setId(Long id) { this.id = id; }
 public String getFullName() { return fullName; }
 public void setFullName(String fullName) { this.fullName = fullName; }
 public String getEmail() { return email; }
 public void setEmail(String email) { this.email = email; }
 public String getPhone() { return phone; }
 public void setPhone(String phone) { this.phone = phone; }
 public Integer getAge() { return age; }
 public void setAge(Integer age) { this.age = age; }
    
}
