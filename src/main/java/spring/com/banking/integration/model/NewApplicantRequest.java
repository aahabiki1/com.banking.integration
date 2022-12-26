package spring.com.banking.integration.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class NewApplicantRequest {

    @NotEmpty
    private String name;
    @NotEmpty
    private String lastName;
    @NotEmpty
    private String phoneNo;
    @NotEmpty
    private String email;
    @NotEmpty
    private String dateOfBirth;
    @NotEmpty
    private String address;
    @NotEmpty
    private String citizenShip;
    @NotEmpty
    private String maritalStatus;
    @NotEmpty
    private String date;
    @NotEmpty
    private String prefix;

}
