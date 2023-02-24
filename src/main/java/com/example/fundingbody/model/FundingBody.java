package com.example.fundingbody.model;

import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "funding_body")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class FundingBody {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @Email(message = "Invalid email address")
    private String email;

    @NotBlank(message = "Phone number is mandatory")
    private String phone;

    @NotBlank(message = "Contact address is mandatory")
    private String contactAddress;

    @NotNull(message = "Created date is mandatory")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
}
