create table persons (

                         id bigserial primary key,
                         name varchar(255),
                         password varchar,
                         salary int,
                         is_man boolean,
                         birthday date

);

create table phones (
                        id bigserial primary key,
                        number int,
                        company varchar,
                        person_id int,
                        constraint person_fk foreign key (person_id) references persons (id)
);

insert into phones (number, company, person_id)
values (123, 'MTS', 2),
       (234, 'A1', 3),
       (345, 'LIFE', 4),
       (567, 'MTS', 6);

insert into phones (number, company, person_id) values (999, 'UNKNOWN', null);

select p.name, ph.number, ph.company from persons p join phones ph on (p.id = ph.person_id);


drop table phones;

-- select * from persons where birthday between '1990-01-01' and '1999-12-31';
select sum(salary) from persons where is_man is true;
select sum(salary) from persons where is_man is false;

select is_man, sum(salary), min(birthday) from persons where salary > 2000 group by is_man having sum(salary) > 9000 order by is_man;




insert into persons (name, password, salary, is_man, birthday) values
                                                                   ('user1', 'password1', 1000, true, '1990-01-20'),
                                                                   ('user2', 'password2', 2000, false, '2000-03-10'),
                                                                   ('user3', 'password3', 3000, true, '2003-06-11'),
                                                                   ('user4', 'password4', 4000, false, '1980-12-12'),
                                                                   ('user5', 'password5', 5000, true, '1995-02-10'),
                                                                   ('user6', 'password6', 6000, false, '2006-03-18');

delete from persons;

drop table persons;

select id, name, salary from persons where salary > 3000 or id > 5;

-- insert into persons (name, salary) values ('vova', 3000);

-- delete from persons where id = 8;
-- delete from persons where salary = 2500 and id > 6;

-- update persons set password = '123' where salary < 3500;
-- update persons set password = '12345', salary = 1500 where id < 3;