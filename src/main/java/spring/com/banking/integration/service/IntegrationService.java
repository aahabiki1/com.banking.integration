package spring.com.banking.integration.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.com.banking.integration.config.ModelMapping;
import spring.com.banking.integration.entity.CustomerInfo;
import spring.com.banking.integration.model.NewApplicantRequest;

@Service
@AllArgsConstructor
public class IntegrationService {

    @Autowired
    private ModelMapping modelMapping;


    public NewApplicantRequest userToDto (CustomerInfo customerInfo){
        NewApplicantRequest newApplicantRequest = this.modelMapping.modelMapper().map(customerInfo,NewApplicantRequest.class);
        return  newApplicantRequest;
    }
    public CustomerInfo dtoToUser (NewApplicantRequest newApplicantRequest){
        CustomerInfo customerInfo = this.modelMapping.modelMapper().map(newApplicantRequest, CustomerInfo.class);
        return customerInfo;
    }
}
