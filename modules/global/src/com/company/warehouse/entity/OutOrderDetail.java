package com.company.warehouse.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.ManyToOne;
import java.util.List;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@NamePattern("%s|material")
@Table(name = "WAREHOUSE_OUT_ORDER_DETAIL")
@Entity(name = "warehouse$OutOrderDetail")
public class OutOrderDetail extends StandardEntity {
    private static final long serialVersionUID = 1649269868850364365L;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MATERIAL_ID")
    protected Material material;

    @Column(name = "QUANTITY", nullable = false)
    protected BigDecimal quantity;


    @JoinTable(name = "WAREHOUSE_OUT_STORE_ORDER_OUT_ORDER_DETAIL_LINK",
        joinColumns = @JoinColumn(name = "OUT_ORDER_DETAIL_ID"),
        inverseJoinColumns = @JoinColumn(name = "OUT_STORE_ORDER_ID"))
    @ManyToMany
    protected List<OutStoreOrder> outStoreOrder;

    public void setOutStoreOrder(List<OutStoreOrder> outStoreOrder) {
        this.outStoreOrder = outStoreOrder;
    }

    public List<OutStoreOrder> getOutStoreOrder() {
        return outStoreOrder;
    }


    public void setMaterial(Material material) {
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }


}