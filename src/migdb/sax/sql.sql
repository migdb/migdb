CREATE TABLE root (
    name varchar(50), 
    id int, 
    color varchar(50),
    CONSTRAINT pk_root PRIMARY KEY (id)
);

CREATE TABLE child2 (
    age_child2 int, 
    price_child2 int, 
    count_child1 int, 
    id int,
    CONSTRAINT pk_child2 PRIMARY KEY (id),
    CONSTRAINT FK_root FOREIGN KEY (id) REFERENCES root
);

CREATE TABLE child1 (
    id int, 
    age_child1 int, 
    price_child1 int, 
    count_child1 int,
    CONSTRAINT FK_root FOREIGN KEY (id) REFERENCES root,
    CONSTRAINT pk_child1 PRIMARY KEY (id)
);

CREATE TABLE child3 (
    id int, 
    price_child3 int, 
    age_child3 int, 
    count_child3 int,
    CONSTRAINT FK_root FOREIGN KEY (id) REFERENCES root,
    CONSTRAINT pk_child3 PRIMARY KEY (id)
)