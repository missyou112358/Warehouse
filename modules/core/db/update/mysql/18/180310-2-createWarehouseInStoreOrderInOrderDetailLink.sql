alter table WAREHOUSE_IN_STORE_ORDER_IN_ORDER_DETAIL_LINK add constraint FK_WISOIODL_IN_STORE_ORDER foreign key (IN_STORE_ORDER_ID) references WAREHOUSE_IN_STORE_ORDER(ID);
alter table WAREHOUSE_IN_STORE_ORDER_IN_ORDER_DETAIL_LINK add constraint FK_WISOIODL_IN_ORDER_DETAIL foreign key (IN_ORDER_DETAIL_ID) references WAREHOUSE_IN_ORDER_DETAIL(ID);
