package com.company.warehouse.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@NamePattern("%s|material")
@Table(name = "WAREHOUSE_IN_ORDER_DETAIL")
@Entity(name = "warehouse$InOrderDetail")
public class InOrderDetail extends StandardEntity {
    private static final long serialVersionUID = -4928086918604695847L;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MATERIAL_ID")
    protected Material material;

    @Column(name = "QUANTITY", nullable = false)
    protected BigDecimal quantity;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STORE_POSITION_ID")
    protected StorePostion storePosition;

    @JoinTable(name = "WAREHOUSE_IN_STORE_ORDER_IN_ORDER_DETAIL_LINK",
        joinColumns = @JoinColumn(name = "IN_ORDER_DETAIL_ID"),
        inverseJoinColumns = @JoinColumn(name = "IN_STORE_ORDER_ID"))
    @ManyToMany
    protected List<InStoreOrder> inStoreOrder;

    public void setInStoreOrder(List<InStoreOrder> inStoreOrder) {
        this.inStoreOrder = inStoreOrder;
    }

    public List<InStoreOrder> getInStoreOrder() {
        return inStoreOrder;
    }


    public void setStorePosition(StorePostion storePosition) {
        this.storePosition = storePosition;
    }

    public StorePostion getStorePosition() {
        return storePosition;
    }


    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }



    public void setMaterial(Material material) {
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }


}