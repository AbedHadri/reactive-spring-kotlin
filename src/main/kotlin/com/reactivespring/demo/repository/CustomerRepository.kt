package com.reactivespring.demo.repository

import com.reactivespring.demo.model.Customer
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : ReactiveMongoRepository<Customer, Int>