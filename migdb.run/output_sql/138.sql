ALTER TABLE public.party
	ADD CONSTRAINT FK_party_id_address
	FOREIGN KEY (id_address) REFERENCES public.address (id_address);
