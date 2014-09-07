INSERT INTO parent (id_parent, pr_parent) VALUES (1,1), (2, 2), (3,3), (4, 4), (5, 57);

INSERT INTO child (id_child) VALUES (1), (2);

INSERT INTO type (id_type) VALUES (1), (2), (3);

INSERT INTO child_unique_and_ord (id_child, id_type, ordering) VALUES (1, 1, 1), (1, 3, 2), (2, 1, 1), (2, 3, 2), (2, 2, 3);


