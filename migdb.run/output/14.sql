CREATE OR REPLACE FUNCTION convert_chartoint(chartoconvert character varying) RETURNS integer AS
	$BODY$
		SELECT CASE WHEN trim($1) SIMILAR TO '[0-9]+' THEN CAST(trim($1) AS integer) ELSE NULL END;
	$BODY$
	LANGUAGE 'sql' IMMUTABLE STRICT;	
