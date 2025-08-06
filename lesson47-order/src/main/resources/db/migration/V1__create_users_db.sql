drop table orders;

create table orders (
    id uuid primary key,
    user_id uuid,
    tool_id uuid,
    count int,
    status varchar
)