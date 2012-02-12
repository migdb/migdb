ALTER TABLE publice.child
	ADD CONSTRAINT fk_klic
	FOREIGN KEY (fk) REFERENCES publice.child (id);
