INSERT INTO country VALUES(nextval('seq_global'), 'Ceska republika');

INSERT INTO naturalperson VALUES (nextval('seq_global'),'Petr','Tarant', 'Decinska', 'Decin', '405 02',1);
INSERT INTO naturalperson VALUES (nextval('seq_global'),'Jiri','Jezek', 'Jicinska', 'Jicin', '406 03', 1);
INSERT INTO naturalperson VALUES (nextval('seq_global'),'Ondrej','Macek', 'Prazska', 'Praha', '110 00', 1);

INSERT INTO legalperson VALUES (nextval('seq_global'),1234,'Google', 'Brnenska', 'Brno', '120 00', 1);
INSERT INTO legalperson VALUES (nextval('seq_global'),5678,'Microsoft', 'Plzenska', 'Plzen', '123 45',1);
