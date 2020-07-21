package com.account.account.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@Builder
@Document(collection = "accounts")
public class Account {

    @Id
    public String accountId;
    public String numberAccount;
    public String typeAccount;
    public double currentBalance;
    public int transactions;
    public List<String> customerId;
    public List<String> signatories;

    public Account(){
        super();
    }

}
