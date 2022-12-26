package spring.com.banking.integration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.com.banking.integration.entity.CustomerInfo;

import java.util.List;

@Repository
public interface NewCustomerInfoRepository extends JpaRepository<CustomerInfo,Integer> {




    String findByEmail(CustomerInfo email);
}
