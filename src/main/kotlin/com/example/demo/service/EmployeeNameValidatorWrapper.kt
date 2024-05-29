package com.example.demo.service

import demo.service.validator.EmployeeNameValidator
import org.springframework.stereotype.Component

@Component
class EmployeeNameValidatorWrapper {

    val validator: EmployeeNameValidator = EmployeeNameValidator()

    fun validateEmployeeName(name: String?) {
        validator.checkEmployeeName(name)
    }
}