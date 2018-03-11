package com.company.warehouse.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Email;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|supplyName")
@Table(name = "WAREHOUSE_SUPPLY")
@Entity(name = "warehouse$Supply")
public class Supply extends StandardEntity {
    private static final long serialVersionUID = 3814971723191739277L;

    @Column(name = "SUPPLY_NAME", nullable = false, length = 50)
    protected String supplyName;

    @Column(name = "ADDRESS", length = 70)
    protected String address;

    @Column(name = "CONTACTER", length = 10)
    protected String contacter;

    @Column(name = "TELEPHONE", unique = true, length = 10)
    protected String telephone;

    @Pattern(message = "请输入正确的手机号", regexp = "^1[3,4,5,7,8]\\d{9}$")
    @Column(name = "CELL_PHONE", length = 13)
    protected String cellPhone;

    @Email
    @Column(name = "EMAIL", length = 30)
    protected String email;

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }


    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public String getSupplyName() {
        return supplyName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setContacter(String contacter) {
        this.contacter = contacter;
    }

    public String getContacter() {
        return contacter;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


}