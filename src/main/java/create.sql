create table if not exists users
(
	id serial not null
		constraint users_pk
			primary key,
	name text,
	email text
);

alter table users owner to postgres;

create table if not exists operations
(
	id serial not null
		constraint operations_pk
			primary key,
	op1 integer,
	op2 integer,
	op text,
	r integer,
	user_id integer
);

alter table operations owner to postgres;

