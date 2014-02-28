#!/bin/sh

#checks existence of migdb_configuration.cfg
`dirname $0`/check_config.sh

#read configuration file
. ~/migdb_config.cfg

#checks plugins version
checkVer() {
  diff -q "$D_MIGDB/plugins/$1" "$D_ECLIPSE/dropins/$1"
  if [ $? -ne 0 ]
    then 
    echo "copying $1"
    cp "$D_MIGDB/plugins/$1" "$D_ECLIPSE/dropins"
    else
       echo "$1 app is actual"
  fi
}

checkVer migdb.dsl.ide_1.0.0.jar
checkVer migdb.dsl.ops.ui_1.0.0.jar
checkVer migdb.dsl.ops_1.0.0.jar
checkVer migdb.generator_1.0.0.jar
checkVer migdb.mm.app_1.0.0.jar
checkVer migdb.mm.errors_1.0.0.jar
checkVer migdb.mm.rdb_1.0.0.jar
checkVer migdb.qvto_1.0.0.jar
checkVer migdb.run_1.0.0.jar

