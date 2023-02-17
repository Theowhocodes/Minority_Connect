-- ********************************************************************************
-- This script creates the database users and grants them the necessary permissions
-- ********************************************************************************

CREATE USER minority_connect_owner
WITH PASSWORD 'minorityconnect';

GRANT ALL
ON ALL TABLES IN SCHEMA public
TO minority_connect_owner;

GRANT ALL
ON ALL SEQUENCES IN SCHEMA public
TO minority_connect_owner;

CREATE USER minority_connect_appuser
WITH PASSWORD 'minorityconnect';

GRANT SELECT, INSERT, UPDATE, DELETE
ON ALL TABLES IN SCHEMA public
TO minority_connect_appuser;

GRANT USAGE, SELECT
ON ALL SEQUENCES IN SCHEMA public
TO minority_connect_appuser;
