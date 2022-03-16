package com.spring.boot.ems.model;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Transient;

@Entity
public class User implements Serializable {
    private static final long serialVersionUID = 8404628707234409704L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

   
    private String name;

   
    private String email;

   
    private String password;

    // used only when resetting passwords, no need to store that
    @Transient
       private String passwordNew;

    @Column(columnDefinition = "BOOLEAN DEFAULT false")
    private boolean enabled;

    @Column(columnDefinition = "BOOLEAN DEFAULT false")
    private boolean blocked;

    private String activationToken;

    private String resetToken;

    private ZonedDateTime registered;

   
    private List<Enquiry> enquiriesProgress = new ArrayList<>();


    private List<Enquiry> enquiriesClosed = new ArrayList<>();


    // when user added
    @PrePersist
    protected void onCreate() {
        registered = ZonedDateTime.now();
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getResetToken() {
        return resetToken;
    }


    public void setResetToken(String resetToken) {
        this.resetToken = resetToken;
    }

    public boolean isBlocked() {
        return blocked;
    }


    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }


    public String getPasswordNew() {
        return passwordNew;
    }


    public void setPasswordNew(String passwordNew) {
        this.passwordNew = passwordNew;
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


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public boolean isEnabled() {
        return enabled;
    }


    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    public String getActivationToken() {
        return activationToken;
    }


    public void setActivationToken(String activationToken) {
        this.activationToken = activationToken;
    }


    public ZonedDateTime getRegistered() {
        return registered;
    }


    public void setRegistered(ZonedDateTime registered) {
        this.registered = registered;
    }


    public List<Enquiry> getEnquiriesProgress() {
        return enquiriesProgress;
    }


    public void setEnquiriesProgress(List<Enquiry> enquiriesProgress) {
        this.enquiriesProgress = enquiriesProgress;
    }


    public List<Enquiry> getEnquiriesClosed() {
        return enquiriesClosed;
    }


    public void setEnquiriesClosed(List<Enquiry> enquiriesClosed) {
        this.enquiriesClosed = enquiriesClosed;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((activationToken == null) ? 0 : activationToken.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + (enabled ? 1231 : 1237);
        result = prime * result + ((enquiriesClosed == null) ? 0 : enquiriesClosed.hashCode());
        result = prime * result + ((enquiriesProgress == null) ? 0 : enquiriesProgress.hashCode());
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        result = prime * result + ((registered == null) ? 0 : registered.hashCode());
        //result = prime * result + ((roles == null) ? 0 : roles.hashCode());
        return result;
    }


    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", email=" + email +
                ", password=" + password + ", enabled=" + enabled +
                ", activationToken=" + activationToken +
                ", registered=" + registered + ",        enquiriesProgress=" + enquiriesProgress.size() +
                ", enquiriesClosed=" + enquiriesClosed.size() + "]";
    }


}


