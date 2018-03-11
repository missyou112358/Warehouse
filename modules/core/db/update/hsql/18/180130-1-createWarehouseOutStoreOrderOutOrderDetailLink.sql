create table WAREHOUSE_OUT_STORE_ORDER_OUT_ORDER_DETAIL_LINK (
    OUT_STORE_ORDER_ID varchar(36) not null,
    OUT_ORDER_DETAIL_ID varchar(36) not null,
    primary key (OUT_STORE_ORDER_ID, OUT_ORDER_DETAIL_ID)
);
