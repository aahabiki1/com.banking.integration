package spring.com.banking.integration.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import spring.com.banking.integration.entity.CustomerInfo;
import spring.com.banking.integration.error.PkIdNotFound;
import spring.com.banking.integration.model.NewApplicantRequest;
import spring.com.banking.integration.service.CustomerAccountCreation;
import spring.com.banking.integration.service.IntegrationService;
import spring.com.banking.integration.service.TransactionsService;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/customer-info")
@Slf4j


public class CustomerInfoController {

    @Autowired
    private CustomerAccountCreation customerAccountCreation;
    @Autowired
    private IntegrationService integrationService;
    @Autowired
    private TransactionsService transactionsService;
    @Autowired
    private  static BindingResult bindingResult;





    @PostMapping("/save-customer")
    public CustomerInfo saveCustomer(@Valid @RequestBody  NewApplicantRequest newApplicantRequest , BindingResult bindingResult){

              CustomerInfo signUp = integrationService.dtoToUser(newApplicantRequest);

               CustomerInfo c = customerAccountCreation.saveCustomer(signUp);

              return signUp ;

    }

    @GetMapping("/all-users")
    public List<CustomerInfo> getAllCustomers(CustomerInfo customerInfo){
        return customerAccountCreation.getAll(customerInfo);
    }

    @GetMapping("get-by-name/{pkId}")
    public CustomerInfo NewSignUpgetCustomerByName(@PathVariable("pkId") Integer pkId)throws PkIdNotFound {
        return customerAccountCreation.getByPkId(pkId);
    }



}
