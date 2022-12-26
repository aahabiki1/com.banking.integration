package spring.com.banking.integration.dto;

import lombok.AllArgsConstructor;
import spring.com.banking.integration.entity.CustomerInfo;
import spring.com.banking.integration.model.NewApplicantRequest;

@AllArgsConstructor
public class CustomerDto {
    private final NewApplicantRequest newApplicantRequest;
    private final CustomerInfo customerInfo;



}
