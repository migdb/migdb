INSERT INTO country VALUES(nextval('seq_global'), 'New York'),(nextval('seq_global'), 'Florida'),(nextval('seq_global'), 'Iowa'), (nextval('seq_global'), 'Nevada')
,(nextval('seq_global'), 'Ohio'),(nextval('seq_global'), 'Washington'),(nextval('seq_global'), 'Indiana'),(nextval('seq_global'), 'New Jersey'),(nextval('seq_global'), 'Oklahoma')
,(nextval('seq_global'), 'Texas');


INSERT INTO naturalperson VALUES (nextval('seq_global'),'Peter','Jackson', 'Central Park St', 'New York', '100 01',1);
INSERT INTO naturalperson VALUES (nextval('seq_global'),'George','Clooney', 'S Orange Ave', 'Orlando', '320 24', 2);
INSERT INTO naturalperson VALUES (nextval('seq_global'),'Jack','Daniels', 'Down St', 'Dublin', '456 01', 5);
INSERT INTO naturalperson VALUES (nextval('seq_global'),'Tomas','White', 'R 32th St', 'Washington', '983 43', 6);
INSERT INTO naturalperson VALUES (nextval('seq_global'),'Mel','Gibson', 'Up St', 'New Jersey', 'Philadelpia', 8);

INSERT INTO legalperson VALUES (nextval('seq_global'),098383,'Google', 'Nice Street', 'Redmond', '757 65', 10);
INSERT INTO legalperson VALUES (nextval('seq_global'),1542789,'Microsoft', 'E 12th St', 'Sillicon Valley', '346 09',8);