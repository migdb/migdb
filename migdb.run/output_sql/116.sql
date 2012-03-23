INSERT INTO public.party (street,city,zip,id_country,id_party)
				SELECT street,city,zip,id_country,id_naturalperson FROM naturalperson;
