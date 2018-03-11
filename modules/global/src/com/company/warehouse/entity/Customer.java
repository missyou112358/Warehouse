package com.company.warehouse.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.Pattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|customerName")
@Table(name = "WAREHOUSE_CUSTOMER")
@Entity(name = "warehouse$Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = 2228782144734762537L;

    @Column(name = "CUSTOMER_NAME", length = 20)
    protected String customerName;

    @Column(name = "COMPANY", length = 50)
    protected String company;

    @Column(name = "ADDRESS", length = 70)
    protected String address;

    @Pattern(message = "请输入正确的手机号", regexp = "^1[3,4,5,7,8]\\d{9}$")
    @Column(name = "CELL_PHONE", length = 13)
    protected String cellPhone;

    @Column(name = "TELEPHONE", length = 20)
    protected String telephone;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }


}