package com.sonu.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER_DETAILS")
public class UserDetails {

    @Id
    //in below lines we are using GeneratedValue & GenericGenerator to generate UUID as ID
    //if you manually want to add then you can remove GeneratedValue & GenericGenerator
    @GeneratedValue(generator = "gen_uuid")
    @GenericGenerator(name = "gen_uuid", strategy = "uuid2")
    @Column(name = "USER_ID")
    String userId;
    @Column(name = "USER_NAME")
    String userName;
    @Column(name = "USER_DOB")
    LocalDate userDOB;
    @Column(name = "USER_PHONE_NUMBER")
    Long userPhoneNumber;

}
