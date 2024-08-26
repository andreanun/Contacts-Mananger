package com.contactsmanager.contact;

import com.contactsmanager.contact.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactRepository extends JpaRepository<Contact, String> {
    Optional<Contact> findById (String id);
    Optional<Contact> findByName(String name);
    Optional<Contact> findByPhone(String phone);
    Optional<Contact> findByTitle(String id);





}
