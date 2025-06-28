package com.melikeuckol.Spring.Boot.Thymleaf.model;

import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.util.List;

public class User {
    @NotBlank(message = "Ad boş olamaz")
    @Size(min = 3 ,message = "Ad en az 3 karakter olmalı")
    private String name;

    @NotBlank(message = "Soyad boş olamaz")
    private String surname;

    @NotBlank(message = "E-posta boş olamaz")
    @Email(message = "Geçerli bir e-posta adresi girin.")
    private String email;

    @NotBlank(message = "Şifre boş olamaz")
    @Size(min = 6,message = "Minimum 6 karakter olmalı.")
    private String password;

    @NotBlank(message = "Cinsiyet seçilmeli.")
    private String gender;

    @NotNull (message = "Doğum tarihi boş olamaz.")
    @Past(message = "Doğum tarihi geçmişte olmalı.")
    private LocalDate birthDate;

    @NotBlank(message = "Ülke seçilmeli")
    private String country;

    private List<String> hobbies;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}
