INSERT INTO public.address (id,street,city,zip)
				SELECT address,street,city,zip FROM party;
