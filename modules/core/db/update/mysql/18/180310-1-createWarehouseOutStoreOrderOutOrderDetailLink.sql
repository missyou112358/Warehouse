create table WAREHOUSE_OUT_STORE_ORDER_OUT_ORDER_DETAIL_LINK (
    OUT_STORE_ORDER_ID varchar(32),
    OUT_ORDER_DETAIL_ID varchar(32),
    primary key (OUT_STORE_ORDER_ID, OUT_ORDER_DETAIL_ID)
);
