create table WAREHOUSE_STAFF (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    STAFF_NUMBER varchar(255) not null,
    NAME varchar(10) not null,
    CELL_PHONE varchar(11),
    IN_COMPANY_DATE date,
    ADDRESS varchar(255),
    EMAIL varchar(30),
    --
    primary key (ID)
);
