package spring.com.banking.integration.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="customer_info", schema= "sys")
public class CustomerInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pk_id")
    private int pkId;
    @Column(name= "prefix")
    private String Prefix;
    @Column(name= "name")
    @NotBlank(message = "Please enter you name")
    @Size(max= 30)
    private String name;
    @NotBlank(message = "Please enter you Surname")
    @Size(max= 30)
    @Column(name= "last_name")
    private String lastName;
    @Column(name= "phone_number")
    private Integer phoneNo;
    @Column(name= "email", unique = true)
    @Email(message = "Please enter your valid mail")
    private String email;
    @Column(name= "date_of_birth")
    private String dateOfBirth;
    @Size(min=10, max = 100)
    @Column(name= "address")
    private String address;

    @Column(name= "citizenship", nullable = false)
    private String citizenShip;
    @Column(name= "marital_status")
    @NotNull(message = "Please enter your marital status")
    private String maritalStatus;
    @Column(name= "date")
    private String date;

}
