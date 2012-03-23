ALTER TABLE public.address
	ADD CONSTRAINT FK_address_country
	FOREIGN KEY (id_country) REFERENCES public.country (id_country);
