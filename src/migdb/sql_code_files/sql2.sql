CREATE TABLE root (
    count_child3 int, 
    age_child3 int, 
    price_child3 int, 
    name varchar(50), 
    age_child2 int, 
    age_child1 int, 
    count_child1 int, 
    id int, 
    color varchar(50), 
    price_child2 int, 
    price_child1 int, 
    discriminator varchar(50), 
    count_child2 int,
    CONSTRAINT pk_root PRIMARY KEY (id)
)