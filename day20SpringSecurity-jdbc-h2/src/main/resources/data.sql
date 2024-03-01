
insert into user( id, username, password, active, roles)
values (1, 'bond','james',true, 'USER');
 
insert into user( id, username, password, active, roles)
values (2, 'poo','bear',true, 'ADMIN');

insert into authorities (username, authority)
values ('bond','ROLE_USER');

insert into authorities (username, authority)
values ('poo','ROLE_ADMIN');
