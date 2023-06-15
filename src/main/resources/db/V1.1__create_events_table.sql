CREATE TABLE event_manager.events (
	id bigserial NOT NULL,
	name varchar(255) NOT NULL,
	date date NOT NULL,
	start_time time NOT NULL,
	end_time time NOT NULL,
	created_at timestamp NOT NULL,
	updated_at timestamp NULL,
	deleted_at timestamp NULL,
	CONSTRAINT pk_event_manager_events PRIMARY KEY (id),
);
