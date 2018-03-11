package com.company.warehouse.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Email;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "WAREHOUSE_STAFF")
@Entity(name = "warehouse$Staff")
public class Staff extends StandardEntity {
    private static final long serialVersionUID = 2155341927729949860L;

    @Column(name = "STAFF_NUMBER", nullable = false, unique = true)
    protected String staffNumber;

    @Column(name = "NAME", nullable = false, length = 10)
    protected String name;

    @Pattern(message = "请输入正确的手机号", regexp = "^1[3,4,5,7,8]\\d{9}$")
    @Column(name = "CELL_PHONE", unique = true, length = 11)
    protected String cellPhone;

    @Temporal(TemporalType.DATE)
    @Column(name = "IN_COMPANY_DATE")
    protected Date inCompanyDate;

    @Column(name = "ADDRESS")
    protected String address;

    @Email
    @Column(name = "EMAIL", length = 30)
    protected String email;

    public void setStaffNumber(String staffNumber) {
        this.staffNumber = staffNumber;
    }

    public String getStaffNumber() {
        return staffNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setInCompanyDate(Date inCompanyDate) {
        this.inCompanyDate = inCompanyDate;
    }

    public Date getInCompanyDate() {
        return inCompanyDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


}