package com.company.warehouse.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import java.util.List;
import javax.persistence.OneToMany;
import javax.persistence.Lob;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import com.haulmont.cuba.core.entity.annotation.Listeners;

@Listeners("warehouse_InStoreOrderListener")
@NamePattern("%s|inStoreNumber")
@Table(name = "WAREHOUSE_IN_STORE_ORDER")
@Entity(name = "warehouse$InStoreOrder")
public class InStoreOrder extends StandardEntity {
    private static final long serialVersionUID = 7214993851005682942L;

    @Column(name = "IN_STORE_NUMBER", unique = true, length = 50)
    protected String inStoreNumber;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SUPPLY_ID")
    protected Supply supply;

    @Column(name = "BATCH_NUMBER")
    protected String batchNumber;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STAFF_ID")
    protected Staff staff;

    @Lob
    @Column(name = "COMMENT_")
    protected String comment;

    @JoinTable(name = "WAREHOUSE_IN_STORE_ORDER_IN_ORDER_DETAIL_LINK",
        joinColumns = @JoinColumn(name = "IN_STORE_ORDER_ID"),
        inverseJoinColumns = @JoinColumn(name = "IN_ORDER_DETAIL_ID"))
    @ManyToMany
    protected List<InOrderDetail> details;

    public void setDetails(List<InOrderDetail> details) {
        this.details = details;
    }

    public List<InOrderDetail> getDetails() {
        return details;
    }


    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }



    public void setInStoreNumber(String inStoreNumber) {
        this.inStoreNumber = inStoreNumber;
    }

    public String getInStoreNumber() {
        return inStoreNumber;
    }

    public void setSupply(Supply supply) {
        this.supply = supply;
    }

    public Supply getSupply() {
        return supply;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Staff getStaff() {
        return staff;
    }


}