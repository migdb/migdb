INSERT INTO public.party (id_party,street,city,zip,country)
				SELECT id_naturalperson,street,city,zip,country FROM naturalperson;
