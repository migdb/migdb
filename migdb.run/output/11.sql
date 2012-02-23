ALTER TABLE public.party
	ADD CONSTRAINT FK_party_address
	FOREIGN KEY (address_id) REFERENCES public.party (id);
