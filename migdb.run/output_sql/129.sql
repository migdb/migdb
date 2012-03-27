ALTER TABLE public.naturalperson
	ADD CONSTRAINT FK_country_id_country
	FOREIGN KEY (country) REFERENCES public.country (id_country);
