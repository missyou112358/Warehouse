create table WAREHOUSE_OUT_STORE_ORDER (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    OUT_STORE_NUMBER varchar(50),
    CUSTOMER_ID varchar(32),
    STAFF_ID varchar(32) not null,
    COMMENT_ longtext,
    --
    primary key (ID)
);
