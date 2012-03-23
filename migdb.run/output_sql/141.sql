ALTER TABLE public.party
	ADD CONSTRAINT FK_contactaddress_id_country
	FOREIGN KEY (contactaddress) REFERENCES public.country (id_country);
