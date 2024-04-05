package com.oz.portfolio_backend.web;

import com.oz.portfolio_backend.entity.Contact;
import com.oz.portfolio_backend.service.ContactService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/contact")

public class ContactController {

    ContactService contactService;

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Contact>> getContact(@PathVariable String id) {
        return new ResponseEntity<>(contactService.getContactById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Contact> saveContact(@Valid @RequestBody Contact contact) {
        return new ResponseEntity<>(contactService.saveContact(contact), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteContact(@PathVariable String id) {
        contactService.deleteContact(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/allContacts")
    public ResponseEntity<List<Contact>> getContacts() {
        return new ResponseEntity<>(contactService.getContacts(), HttpStatus.OK);
    }

}
