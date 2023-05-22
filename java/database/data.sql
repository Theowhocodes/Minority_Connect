BEGIN TRANSACTION;

--test users
INSERT INTO users (user_id ,username, password_hash, role, email, phone_number) VALUES (default, 'tbear','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN', 'williams2theodore@gmail.com', '412-867-5334');
INSERT INTO users (user_id, username, password_hash, role, email, phone_number) VALUES (default, 'jazzyEngineer','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER', 'dev.jasmine@gmail.com', '412-738-0821');
INSERT INTO users (user_id, username, password_hash, role, email, phone_number) VALUES (default, 'cwalden61','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER', 'cwalden61@gmail.com', '412-600-9037');
INSERT INTO users (user_id, username, password_hash, role, email, phone_number) VALUES (default, 'Cambodican Kitchen','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uF','ROLE_USER', 'cambodican@yahoo.com', '412-381-6199');
INSERT INTO users (user_id, username, password_hash, role, email, phone_number) VALUES (default, 'Grandma B','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZ','ROLE_USER', 'grannieskitchen@gmail.com', '412-681-4087');

--test user businesses

INSERT INTO businesses (business_id, business_name, business_category, business_number, city, closest_major_city, state_abbreviation, owner_first_name, owner_last_name, owner_phone_number)
VALUES (default, 'minority_connect', 'computers & electronics', '412-867-5334', 'pittsburgh', 'pittsburgh', 'PA' ,'Theo', 'Williams', '412-867-5334');

INSERT INTO businesses (business_id, business_name, business_category, business_number, city, closest_major_city, state_abbreviation, owner_first_name, owner_last_name, owner_phone_number)
VALUES (default, 'Code Crusaders', 'computers & electronics', '412-738-0821', 'pittsburgh', 'pittsburgh', 'PA' ,'Jasmine', 'Moore', '412-738-0821');

INSERT INTO businesses (business_id ,business_name, business_category, business_number, city, closest_major_city, state_abbreviation, owner_first_name, owner_last_name, owner_phone_number)
VALUES (default, 'Cambodican Kitchen', 'food & dining', '412-381-6199', 'pittsburgh', 'pittsburgh', 'PA' ,'Caitlyn', 'Cambodican', '412-381-6199');

INSERT INTO businesses (business_id, business_name, business_category, business_number, city, closest_major_city, state_abbreviation, owner_first_name, owner_last_name, owner_phone_number)
VALUES (default, 'Grandma Bs', 'food & dining', '412-681-4087', 'pittsburgh', 'pittsburgh', 'PA' ,'Granny', 'Beatrix', '412-681-4087');


--pairing the businesses to the users who own them
INSERT INTO users_businesses (user_id, business_id) VALUES (1, 1);
INSERT INTO users_businesses (user_id, business_id) VALUES (2, 2);
INSERT INTO users_businesses (user_id, business_id) VALUES (4, 3);
INSERT INTO users_businesses (user_id, business_id) VALUES (5, 4);


--test messages between users and business(users)
INSERT INTO messages (sender, recipient, content)
values (2, 1, 'Locked out of account');
INSERT INTO messages (sender, recipient, content)
values (1, 2, 'Please allow 24-48hrs for a password reset. We apologize for the delay!');
INSERT INTO messages (sender, recipient, content)
values (3, 5, 'Do you offer delivery?');
INSERT INTO messages (sender, recipient, content)
values (4, 2, 'How much are basic single page websites for restaurants');


COMMIT TRANSACTION;
