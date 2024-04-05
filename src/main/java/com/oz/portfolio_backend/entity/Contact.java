package com.oz.portfolio_backend.entity;


import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "UUID")
    private UUID id;

    @NotBlank(message = "First name cannot be blank")
    @NonNull
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @NotBlank(message = "Last name cannot be blank")
    @NonNull
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "telephone")
    private String telephone;

    @NotBlank(message = "Email cannot be blank")
    @Column(name = "email", nullable = false)
    private String email;

    @NotBlank(message = "Subject name cannot be blank")
    @NonNull
    @Column(name = "subject", nullable = false)
    private String subject;

    @NotBlank(message = "message cannot be blank")
    @NonNull
    @Column(name = "message", nullable = false)
    private String message;
}

