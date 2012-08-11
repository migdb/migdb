#!/bin/sh
git pull
ECLIPSE=`which eclipse`
D_ECLIPSE=`dirname $ECLIPSE`
cp plugins/migdb.mm.app_1.0.0.jar $D_ECLIPSE/dropins
cp plugins/migdb.mm.rdb_1.0.0.jar $D_ECLIPSE/dropins
