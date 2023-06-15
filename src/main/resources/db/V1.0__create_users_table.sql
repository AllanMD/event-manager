CREATE TABLE event_manager.user_types ( -- TODO capaz no es necesario el esquema event_manager. No va a existir otro esquema en el proyecto parece.
	id bigserial NOT NULL,
	name varchar(255) NOT NULL,
	CONSTRAINT pk_event_manager_user_types PRIMARY KEY (id)
);

CREATE TABLE event_manager.users (
	id bigserial NOT NULL,
	email varchar(255) NOT NULL,
	password varchar(255) NULL,
	type varchar(50) NOT NULL,
	name varchar(50) NOT NULL,
	created_at timestamp NOT NULL,
	updated_at timestamp NULL,
	deleted_at timestamp NULL,
	CONSTRAINT pk_event_manager_users PRIMARY KEY (id),
	CONSTRAINT fk_event_manager_users_type FOREIGN KEY (type) REFERENCES event_manager.user_types(name)
);

-- TODO los empleados corporativos por defecto ya tienen usuario creado. Sus credenciales son las mismas q usan para el trabajo. Anotar esto en la documentacion ?