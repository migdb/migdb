ALTER TABLE public.party
	ADD CONSTRAINT FK_party_country
	FOREIGN KEY (zip) REFERENCES public.party (id);
