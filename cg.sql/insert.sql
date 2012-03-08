INSERT INTO country VALUES(nextval('seq_global'), 'Ceska republika');

INSERT INTO party VALUES (nextval('seq_global'), 'Decinska', 'Decin');
INSERT INTO naturalperson VALUES (currval('seq_global'),'Petr','Tarant');

INSERT INTO party VALUES (nextval('seq_global'), 'Jicinska', 'Jicin');
INSERT INTO naturalperson VALUES (currval('seq_global'),'Jiri','Jezek');

INSERT INTO party VALUES (nextval('seq_global'), 'Prazska', 'Praha');
INSERT INTO naturalperson VALUES (currval('seq_global'),'Ondrej','Macek');

INSERT INTO party VALUES (nextval('seq_global'), 'Brnenska', 'Brno');
INSERT INTO legalperson VALUES (currval('seq_global'),1234,'Google');

INSERT INTO party VALUES (nextval('seq_global'), 'Plzenska', 'Plzen');
INSERT INTO legalperson VALUES (currval('seq_global'),5678,'Microsoft');