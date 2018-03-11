package com.company.warehouse.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.Column;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "WAREHOUSE_UNIT")
@Entity(name = "warehouse$Unit")
public class Unit extends StandardEntity {
    private static final long serialVersionUID = 458858342091936430L;

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