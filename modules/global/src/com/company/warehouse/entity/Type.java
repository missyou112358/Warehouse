package com.company.warehouse.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.Column;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "WAREHOUSE_TYPE")
@Entity(name = "warehouse$Type")
public class Type extends StandardEntity {
    private static final long serialVersionUID = 1740104986012642276L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true, length = 20)
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}