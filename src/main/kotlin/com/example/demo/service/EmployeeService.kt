package com.example.demo.service

import demo.entity.Employee
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*
import java.util.concurrent.ConcurrentHashMap

@Service
class EmployeeService {
    private val employeeMap: MutableMap<Int, Employee> = ConcurrentHashMap()

    @Autowired
    lateinit var employeeNameValidatorWrapper: EmployeeNameValidatorWrapper

    fun create(name: String?, departmentId: Int): Employee {
        employeeNameValidatorWrapper.validateEmployeeName(name)
        var id = generateId()
        val employee = Employee(id, name, departmentId)
        employeeMap[id] = employee
        return employee
    }

    private fun generateId(): Int {
        var id = Random().nextInt()
        id = if (id < 0) -id else id
        return id
    }

    fun findEmployee(id: Int): Employee? {
        return employeeMap[id]
    }
}