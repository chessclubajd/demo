package com.example.demo.repos;

import com.example.demo.models.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepo extends CrudRepository<Address, Long> {
}
