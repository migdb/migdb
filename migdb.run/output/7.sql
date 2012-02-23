INSERT INTO public.address (id,street,city)
				SELECT nextval('seq_global'), street,city FROM party;
