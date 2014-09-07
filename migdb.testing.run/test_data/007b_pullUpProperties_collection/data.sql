INSERT INTO parent (id_parent, pr_parent) VALUES (1,1), (2, 2), (3,3), (4, 4), (5, 57);

INSERT INTO child (id_child, child_stays) VALUES (1, 3), (2, 4);

INSERT INTO col_child_pulled_first_pr (id_child, pulled_first_pr) VALUES (1, 3), (1, 2), (2, 3), (2, 6);

INSERT INTO col_child_pulled_second_pr(id_child, pulled_second_pr) VALUES (1, 1), (1, 5);
