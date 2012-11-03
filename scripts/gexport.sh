#!/bin/sh

#check existence of migdb configuration file.
`dirname $0`/check_config.sh

#read configuration file
. ~/migdb_config.cfg

#conditional exporting mm.app
diff -q $D_MIGDB/plugins/migdb.mm.app_1.0.0.jar $D_ECLIPSE/dropins/migdb.mm.app_1.0.0.jar
if [ $? -ne 0 ]
  then 
	echo exporting mm app
	cp $D_ECLIPSE/dropins/migdb.mm.app_1.0.0.jar $D_MIGDB/plugins
  else
     echo mm app is actual
fi

#conditional exporting mm.rdb
diff -q $D_MIGDB/plugins/migdb.mm.rdb_1.0.0.jar $D_ECLIPSE/dropins/migdb.mm.rdb_1.0.0.jar 
if [ $? -ne 0 ]
  then 
	echo exporting mm rdb
	cp $D_ECLIPSE/dropins/migdb.mm.rdb_1.0.0.jar $D_MIGDB/plugins 
  else
     echo mm rdb is actual
fi

#conditional exporting mm.errors
diff -q $D_MIGDB/plugins/migdb.mm.errors_1.0.0.jar $D_ECLIPSE/dropins/migdb.mm.errors_1.0.0.jar 
if [ $? -ne 0 ]
  then 
	echo exporting mm errors
	cp $D_ECLIPSE/dropins/migdb.mm.errors_1.0.0.jar $D_MIGDB/plugins 
  else
     echo mm errors is actual
fi

