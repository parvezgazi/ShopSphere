package com.gazi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gazi.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
