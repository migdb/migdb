CREATE TABLE JOIN_Parent (
    JOIN_parent_ID int,
    CONSTRAINT pk_JOIN_Parent PRIMARY KEY (JOIN_parent_ID)
);

CREATE TABLE TPC_Parent (
    TPC_parent_ID int,
    CONSTRAINT pk_TPC_Parent PRIMARY KEY (TPC_parent_ID)
);

CREATE TABLE TPC_Child (
    TPC_parent_ID int, 
    TPC_child_property int,
    CONSTRAINT pk_TPC_Child PRIMARY KEY (TPC_parent_ID)
);

CREATE TABLE ST_Parent (
    discriminator varchar(50), 
    ST_child_property int, 
    ST_parent_ID int, 
    ST_grandchild_property int,
    CONSTRAINT pk_ST_Parent PRIMARY KEY (ST_parent_ID)
);

CREATE TABLE TPC_GrandChild (
    TPC_parent_ID int, 
    TPC_grandchild_property int, 
    TPC_child_property int,
    CONSTRAINT pk_TPC_GrandChild PRIMARY KEY (TPC_parent_ID)
);

CREATE TABLE JOIN_Child (
    JOIN_parent_ID int, 
    JOIN_child_property int,
    CONSTRAINT FK_JOIN_Parent_JOIN_Child FOREIGN KEY (JOIN_parent_ID) REFERENCES JOIN_Parent,
    CONSTRAINT pk_JOIN_Child PRIMARY KEY (JOIN_parent_ID)
);

CREATE TABLE JOIN_GrandChild (
    JOIN_parent_ID int, 
    JOIN_grandchild_property int,
    CONSTRAINT pk_JOIN_GrandChild PRIMARY KEY (JOIN_parent_ID),
    CONSTRAINT FK_JOIN_Child_JOIN_GrandChild FOREIGN KEY (JOIN_parent_ID) REFERENCES JOIN_Child
)