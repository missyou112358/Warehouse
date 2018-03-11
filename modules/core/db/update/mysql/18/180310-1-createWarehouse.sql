create table WAREHOUSE_WAREHOUSE (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    WAREHOUSE_NUMBER varchar(20) not null,
    WAREHOUSE_NAME varchar(20) not null,
    DESCRIPTION longtext,
    --
    primary key (ID)
);
