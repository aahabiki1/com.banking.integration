package spring.com.banking.integration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.com.banking.integration.entity.CustomerInfo;
import spring.com.banking.integration.error.PkIdNotFound;
import spring.com.banking.integration.repository.NewCustomerInfoRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerAccountCreationImpl implements CustomerAccountCreation{
    @Autowired
    NewCustomerInfoRepository newCustomerInfoRepository;

    @Override
    public CustomerInfo saveCustomer(CustomerInfo customerInfo) {
        return newCustomerInfoRepository.save(customerInfo);
    }

    @Override
    public List<CustomerInfo> getAll(CustomerInfo customerInfo) {
        return newCustomerInfoRepository.findAll();
    }

    @Override
    public CustomerInfo getByPkId(Integer pkId) throws PkIdNotFound {

        Optional<CustomerInfo> customerInfo = newCustomerInfoRepository.findById(pkId);
        if(!customerInfo.isPresent()){
            throw new PkIdNotFound("PK id not available");
        }
        return customerInfo.get();
    }



}
