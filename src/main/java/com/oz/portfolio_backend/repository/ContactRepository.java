package com.oz.portfolio_backend.repository;

import com.oz.portfolio_backend.entity.Contact;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ContactRepository extends CrudRepository<Contact, UUID> {

}
