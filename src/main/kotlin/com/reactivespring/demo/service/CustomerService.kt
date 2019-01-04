package com.reactivespring.demo.service

import com.reactivespring.demo.model.Customer
import com.reactivespring.demo.repository.CustomerRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class CustomerService(val customerRepository: CustomerRepository) {

    fun getAllCustomers(): Flux<Customer> = customerRepository.findAll()
            .filter { x -> x.name.isNotBlank() }

    fun getCustomerById(customerId: Int): Mono<Customer> = customerRepository.findById(customerId)

}