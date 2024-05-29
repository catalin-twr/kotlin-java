package com.example.demo.controller

import com.example.demo.entity.dto.EmployeeDto
import com.example.demo.exception.NoEmployeeFoundException
import com.example.demo.service.EmployeeService
import demo.entity.Employee
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import org.springframework.web.client.HttpClientErrorException.BadRequest
import org.springframework.web.client.HttpClientErrorException.NotFound

@RestController
@RequestMapping("/employee")
class EmployeeController {

    @Autowired
    lateinit var employeeService: EmployeeService

    @GetMapping("/{id}")
    fun index(@PathVariable("id") id: Int): Employee? {
        return employeeService.findEmployee(id) ?: throw NoEmployeeFoundException(id)
    }

    @PostMapping
    fun create(@RequestBody employeeDto: EmployeeDto): Employee {
        return employeeService.create(employeeDto.name, employeeDto.departmentId)
    }
}