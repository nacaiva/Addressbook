package com.natalija.addressbook.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EntryRepository extends JpaRepository<AddressEntry, Long> {

}
