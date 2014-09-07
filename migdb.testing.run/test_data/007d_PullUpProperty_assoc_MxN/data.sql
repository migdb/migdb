INSERT INTO type (id_type) VALUES (1), (2), (3);
INSERT INTO parent (id_parent, pr_parent) VALUES (1, 2), (2, 3), (3, 4), (4, 5);

INSERT INTO child (id_child, child_stays) VALUES (1, 1), (2, 1);

INSERT INTO child_pulled_first_pr (id_child, id_type) VALUES (1, 1), (1, 2), (2, 1), (2, 3);

INSERT INTO child_pulled_second_pr(id_child, id_type) VALUES (1, 3), (2, 1), (2, 2), (2, 3)
