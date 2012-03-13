ALTER TABLE public.party
	ADD CONSTRAINT FK_party_address
	FOREIGN KEY (address) REFERENCES public.address (id);
