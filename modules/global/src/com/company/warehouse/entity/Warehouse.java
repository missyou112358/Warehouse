package com.company.warehouse.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Lob;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|warehouseName")
@Table(name = "WAREHOUSE_WAREHOUSE")
@Entity(name = "warehouse$Warehouse")
public class Warehouse extends StandardEntity {
    private static final long serialVersionUID = -3395983709237880774L;

    @Column(name = "WAREHOUSE_NUMBER", nullable = false, unique = true, length = 20)
    protected String warehouseNumber;

    @Column(name = "WAREHOUSE_NAME", nullable = false, unique = true, length = 20)
    protected String warehouseName;

    @Lob
    @Column(name = "DESCRIPTION")
    protected String description;

    public void setWarehouseNumber(String warehouseNumber) {
        this.warehouseNumber = warehouseNumber;
    }

    public String getWarehouseNumber() {
        return warehouseNumber;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


}