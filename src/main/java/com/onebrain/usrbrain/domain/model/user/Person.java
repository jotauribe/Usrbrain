package com.onebrain.usrbrain.domain.model.user;

import com.onebrain.common.AlwaysValidEntity;

import java.util.Date;

/**
 * Created by Jota on 13/09/2016.
 */
public class Person extends AlwaysValidEntity{

    private UserId userId;
    private FullName name;
    private Date birthDate;
    private ContactInformation contactInfo;

    public Person(UserId userId,
                  FullName fullName,
                  Date birthDate,
                  ContactInformation contactInfo){

        this.setUserId(userId);
        this.setName(fullName);
        this.setBirthDate(birthDate);
        this.setContactInformation(contactInfo);
    }

    protected void setName(FullName aName) {
        this.assertArgumentNotNull(aName, "The person name can not be null");

        this.name = aName;
    }

    protected void setBirthDate(Date birthDate) {
        this.assertArgumentNotNull(birthDate, "The person birth date can not be null");

        this.birthDate = birthDate;
    }

    protected void setContactInformation(ContactInformation aContactInformation) {
        this.assertArgumentNotNull(aContactInformation, "The person contact information can not be null");

        this.contactInfo = aContactInformation;
    }

    protected void setUserId(UserId aUserId) {
        this.assertArgumentNotNull(aUserId, "The UserId can not be null");

        this.userId = aUserId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "userId=" + userId +
                ", name=" + name +
                ", contactInfo=" + contactInfo +
                '}';
    }
}
