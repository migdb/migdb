ALTER TABLE public.child
	ADD CONSTRAINT fk_klic
	FOREIGN KEY (fk) REFERENCES public.child (id);
