create table user (
                      id int primary key auto_increment,
                      email varchar(100) not null,
                      name varchar(100) not null,
                      cpf_cnpj varchar(20) not null,
                      type_person enum('F', 'J') not null,
                      password varchar(255)
);

create table transfer_limit(
                               user int not null,
                               time time not null,
                               day_week int not null,
                               value numeric(15,2) not null,

                               constraint fk_user_transfer_limit foreign key (user) references user(id),
                               constraint ck_check_day_limit CHECK (day_week > 0 AND day_week <8)
);

create table user_historic(
                              user int not null,
                              period date not null,
                              value numeric(15,2) not null
);

create table transfer_movement(
                                  id varchar(36) not null,
                                  payer_user int not null,
                                  receiver_user int not null,
                                  value numeric(15,2) not null,
                                  tranfer_date timestamp not null,

                                  constraint fk_user_payer foreign key (payer_user) references user(id),
                                  constraint fk_user_receiver foreign key (receiver_user) references user(id)
);

create table movement_historic(
                                  payer_user int not null,
                                  receiver_user int not null,
                                  value numeric(15,2) not null,
                                  original_date timestamp not null,
                                  change_date timestamp not null,
                                  change_type enum('A', 'I', 'E') not null,
                                  justification text not null
)