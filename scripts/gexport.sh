#!/bin/sh

#check existence of migdb configuration file.
`dirname $0`/check_config.sh

#read configuration file
. ~/migdb_config.cfg

#exports plugins of actual version from ECLIPSE, importing plugin FROM ECLIPSE INTO REPOSITORY
exportPlugin() {
  diff -q "$D_MIGDB/plugins/$1" "$D_ECLIPSE/dropins/$1"
  if [ $? -ne 0 ]
    then 
      echo "exporting $1"
      cp "$D_ECLIPSE/dropins/$1" "$D_MIGDB/plugins"
    else
      echo "$1 is actual"
  fi
}

exportPlugin migdb.dsl.ide_1.0.0.jar
exportPlugin migdb.dsl.ops.ui_1.0.0.jar
exportPlugin migdb.dsl.ops_1.0.0.jar
exportPlugin migdb.generator_1.0.0.jar
exportPlugin migdb.mm.app_1.0.0.jar
exportPlugin migdb.mm.errors_1.0.0.jar
exportPlugin migdb.mm.rdb_1.0.0.jar
exportPlugin migdb.qvto_1.0.0.jar
