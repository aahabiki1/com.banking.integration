package spring.com.banking.integration.service;

import org.springframework.stereotype.Service;
import spring.com.banking.integration.entity.CustomerInfo;
import spring.com.banking.integration.error.PkIdNotFound;

import java.util.List;

@Service
public interface CustomerAccountCreation{

    CustomerInfo saveCustomer(CustomerInfo customerInfo);

    List<CustomerInfo> getAll(CustomerInfo customerInfo);



    CustomerInfo getByPkId(Integer pkId) throws PkIdNotFound;
}
