package com.company.Employee.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empinfo")
public class Employee {

    @Id
    @Column(name="id")
    int id;

    @Column(name="e_Name")
    String e_Name;

    @Column(name="dept_no")
    int dept_no;

    public Employee(){

    }
    public Employee(int id, String e_Name, int dept_no) {
        this.id = id;
        this.e_Name = e_Name;
        this.dept_no = dept_no;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getE_Name() {
        return e_Name;
    }

    public void setE_Name(String e_Name) {
        this.e_Name = e_Name;
    }

    public int getDept_no() {
        return dept_no;
    }

    public void setDept_no(int dept_no) {
        this.dept_no = dept_no;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", e_Name='" + e_Name + '\'' +
                ", dept_no=" + dept_no +
                '}';
    }


}
