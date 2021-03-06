package com.javacore.steve.profile;

import com.javacore.steve.common.BaseModel;
import java.util.Date;
public class ProfileModel extends BaseModel {
    private int id;
    private String firstName;
    private String lastName;
    private String nicktname;
    private int numberOfCrimes;
    private boolean decased;
    private String description;
    private String placeOfBirth;
    private Date dateOfDeath;
    private String placeOfDeath;



    public ProfileModel(int id, String firstName, String lastName, boolean active) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        //this.active = active;
    }

    public static ProfileModel randomModel() {
        int rId = (int) (10 * Math.random());
        boolean rActive = rId % 2 == 0;
        String rFirstName = "Steve" + rId;
        String rLastName = "Balmer" + rId;
        return new ProfileModel(rId, rFirstName, rLastName, rActive);
    }

   /* public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getName() {
        return firstName + " " + lastName;
    }

}
