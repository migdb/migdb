#!/bin/sh
#IMPORTANT NOTE : if you modify this script, please execute it once to check it creates valid links before committing change   

#check existence of migdb configuration file.
`dirname $0`/check_config.sh

#read configuration file
. ~/migdb_config.cfg

#path to qvto project
D_MIGDB_QVTO=$D_MIGDB/migdb.qvto/transforms

VALIDATOR_APP_PATH=main/validator_app.qvto 
VALIDATOR_RDB_PATH=main/validator_postgresql.qvto
EVOLUTION_APP_PATH=main/evolution_app.qvto
EVOLUTION_RDB_PATH=main/evolution_rdb.qvto
ORM_PATH=main/orm.qvto
BUILDER_APP_PATH=main/builder_app.qvto
BUILDER_RDB_PATH=main/builder_rdb.qvto
QUERIES_APP_PATH=main/queries_app.qvto
QUERIES_RDB_PATH=main/queries_rdb.qvto

QUERIES_APP_LINK=queries_app.qvto
QUERIES_RDB_LINK=queries_rdb.qvto
BUILDER_APP_LINK=builder_app.qvto
BUILDER_RDB_LINK=builder_rdb.qvto
ORM_LINK=orm.qvto
VALIDATOR_APP_LINK=validator_app.qvto
VALIDATOR_RDB_LINK=validator_rdb.qvto
EVOLUTION_APP_LINK=evolution_app.qvto
EVOLUTION_RDB_LINK=evolution_rdb.qvto

rm $D_MIGDB_QVTO/tests/code_generation/$QUERIES_APP_LINK
rm $D_MIGDB_QVTO/tests/code_generation/$BUILDER_APP_LINK
rm $D_MIGDB_QVTO/tests/code_generation/$BUILDER_RDB_LINK
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
rm $D_MIGDB_QVTO/tests/orm/$ORM_LINK
rm $D_MIGDB_QVTO/tests/orm/$QUERIES_APP_LINK
rm $D_MIGDB_QVTO/tests/orm/$QUERIES_RDB_LINK
rm $D_MIGDB_QVTO/tests/orm/$BUILDER_APP_LINK
rm $D_MIGDB_QVTO/tests/orm/$BUILDER_RDB_LINK

rm $D_MIGDB_QVTO/tests/structures/app/$BUILDER_APP_LINK
rm $D_MIGDB_QVTO/tests/structures/app/$QUERIES_APP_LINK

rm $D_MIGDB_QVTO/tests/structures/rdb/$BUILDER_RDB_LINK
rm $D_MIGDB_QVTO/tests/structures/rdb/$QUERIES_RDB_LINK

rm $D_MIGDB_QVTO/tests/tests_app_queries/$BUILDER_APP_LINK
rm $D_MIGDB_QVTO/tests/tests_app_queries/$QUERIES_APP_LINK

rm $D_MIGDB_QVTO/tests/tests_rdb_atomic/$BUILDER_RDB_LINK
rm $D_MIGDB_QVTO/tests/tests_rdb_atomic/$QUERIES_RDB_LINK
rm $D_MIGDB_QVTO/tests/tests_rdb_atomic/$EVOLUTION_RDB_LINK

rm $D_MIGDB_QVTO/tests/validator_app/$BUILDER_APP_LINK
rm $D_MIGDB_QVTO/tests/validator_app/$QUERIES_APP_LINK

rm $D_MIGDB_QVTO/tests/validator_postgresql/$BUILDER_RDB_LINK

ln -s ../../$QUERIES_APP_PATH $D_MIGDB_QVTO/tests/code_generation/$QUERIES_APP_LINK
ln -s ../../$BUILDER_APP_PATH $D_MIGDB_QVTO/tests/code_generation/$BUILDER_APP_LINK
ln -s ../../$BUILDER_RDB_PATH $D_MIGDB_QVTO/tests/code_generation/$BUILDER_RDB_LINK

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
ln -s ../../$ORM_PATH $D_MIGDB_QVTO/tests/orm/$ORM_LINK
ln -s ../../$QUERIES_APP_PATH $D_MIGDB_QVTO/tests/orm/$QUERIES_APP_LINK
ln -s ../../$QUERIES_RDB_PATH $D_MIGDB_QVTO/tests/orm/$QUERIES_RDB_LINK
ln -s ../../$BUILDER_APP_PATH $D_MIGDB_QVTO/tests/orm/$BUILDER_APP_LINK
ln -s ../../$BUILDER_RDB_PATH $D_MIGDB_QVTO/tests/orm/$BUILDER_RDB_LINK

ln -s ../../../$BUILDER_APP_PATH $D_MIGDB_QVTO/tests/structures/app/$BUILDER_APP_LINK
ln -s ../../../$QUERIES_APP_PATH $D_MIGDB_QVTO/tests/structures/app/$QUERIES_APP_LINK

ln -s ../../../$BUILDER_RDB_PATH $D_MIGDB_QVTO/tests/structures/rdb/$BUILDER_RDB_LINK
ln -s ../../../$QUERIES_RDB_PATH $D_MIGDB_QVTO/tests/structures/rdb/$QUERIES_RDB_LINK

ln -s ../../$BUILDER_APP_PATH $D_MIGDB_QVTO/tests/tests_app_queries/$BUILDER_APP_LINK
ln -s ../../$QUERIES_APP_PATH $D_MIGDB_QVTO/tests/tests_app_queries/$QUERIES_APP_LINK

ln -s ../../$BUILDER_RDB_PATH $D_MIGDB_QVTO/tests/tests_rdb_atomic/$BUILDER_RDB_LINK
ln -s ../../$QUERIES_RDB_PATH $D_MIGDB_QVTO/tests/tests_rdb_atomic/$QUERIES_RDB_LINK
ln -s ../../$EVOLUTION_RDB_PATH $D_MIGDB_QVTO/tests/tests_rdb_atomic/$EVOLUTION_RDB_LINK

ln -s ../../$BUILDER_APP_PATH $D_MIGDB_QVTO/tests/validator_app/$BUILDER_APP_LINK
ln -s ../../$QUERIES_APP_PATH $D_MIGDB_QVTO/tests/validator_app/$QUERIES_APP_LINK

ln -s ../../$BUILDER_RDB_PATH $D_MIGDB_QVTO/tests/validator_postgresql/$BUILDER_RDB_LINK
