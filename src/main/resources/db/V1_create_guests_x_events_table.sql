CREATE TABLE event_manager.guests_x_events ( -- TODO puede ser tambien tabla invitaciones
	event_id long NOT NULL,
	user_id long NOT NULL,
	accepted boolean NOT NULL DEFAULT false,
	created_at timestamp NOT NULL,
	updated_at timestamp NULL,
	deleted_at timestamp NULL,
	CONSTRAINT fk_guests_event_id FOREIGN KEY (event_id) references event_manager.events (id),
	CONSTRAINT fk_guests_user_id FOREIGN KEY (user_id) references event_manager.users (id),
);




-- TODO
-- idea, al invitar a alguien y no está registrado, su mail se guarda automaticamente en users.
-- password null y otros datos como fecha nacimiento en null significan q el usuario no se registro todavia.
-- de esta forma el no registrado puede aceptar / rechazar invitacion mediante el link
-- o si esta registrado puede logearse y ver toda la info del evento o sus eventos pasados, etc.