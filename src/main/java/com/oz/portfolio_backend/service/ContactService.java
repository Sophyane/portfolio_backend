package com.oz.portfolio_backend.service;

import com.oz.portfolio_backend.entity.Contact;

import java.util.List;
import java.util.Optional;

public interface ContactService {

    Optional<Contact> getContactById(String id);

    Contact saveContact(Contact contact);

    void deleteContact(String id);

    List<Contact> getContacts();
}
