package com.oz.portfolio_backend.service;

import com.oz.portfolio_backend.entity.Contact;
import com.oz.portfolio_backend.repository.ContactRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@Service

public class ContactServiceImpl implements ContactService {

    ContactRepository contactRepository;
    @Override
    public Optional<Contact> getContactById(String id) {
        return contactRepository.findById(UUID.fromString(id));
    }

    @Override
    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public void deleteContact(String id) {
        contactRepository.deleteById(UUID.fromString(id));
    }

    @Override
    public List<Contact> getContacts() {
        return (List<Contact>) contactRepository.findAll();
    }
}
