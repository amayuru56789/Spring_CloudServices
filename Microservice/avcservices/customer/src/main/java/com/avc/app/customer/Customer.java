package com.avc.app.customer;

import lombok.Builder;
import lombok.Data;

/**
 * @author amayuru_i
 * @project avcservices
 */

@Data
@Builder
public class Customer {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
