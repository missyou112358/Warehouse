package com.company.warehouse.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Pattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.Lob;
import com.haulmont.cuba.core.entity.annotation.Listeners;

@Listeners({"warehouse_StorePositionListener", "warehouse_StorePositionListener"})
@NamePattern("%s|positionName")
@Table(name = "WAREHOUSE_STORE_POSTION")
@Entity(name = "warehouse$StorePostion")
public class StorePostion extends StandardEntity {
    private static final long serialVersionUID = -7824931608771051015L;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "WAREHOUSE_ID")
    protected Warehouse warehouse;

    @Pattern(message = "长度为7，第一位为字母，其余为数字", regexp = "^[a-zA-Z]{1}[0-9]{5}$")
    @Column(name = "POSITION_NUMBER", nullable = false, unique = true, length = 6)
    protected String positionNumber;

    @Column(name = "POSITION_NAME", length = 50)
    protected String positionName;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MATERIAL_ID")
    protected Material material;

    @Column(name = "MAX_WEIGHT")
    protected BigDecimal maxWeight;

    @Column(name = "MAX_CUBAGE")
    protected BigDecimal maxCubage;

    @Lob
    @Column(name = "DESCRIPTION")
    protected String description;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setPositionNumber(String positionNumber) {
        this.positionNumber = positionNumber;
    }

    public String getPositionNumber() {
        return positionNumber;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaxWeight(BigDecimal maxWeight) {
        this.maxWeight = maxWeight;
    }

    public BigDecimal getMaxWeight() {
        return maxWeight;
    }

    public void setMaxCubage(BigDecimal maxCubage) {
        this.maxCubage = maxCubage;
    }

    public BigDecimal getMaxCubage() {
        return maxCubage;
    }


}