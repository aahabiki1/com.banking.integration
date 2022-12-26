package spring.com.banking.integration.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;


@Getter
@Setter
@ToString
@EqualsAndHashCode
public class RunResponseMessage {
    private String name;
    private String userName;
    private String password;
    private String response;

}
