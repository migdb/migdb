INSERT INTO man(id_man, favourite_number) VALUES (1, 5), (2,6);

INSERT INTO type(id_type, type_prop) VALUES (1, 3), (2, 4);

INSERT INTO man_age(id_man, id_type, ordering) VALUES 
--ordered collection 1
(1, 1, 1), (1, 2, 2),
--ordered collection 2
(2, 1, 1), (2, 2, 2);

