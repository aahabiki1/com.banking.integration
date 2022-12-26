package spring.com.banking.integration.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import spring.com.banking.integration.entity.CustomerInfo;
import spring.com.banking.integration.repository.NewCustomerInfoRepository;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
@Transactional
public class TransactionsService {

    private final NewCustomerInfoRepository newCustomerInfoRepository;

//    public CustomerInfo checkIfEmailAreadyExist(CustomerInfo email){
//        return newCustomerInfoRepository.findByEmail(email);
//    }

}
