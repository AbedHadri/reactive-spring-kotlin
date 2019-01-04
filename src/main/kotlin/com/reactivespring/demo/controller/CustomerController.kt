package com.reactivespring.demo.controller

import com.reactivespring.demo.service.CustomerService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
@RequestMapping(path = ["customer"])
class CustomerController(val customerService: CustomerService) {

    @RequestMapping(path = ["/"], method = [RequestMethod.GET])
    private fun getAllCustomers() = customerService.getAllCustomers()

    @RequestMapping(path = ["/{customerId}/"], method = [RequestMethod.GET])
    private fun getCustomerById(@PathVariable("customerId") customerId: Int) = customerService.getCustomerById(customerId)
}