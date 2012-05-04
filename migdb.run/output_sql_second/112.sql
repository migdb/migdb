INSERT INTO public.address (id_address,street,city,zip,country)
				SELECT address,street,city,zip,country FROM party;
