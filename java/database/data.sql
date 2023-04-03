BEGIN TRANSACTION;

INSERT INTO users (user_id, username, password_hash, role, email, phone_number) VALUES (default, 'user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER', 'user@email.com', '412-000-0000');
INSERT INTO users (username, password_hash, role, email, phone_number) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN', 'admin@email.com', '412-000-0001');

INSERT INTO businesses (business_id, business_name, business_category, business_number, city, closest_major_city, state_abbreviation, owner_first_name, owner_last_name, owner_phone_number)
VALUES (default, 'user_business1', 'automotive', '412-000-0000', 'pittsburgh', 'pittsburgh', 'PA' ,'user', 'name', '412-000-0000');

INSERT INTO businesses (business_id ,business_name, business_category, business_number, city, closest_major_city, state_abbreviation, owner_first_name, owner_last_name, owner_phone_number)
VALUES (default, 'user_business2', 'entertainment', '412-000-1000', 'pittsburgh', 'pittsburgh', 'PA' ,'user', 'name', '412-000-0000');

INSERT INTO businesses (business_id, business_name, business_category, business_number, city, closest_major_city, state_abbreviation, owner_first_name, owner_last_name, owner_phone_number)
VALUES (default, 'minority_connect', 'computers & electronics', '412-000-0001', 'pittsburgh', 'pittsburgh', 'PA' ,'admin', 'name', '412-000-0001');


INSERT INTO users_businesses (user_id, business_id) VALUES (1, 1);
INSERT INTO users_businesses (user_id, business_id) VALUES (1, 2);

INSERT INTO messages (sender, recipient, content)
values (1, 2, 'Locked out of account');


COMMIT TRANSACTION;
