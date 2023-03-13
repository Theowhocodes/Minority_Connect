SELECT business_name, business_category, business_number, city, closest_major_city, state_abbreviation from businesses;

SELECT business_name from businesses 
join users_businesses using(business_id)
join users using(user_id)
where user_id = 1;

SELECT business_name, business_category, business_number, city, closest_major_city, state_abbreviation 
from businesses
where business_category = 'Automotive';

SELECT business_name, business_category, business_number, city, closest_major_city, state_abbreviation 
from businesses
where business_name  like  'us%';

SELECT business_name, business_category, business_number, city, state_abbreviation 
from businesses
where closest_major_city = 'Pittsburgh';

SELECT business_name, business_category, business_number, city, closest_major_city, state_abbreviation 
from businesses
where owner_first_name = 'user';

SELECT business_name, business_category, business_number, city, closest_major_city, state_abbreviation 
from businesses
where owner_last_name = 'name';

Insert Into users_businesses ( '1', (INSERT INTO businesses (
	business_id, business_name, business_category, business_number, 
	city, closest_major_city, state_abbreviation, owner_first_name, owner_last_name, owner_phone_number)
VALUES (default, 'test1', 'Computers & Electronics', '412-000-X', 'Pittsburgh', 'Pittsburgh', 'PA' ,'user', 'name', '412-000-0001')
Returning business_id));


INSERT INTO users_businesses (user_id, business_id) VALUES (1, 1);

select * from users_businesses;

select content from messages
where recipient = 2;



