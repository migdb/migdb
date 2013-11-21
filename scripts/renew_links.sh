#!/bin/sh
#IMPORTANT NOTE : if you modify this script, please execute it once to check it creates valid links before committing change   

#check existence of migdb configuration file.
`dirname $0`/check_config.sh

#read configuration file
. ~/migdb_config.cfg

#path to qvto project
D_MIGDB_QVTO=$D_MIGDB/migdb.qvto/transforms

BUILDER_APP_PATH=main/builder_app.qvto
BUILDER_RDB_PATH=main/builder_rdb.qvto
BUILDER_ERRORS_PATH=main/builder_errors.qvto
QUERIES_APP_PATH=main/queries_app.qvto
QUERIES_RDB_PATH=main/queries_rdb.qvto
TEXT_SERVICE_PATH=main/text_service.qvto

QUERIES_APP_LINK=queries_app.qvto
QUERIES_RDB_LINK=queries_rdb.qvto
BUILDER_APP_LINK=builder_app.qvto
BUILDER_RDB_LINK=builder_rdb.qvto
BUILDER_ERRORS_LINK=builder_errors.qvto
TEXT_SERVICE_LINK=text_service.qvto


rm $D_MIGDB_QVTO/tests/code_generation/$QUERIES_APP_LINK
rm $D_MIGDB_QVTO/tests/code_generation/$BUILDER_APP_LINK
rm $D_MIGDB_QVTO/tests/code_generation/$TEXT_SERVICE_LINK
rm $D_MIGDB_QVTO/tests/code_generation/$BUILDER_RDB_LINK

rm $D_MIGDB_QVTO/tests/comparator_component/$BUILDER_APP_LINK
rm $D_MIGDB_QVTO/tests/comparator_component/$QUERIES_APP_LINK
rm $D_MIGDB_QVTO/tests/comparator_component/$TEXT_SERVICE_LINK

rm $D_MIGDB_QVTO/tests/comparisons_app_atomic/$BUILDER_APP_LINK
rm $D_MIGDB_QVTO/tests/comparisons_app_atomic/$QUERIES_APP_LINK
rm $D_MIGDB_QVTO/tests/comparisons_app_atomic/$TEXT_SERVICE_LINK

rm $D_MIGDB_QVTO/tests/migdb_executer/$BUILDER_APP_LINK
rm $D_MIGDB_QVTO/tests/migdb_executer/$BUILDER_RDB_LINK
rm $D_MIGDB_QVTO/tests/migdb_executer/$QUERIES_APP_LINK
rm $D_MIGDB_QVTO/tests/migdb_executer/$TEXT_SERVICE_LINK

rm $D_MIGDB_QVTO/tests/operations/app/$BUILDER_APP_LINK
rm $D_MIGDB_QVTO/tests/operations/app/$QUERIES_APP_LINK
rm $D_MIGDB_QVTO/tests/operations/app/$TEXT_SERVICE_LINK

rm $D_MIGDB_QVTO/tests/operations/rdb/$QUERIES_RDB_LINK
rm $D_MIGDB_QVTO/tests/operations/rdb/$BUILDER_RDB_LINK

rm $D_MIGDB_QVTO/tests/oracle_tests/$BUILDER_APP_LINK
rm $D_MIGDB_QVTO/tests/oracle_tests/$QUERIES_APP_LINK
rm $D_MIGDB_QVTO/tests/oracle_tests/$TEXT_SERVICE_LINK

rm $D_MIGDB_QVTO/tests/structures/app/$BUILDER_APP_LINK
rm $D_MIGDB_QVTO/tests/structures/app/$QUERIES_APP_LINK
rm $D_MIGDB_QVTO/tests/structures/app/$TEXT_SERVICE_LINK

rm $D_MIGDB_QVTO/tests/structures/rdb/$BUILDER_RDB_LINK
rm $D_MIGDB_QVTO/tests/structures/rdb/$QUERIES_RDB_LINK

rm $D_MIGDB_QVTO/tests/tests_app_queries/$BUILDER_APP_LINK
rm $D_MIGDB_QVTO/tests/tests_app_queries/$QUERIES_APP_LINK
rm $D_MIGDB_QVTO/tests/tests_app_queries/$TEXT_SERVICE_LINK

##rm $D_MIGDB_QVTO/tests/tests_rdb_atomic/$BUILDER_RDB_LINK
##rm $D_MIGDB_QVTO/tests/tests_rdb_atomic/$QUERIES_RDB_LINK
##rm $D_MIGDB_QVTO/tests/tests_rdb_atomic/$BUILDER_ERRORS_LINK

rm $D_MIGDB_QVTO/tests/validator_app/$BUILDER_APP_LINK
rm $D_MIGDB_QVTO/tests/validator_app/$BUILDER_ERRORS_LINK
rm $D_MIGDB_QVTO/tests/validator_app/$QUERIES_APP_LINK
rm $D_MIGDB_QVTO/tests/validator_app/$TEXT_SERVICE_LINK

rm $D_MIGDB_QVTO/tests/validator_postgresql/$BUILDER_RDB_LINK
rm $D_MIGDB_QVTO/tests/validator_postgresql/$BUILDER_ERRORS_LINK


ln -s ../../$QUERIES_APP_PATH $D_MIGDB_QVTO/tests/code_generation/$QUERIES_APP_LINK
ln -s ../../$BUILDER_APP_PATH $D_MIGDB_QVTO/tests/code_generation/$BUILDER_APP_LINK
ln -s ../../$BUILDER_RDB_PATH $D_MIGDB_QVTO/tests/code_generation/$BUILDER_RDB_LINK
ln -s ../../$TEXT_SERVICE_PATH $D_MIGDB_QVTO/tests/code_generation/$TEXT_SERVICE_LINK


