package com.NCcourses.hw1_1;

import java.util.Objects;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(){}

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return getGender() == author.getGender()
                && Objects.equals(getName(), author.getName())
                && Objects.equals(getEmail(), author.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getEmail(), getGender());
    }
}
