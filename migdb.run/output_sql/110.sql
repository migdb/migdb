INSERT INTO public.party (street,city,zip,id_country,id_party)
				SELECT street,city,zip,id_country,id_legalperson FROM legalperson;
