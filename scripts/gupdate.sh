#!/bin/sh

#check existence of migdb configuration file.
if [ ! -f ~/migdb_config.cfg ] 
  then 
	echo Your home folder doesn\'t contain configuration file migdb_config.cfg. Check https://github.com/migdb/migdb/wiki/scripts for help
	exit
fi

#read configuration file
. ~/migdb_config.cfg

#conditional copying mm.app
diff -q $D_MIGDB/plugins/migdb.mm.app_1.0.0.jar $D_ECLIPSE/dropins/migdb.mm.app_1.0.0.jar
if [ $? -ne 0 ]
  then 
	echo copying mm app
	cp $D_MIGDB/plugins/migdb.mm.app_1.0.0.jar $D_ECLIPSE/dropins
  else
     echo mm app is actual
fi

#conditional copying mm.rdb
diff -q $D_MIGDB/plugins/migdb.mm.rdb_1.0.0.jar $D_ECLIPSE/dropins/migdb.mm.rdb_1.0.0.jar
if [ $? -ne 0 ]
  then 
	echo copying mm rdb
	cp $D_MIGDB/plugins/migdb.mm.rdb_1.0.0.jar $D_ECLIPSE/dropins
  else
     echo mm rdb is actual
fi
