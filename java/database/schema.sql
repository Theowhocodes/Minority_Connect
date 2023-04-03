BEGIN TRANSACTION;

DROP TABLE IF EXISTS messages;
DROP TABLE IF EXISTS users_businesses;
DROP TABLE IF EXISTS businesses;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
	user_id SERIAL NOT NULL,
	username varchar(50) UNIQUE NOT NULL,
	password_hash varchar(200) NOT NULL,
	role varchar(20) default 'USER',
	email varchar(200) NOT NULL,
	phone_number varchar(15) NOT NULL,
	CONSTRAINT pk_users PRIMARY KEY (user_id),
	CONSTRAINT uq_username UNIQUE (username),
	CONSTRAINT ch_email check (email like '%@%.%')

);

CREATE TABLE businesses (
    business_id SERIAL NOT NULL,
    business_name varchar(100) NOT NULL,
    business_category varchar(100) NOT NULL,
    business_number varchar UNIQUE NOT NULL,
    city varchar(50) NOT NULL,
    closest_major_city varchar(50) NOT NULL,
    state_abbreviation varchar(2) NOT NULL,
    owner_first_name varchar(50) NOT NULL,
    owner_last_name varchar(50) NOT NULL,
    owner_phone_number varchar NOT NULL,

    CONSTRAINT pk_business_id PRIMARY KEY (business_id),
    CONSTRAINT uq_business_number UNIQUE (business_number),
    CONSTRAINT valid_business_category CHECK (business_category IN ('automotive',
    'business support & supplies', 'computers & electronics', 'construction & contractors',
    'education', 'entertainment', 'food & dining', 'health & medicine', 'home & garden', 'legal & financial',
    'manufacturing, wholesale or distribution', 'merchants (retail)', 'miscellaneous', 'personal care & services',
    'real estate', 'travel & transportation'))
);

CREATE TABLE users_businesses (
      user_id integer REFERENCES users (user_id),
      business_id integer REFERENCES businesses (business_id)

);

CREATE TABLE messages (
      message_id SERIAL NOT NULL,
      sender integer REFERENCES users (user_id),
      recipient integer REFERENCES users (user_id),
      content varchar(250) NOT NULL
);


COMMIT TRANSACTION;
