ALTER TABLE public.address
	ADD CONSTRAINT FK_country_id_country
	FOREIGN KEY (country) REFERENCES public.country (id_country);