ln -s ../../$QUERIES_APP_PATH $D_MIGDB_QVTO/tests/comparator_component/$QUERIES_APP_LINK
ln -s ../../$BUILDER_APP_PATH $D_MIGDB_QVTO/tests/comparator_component/$BUILDER_APP_LINK
ln -s ../../$TEXT_SERVICE_PATH $D_MIGDB_QVTO/tests/comparator_component/$TEXT_SERVICE_LINK

ln -s ../../$QUERIES_APP_PATH $D_MIGDB_QVTO/tests/comparisons_app_atomic/$QUERIES_APP_LINK
ln -s ../../$BUILDER_APP_PATH $D_MIGDB_QVTO/tests/comparisons_app_atomic/$BUILDER_APP_LINK
ln -s ../../$TEXT_SERVICE_PATH $D_MIGDB_QVTO/tests/comparisons_app_atomic/$TEXT_SERVICE_LINK

ln -s ../../$BUILDER_APP_PATH $D_MIGDB_QVTO/tests/migdb_executer/$BUILDER_APP_LINK
ln -s ../../$BUILDER_RDB_PATH $D_MIGDB_QVTO/tests/migdb_executer/$BUILDER_RDB_LINK
ln -s ../../$QUERIES_APP_PATH $D_MIGDB_QVTO/tests/migdb_executer/$QUERIES_APP_LINK
ln -s ../../$TEXT_SERVICE_PATH $D_MIGDB_QVTO/tests/migdb_executer/$TEXT_SERVICE_LINK

ln -s ../../../$BUILDER_APP_PATH $D_MIGDB_QVTO/tests/operations/app/$BUILDER_APP_LINK
ln -s ../../../$QUERIES_APP_PATH $D_MIGDB_QVTO/tests/operations/app/$QUERIES_APP_LINK
ln -s ../../../$TEXT_SERVICE_PATH $D_MIGDB_QVTO/tests/operations/app/$TEXT_SERVICE_LINK

ln -s ../../../$BUILDER_RDB_PATH $D_MIGDB_QVTO/tests/operations/rdb/$BUILDER_RDB_LINK
ln -s ../../../$QUERIES_RDB_PATH $D_MIGDB_QVTO/tests/operations/rdb/$QUERIES_RDB_LINK

ln -s ../../$BUILDER_APP_PATH $D_MIGDB_QVTO/tests/oracle_tests/$BUILDER_APP_LINK
ln -s ../../$QUERIES_APP_PATH $D_MIGDB_QVTO/tests/oracle_tests/$QUERIES_APP_LINK
ln -s ../../$TEXT_SERVICE_PATH $D_MIGDB_QVTO/tests/oracle_tests/$TEXT_SERVICE_LINK

ln -s ../../../$BUILDER_APP_PATH $D_MIGDB_QVTO/tests/structures/app/$BUILDER_APP_LINK
ln -s ../../../$QUERIES_APP_PATH $D_MIGDB_QVTO/tests/structures/app/$QUERIES_APP_LINK
ln -s ../../../$TEXT_SERVICE_PATH $D_MIGDB_QVTO/tests/structures/app/$TEXT_SERVICE_LINK

ln -s ../../../$BUILDER_RDB_PATH $D_MIGDB_QVTO/tests/structures/rdb/$BUILDER_RDB_LINK
ln -s ../../../$QUERIES_RDB_PATH $D_MIGDB_QVTO/tests/structures/rdb/$QUERIES_RDB_LINK

ln -s ../../$BUILDER_APP_PATH $D_MIGDB_QVTO/tests/tests_app_queries/$BUILDER_APP_LINK
ln -s ../../$QUERIES_APP_PATH $D_MIGDB_QVTO/tests/tests_app_queries/$QUERIES_APP_LINK
ln -s ../../$TEXT_SERVICE_PATH $D_MIGDB_QVTO/tests/tests_app_queries/$TEXT_SERVICE_LINK

#ln -s ../../$BUILDER_RDB_PATH $D_MIGDB_QVTO/tests/tests_rdb_atomic/$BUILDER_RDB_LINK
#ln -s ../../$QUERIES_RDB_PATH $D_MIGDB_QVTO/tests/tests_rdb_atomic/$QUERIES_RDB_LINK
#ln -s ../../$BUILDER_ERRORS_PATH $D_MIGDB_QVTO/tests/tests_rdb_atomic/$BUILDER_ERRORS_LINK

ln -s ../../$BUILDER_APP_PATH $D_MIGDB_QVTO/tests/validator_app/$BUILDER_APP_LINK
ln -s ../../$BUILDER_ERRORS_PATH $D_MIGDB_QVTO/tests/validator_app/$BUILDER_ERRORS_LINK
ln -s ../../$QUERIES_APP_PATH $D_MIGDB_QVTO/tests/validator_app/$QUERIES_APP_LINK
ln -s ../../$TEXT_SERVICE_PATH $D_MIGDB_QVTO/tests/validator_app/$TEXT_SERVICE_LINK

ln -s ../../$BUILDER_RDB_PATH $D_MIGDB_QVTO/tests/validator_postgresql/$BUILDER_RDB_LINK
ln -s ../../$BUILDER_ERRORS_PATH $D_MIGDB_QVTO/tests/validator_postgresql/$BUILDER_ERRORS_LINK


