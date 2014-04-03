#!/bin/sh

#checks existence of migdb_configuration.cfg
`dirname $0`/check_config.sh

#read configuration file
. ~/migdb_config.cfg

#updates plugins version in ECLIPSE, importing plugin INTO
updatePlugin() {
  diff -q "$D_MIGDB/plugins/$1" "$D_ECLIPSE/dropins/$1"
  if [ $? -ne 0 ]
    then 
      echo "copying $1"
      cp "$D_MIGDB/plugins/$1" "$D_ECLIPSE/dropins"
    else
      echo "$1 app is actual"
  fi
}

updatePlugin migdb.dsl.ide_1.0.0.jar
updatePlugin migdb.dsl.ops.ui_1.0.0.jar
updatePlugin migdb.dsl.ops_1.0.0.jar
updatePlugin migdb.generator_1.0.0.jar
updatePlugin migdb.mm.app_1.0.0.jar
updatePlugin migdb.mm.errors_1.0.0.jar
updatePlugin migdb.mm.rdb_1.0.0.jar
updatePlugin migdb.qvto_1.0.0.jar

