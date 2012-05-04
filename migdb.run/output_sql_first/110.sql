INSERT INTO public.party (id_party,street,city,zip,country)
				SELECT id_legalperson,street,city,zip,country FROM legalperson;
