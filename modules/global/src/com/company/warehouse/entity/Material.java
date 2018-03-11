package com.company.warehouse.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.validation.constraints.NotNull;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import com.haulmont.cuba.core.entity.annotation.Listeners;
import java.math.BigDecimal;
import javax.validation.constraints.DecimalMin;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@NamePattern("%s|materialName")
@Table(name = "WAREHOUSE_MATERIAL")
@Entity(name = "warehouse$Material")
public class Material extends StandardEntity {
    private static final long serialVersionUID = -4887986616324456642L;

    @NotNull
    @Column(name = "MATERIAL_NUMBER", nullable = false, unique = true, length = 50)
    protected String materialNumber;

    @Column(name = "MATERIAL_NAME", nullable = false, length = 30)
    protected String materialName;

    @Column(name = "SUPPLY", length = 30)
    protected String supply;

    @Column(name = "MODEL", length = 30)
    protected String model;

    @DecimalMin(message = "{msg://com.company.warehouse.entity/Material.quantityVali}", value = "0")
    @Column(name = "QUANTITY")
    protected BigDecimal quantity;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UNIT_ID")
    protected Unit unit;

    @Column(name = "PRICE")
    protected BigDecimal price;

    @Column(name = "TOTAL_PRICE")
    protected BigDecimal totalPrice;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TYPE_ID")
    protected Type type;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RESPONSER_ID")
    protected Staff responser;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COOPERATOR_ID")
    protected Staff cooperator;

    @Temporal(TemporalType.DATE)
    @Column(name = "PLAN_DATE")
    protected Date planDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "ACT_DATE")
    protected Date actDate;

    @Column(name = "COMMENT_", length = 50)
    protected String comment;

    public void setSupply(String supply) {
        this.supply = supply;
    }

    public String getSupply() {
        return supply;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setResponser(Staff responser) {
        this.responser = responser;
    }

    public Staff getResponser() {
        return responser;
    }

    public void setCooperator(Staff cooperator) {
        this.cooperator = cooperator;
    }

    public Staff getCooperator() {
        return cooperator;
    }

    public void setPlanDate(Date planDate) {
        this.planDate = planDate;
    }

    public Date getPlanDate() {
        return planDate;
    }

    public void setActDate(Date actDate) {
        this.actDate = actDate;
    }

    public Date getActDate() {
        return actDate;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }


    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }


    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }


    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }


    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getMaterialName() {
        return materialName;
    }


    public void setMaterialNumber(String materialNumber) {
        this.materialNumber = materialNumber;
    }

    public String getMaterialNumber() {
        return materialNumber;
    }


}