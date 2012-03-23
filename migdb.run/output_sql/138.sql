ALTER TABLE public.party
	ADD CONSTRAINT FK_address_id_address
	FOREIGN KEY (address) REFERENCES public.address (id_address);
