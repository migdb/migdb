INSERT INTO public.address (street,city,zip,id_country)
				SELECT id_address,street,city,zip,id_country FROM party;
