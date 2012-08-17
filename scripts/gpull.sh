#!/bin/sh
git pull

#read configuration file
#. `dirname $0`/config.cfg
. ~/config.cfg

#conditional copying mm.app
diff -q plugins/migdb.mm.app_1.0.0.jar $D_ECLIPSE/dropins/migdb.mm.app_1.0.0.jar
if [ $? -ne 0 ]
  then 
	echo copying mm app
	cp plugins/migdb.mm.app_1.0.0.jar $D_ECLIPSE/dropins
  else
     echo mm app is actual
fi

#conditional copying mm.rdb
diff -q plugins/migdb.mm.rdb_1.0.0.jar $D_ECLIPSE/dropins/migdb.mm.rdb_1.0.0.jar
if [ $? -ne 0 ]
  then 
	echo copying mm rdb
	cp plugins/migdb.mm.rdb_1.0.0.jar $D_ECLIPSE/dropins
  else
     echo mm rdb is actual
fi
