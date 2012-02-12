CREATE OR REPLACE FUNCTION convert_chartobool(chartoconvert character varying) RETURNS boolean AS
	$BODY$
		SELECT CASE 
					WHEN trim($1) LIKE 'true' THEN TRUE
					WHEN trim($1) LIKE 'false' THEN FALSE 
			   END;
	$BODY$
	LANGUAGE 'sql' IMMUTABLE STRICT;
