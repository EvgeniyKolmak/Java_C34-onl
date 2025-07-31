drop table if exists addres;
drop table if exists phones;

create table addres(
   id uuid primary key,
   street varchar,
   city varchar
);

create table phones (
    id uuid primary key,
    number int,
    person_id uuid
)