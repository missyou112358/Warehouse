create table WAREHOUSE_CUSTOMER (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    CUSTOMER_NAME varchar(20),
    COMPANY varchar(50),
    ADDRESS varchar(70),
    CELL_PHONE varchar(13),
    TELEPHONE varchar(20),
    --
    primary key (ID)
);
