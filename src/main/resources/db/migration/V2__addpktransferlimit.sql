alter table transfer_limit add primary key (id);

alter table user_historic add column id varchar(36);
alter table user_historic add primary key (id);

alter table movement_historic add column id varchar(36);
alter table movement_historic add primary key (id);
