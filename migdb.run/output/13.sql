UPDATE public.party SET address_id = 
							(SELECT id FROM public.address);