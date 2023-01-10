package edu.upc.dsa.andoroid_dsa.models;

public class Credentials {
    String email;
    String password;

    public Credentials(){}

    public Credentials(String email, String password){
        this.email =email;
        this.password=password;
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
}