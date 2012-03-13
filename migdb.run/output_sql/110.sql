ALTER TABLE public.address
	ADD CONSTRAINT FK_address_country
	FOREIGN KEY (zip) REFERENCES public.country (id);
