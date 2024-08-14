package com.employeeSorting;

import java.util.Comparator;

class SortByEmpId implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getEmpId(), e2.getEmpId());
    }
}

class SortByEmpName implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getEmpName().compareTo(e2.getEmpName());
    }
}

class SortByEmpSalary implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.getEmpSalary(), e2.getEmpSalary());
    }
}
