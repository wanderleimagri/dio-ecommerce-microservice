package com.hatanaka.ecommerce.checkout.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Builder
@Entity
@Data
public class CheckoutEntity {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String code;
    @Column
    @Enumerated(value =EnumType.STRING)
    private Status status;

    public enum Status {
        CREATED,
        APROVED
    }
}
