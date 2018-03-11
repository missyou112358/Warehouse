create table WAREHOUSE_IN_STORE_ORDER (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    IN_STORE_NUMBER varchar(50),
    SUPPLY_ID varchar(32),
    BATCH_NUMBER varchar(255),
    STAFF_ID varchar(32) not null,
    COMMENT_ longtext,
    --
    primary key (ID)
);
