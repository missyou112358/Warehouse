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
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import com.haulmont.cuba.core.entity.annotation.Listeners;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Listeners("warehouse_OutOrderListener")
@NamePattern("%s|outStoreNumber")
@Table(name = "WAREHOUSE_OUT_STORE_ORDER")
@Entity(name = "warehouse$OutStoreOrder")
public class OutStoreOrder extends StandardEntity {
    private static final long serialVersionUID = -5155453431418995225L;

    @Column(name = "OUT_STORE_NUMBER", length = 50)
    protected String outStoreNumber;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMER_ID")
    protected Customer customer;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STAFF_ID")
    protected Staff staff;

    @Lob
    @Column(name = "COMMENT_")
    protected String comment;

    @JoinTable(name = "WAREHOUSE_OUT_STORE_ORDER_OUT_ORDER_DETAIL_LINK",
        joinColumns = @JoinColumn(name = "OUT_STORE_ORDER_ID"),
        inverseJoinColumns = @JoinColumn(name = "OUT_ORDER_DETAIL_ID"))
    @ManyToMany
    protected List<OutOrderDetail> details;

    public List<OutOrderDetail> getDetails() {
        return details;
    }

    public void setDetails(List<OutOrderDetail> details) {
        this.details = details;
    }



    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }


    public void setOutStoreNumber(String outStoreNumber) {
        this.outStoreNumber = outStoreNumber;
    }

    public String getOutStoreNumber() {
        return outStoreNumber;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Staff getStaff() {
        return staff;
    }


}