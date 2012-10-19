. ~/migdb_config.cfg

VALIDATOR_APP_PATH=validators/validator_app.qvto 
VALIDATOR_RDB_PATH=validators/validator_postgresql.qvto
ORM_PATH=orm/orm_operations_new.qvto
BUILDER_APP_PATH=builders/builder_app.qvto
BUILDER_RDB_PATH=builders/builder_rdb.qvto
QUERIES_APP_PATH=queries/queries_app.qvto
QUERIES_RDB_PATH=queries/queries_rdb.qvto

QUERIES_APP_LINK=queries_app_link.qvto
QUERIES_RDB_LINK=queries_rdb_link.qvto
BUILDER_APP_LINK=builder_app_link.qvto
BUILDER_RDB_LINK=builder_rdb_link.qvto
ORM_LINK=orm_link.qvto
VALIDATOR_APP_LINK=validator_app_link.qvto
VALIDATOR_RDB_LINK=validator_rdb_link.qvto

rm $D_MIGDB_QVTO/builders/$QUERIES_APP_LINK

rm $D_MIGDB_QVTO/cg/$QUERIES_APP_LINK

rm $D_MIGDB_QVTO/evolution/$QUERIES_APP_LINK
rm $D_MIGDB_QVTO/evolution/$QUERIES_RDB_LINK
rm $D_MIGDB_QVTO/evolution/$BUILDER_APP_LINK
rm $D_MIGDB_QVTO/evolution/$BUILDER_RDB_LINK
rm $D_MIGDB_QVTO/evolution/$ORM_LINK
rm $D_MIGDB_QVTO/evolution/$VALIDATOR_APP_LINK
rm $D_MIGDB_QVTO/evolution/$VALIDATOR_RDB_LINK

rm $D_MIGDB_QVTO/orm/$BUILDER_APP_LINK
rm $D_MIGDB_QVTO/orm/$BUILDER_RDB_LINK
rm $D_MIGDB_QVTO/orm/$QUERIES_APP_LINK
rm $D_MIGDB_QVTO/orm/$QUERIES_RDB_LINK

rm $D_MIGDB_QVTO/tests/comparator_component/$BUILDER_APP_LINK
rm $D_MIGDB_QVTO/tests/comparator_component/$QUERIES_APP_LINK

rm $D_MIGDB_QVTO/tests/migdb_executer/$BUILDER_APP_LINK
rm $D_MIGDB_QVTO/tests/migdb_executer/$BUILDER_RDB_LINK
rm $D_MIGDB_QVTO/tests/migdb_executer/$QUERIES_APP_LINK

rm $D_MIGDB_QVTO/tests/operations/app/$BUILDER_APP_LINK
rm $D_MIGDB_QVTO/tests/operations/app/$QUERIES_APP_LINK

rm $D_MIGDB_QVTO/tests/operations/rdb/$QUERIES_RDB_LINK
rm $D_MIGDB_QVTO/tests/operations/rdb/$BUILDER_RDB_LINK

rm $D_MIGDB_QVTO/tests/orm/$VALIDATOR_APP_LINK

rm $D_MIGDB_QVTO/tests/structures/app/$BUILDER_APP_LINK
rm $D_MIGDB_QVTO/tests/structures/app/$QUERIES_APP_LINK

rm $D_MIGDB_QVTO/tests/tests_app_queries/$BUILDER_APP_LINK
rm $D_MIGDB_QVTO/tests/tests_app_queries/$QUERIES_APP_LINK

rm $D_MIGDB_QVTO/tests/tests_rdb_atomic/$BUILDER_APP_LINK
rm $D_MIGDB_QVTO/tests/tests_rdb_atomic/$QUERIES_APP_LINK

rm $D_MIGDB_QVTO/tests/validator_app/$BUILDER_APP_LINK
rm $D_MIGDB_QVTO/tests/validator_app/$QUERIES_APP_LINK

rm $D_MIGDB_QVTO/tests/validator_postgresql/$BUILDER_RDB_LINK

rm $D_MIGDB_QVTO/validators/$QUERIES_APP_LINK
rm $D_MIGDB_QVTO/validators/$QUERIES_RDB_LINK



ln -s ../$QUERIES_APP_PATH $D_MIGDB_QVTO/builders/$QUERIES_APP_LINK

ln -s ../$QUERIES_APP_PATH $D_MIGDB_QVTO/cg/$QUERIES_APP_LINK

