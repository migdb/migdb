INSERT INTO type (id_type) VALUES (1), (2), (3), (5);

INSERT INTO parent (id_parent) VALUES (1), (2), (3), (4), (5);

INSERT INTO tab (id_tab) VALUES (1), (2);

INSERT INTO parent_age (id_parent, id_type, ordering) VALUES
       (1, 1, 1),
       (1, 2, 2),
       (1, 3, 3),
       (2, 2, 1),
       (2, 3, 2),
       (3, 3, 1),
       (3, 5, 2),
       (3, 2, 3),
       (4, 2, 1),
       (4, 5, 2),
       (5, 5, 1),
       (5, 2, 2);
