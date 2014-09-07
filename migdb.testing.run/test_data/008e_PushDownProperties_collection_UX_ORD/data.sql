INSERT INTO parent (id_parent, staying_pr) VALUES (1, 2), (2, 3), (3, 4), (4, 5), (5, 6);

INSERT INTO child (id_child) VALUES (4), (5);


INSERT INTO col_parent_pushed_pr (id_parent, pushed_pr, ordering) VALUES (1, 2, 1), (1, 4, 2), (2, 3, 1), (2, 1, 2), (2, 5, 3), (3, 1, 1), (4, 1, 1), (4, 2, 2), (4, 3, 3);