ln -s ../$QUERIES_APP_PATH $D_MIGDB_QVTO/evolution/$QUERIES_APP_LINK
ln -s ../$QUERIES_RDB_PATH $D_MIGDB_QVTO/evolution/$QUERIES_RDB_LINK
ln -s ../$BUILDER_APP_PATH $D_MIGDB_QVTO/evolution/$BUILDER_APP_LINK
ln -s ../$BUILDER_RDB_PATH $D_MIGDB_QVTO/evolution/$BUILDER_RDB_LINK
ln -s ../$ORM_PATH $D_MIGDB_QVTO/evolution/$ORM_LINK
ln -s ../$VALIDATOR_APP_PATH $D_MIGDB_QVTO/evolution/$VALIDATOR_APP_LINK
ln -s ../$VALIDATOR_RDB_PATH $D_MIGDB_QVTO/evolution/$VALIDATOR_RDB_LINK

ln -s ../$BUILDER_APP_PATH $D_MIGDB_QVTO/orm/$BUILDER_APP_LINK
ln -s ../$BUILDER_RDB_PATH $D_MIGDB_QVTO/orm/$BUILDER_RDB_LINK
ln -s ../$QUERIES_APP_PATH $D_MIGDB_QVTO/orm/$QUERIES_APP_LINK
ln -s ../$QUERIES_RDB_PATH $D_MIGDB_QVTO/orm/$QUERIES_RDB_LINK

ln -s ../../$QUERIES_APP_PATH $D_MIGDB_QVTO/tests/comparator_component/$QUERIES_APP_LINK
ln -s ../../$BUILDER_APP_PATH $D_MIGDB_QVTO/tests/comparator_component/$BUILDER_APP_LINK

ln -s ../../$BUILDER_APP_PATH $D_MIGDB_QVTO/tests/migdb_executer/$BUILDER_APP_LINK
ln -s ../../$BUILDER_RDB_PATH $D_MIGDB_QVTO/tests/migdb_executer/$BUILDER_RDB_LINK
ln -s ../../$QUERIES_APP_PATH $D_MIGDB_QVTO/tests/migdb_executer/$QUERIES_APP_LINK

ln -s ../../../$BUILDER_APP_PATH $D_MIGDB_QVTO/tests/operations/app/$BUILDER_APP_LINK
ln -s ../../../$QUERIES_APP_PATH $D_MIGDB_QVTO/tests/operations/app/$QUERIES_APP_LINK

ln -s ../../../$BUILDER_RDB_PATH $D_MIGDB_QVTO/tests/operations/rdb/$BUILDER_RDB_LINK
ln -s ../../../$QUERIES_RDB_PATH $D_MIGDB_QVTO/tests/operations/rdb/$QUERIES_RDB_LINK

ln -s ../../$VALIDATOR_APP_PATH $D_MIGDB_QVTO/tests/orm/$VALIDATOR_APP_LINK

ln -s ../../../$BUILDER_APP_PATH $D_MIGDB_QVTO/tests/structures/app/$BUILDER_APP_LINK
ln -s ../../../$QUERIES_APP_PATH $D_MIGDB_QVTO/tests/structures/app/$QUERIES_APP_LINK

ln -s ../../$BUILDER_APP_PATH $D_MIGDB_QVTO/tests/tests_app_queries/$BUILDER_APP_LINK
ln -s ../../$QUERIES_APP_PATH $D_MIGDB_QVTO/tests/tests_app_queries/$QUERIES_APP_LINK

ln -s ../../$BUILDER_APP_PATH $D_MIGDB_QVTO/tests/tests_rdb_atomic/$BUILDER_APP_LINK
ln -s ../../$QUERIES_APP_PATH $D_MIGDB_QVTO/tests/tests_rdb_atomic/$QUERIES_APP_LINK

ln -s ../../$BUILDER_APP_PATH $D_MIGDB_QVTO/tests/validator_app/$BUILDER_APP_LINK
ln -s ../../$QUERIES_APP_PATH $D_MIGDB_QVTO/tests/validator_app/$QUERIES_APP_LINK

ln -s ../../$BUILDER_RDB_PATH $D_MIGDB_QVTO/tests/validator_postgresql/$BUILDER_RDB_LINK

ln -s ../$QUERIES_APP_PATH $D_MIGDB_QVTO/validators/$QUERIES_APP_LINK
ln -s ../$QUERIES_RDB_PATH $D_MIGDB_QVTO/validators/$QUERIES_RDB_LINK

