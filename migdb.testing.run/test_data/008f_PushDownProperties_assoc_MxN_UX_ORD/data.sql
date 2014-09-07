INSERT INTO type (id_type) VALUES (1), (2), (3), (4), (5);

INSERT INTO parent (id_parent, staying_pr) VALUES (1, 2), (2, 3), (3, 4), (4, 5), (5, 6);

INSERT INTO child (id_child) VALUES (4), (5);

INSERT INTO parent_pushed_pr (id_parent, id_type, ordering) VALUES (1, 1, 1), (1, 2, 2), (2, 3, 1), (2, 4, 2), (4, 1, 1), (4, 2, 2), (4, 3, 3);

