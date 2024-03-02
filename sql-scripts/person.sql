
CREATE TABLE person.person(
	id INTEGER NOT NULL PRIMARY KEY,
	document_id VARCHAR(100) NOT NULL,
	name VARCHAR(150) NOT NULL,
	surname VARCHAR(200) NOT NULL,
	age INTEGER NOT NULL
);

CREATE SEQUENCE person.person_seq
	INCREMENT BY 23
	MINVALUE 1
	MAXVALUE 9999999999999
	START 1
	CACHE 1
	NO CYCLE
	OWNED BY person.person.id;