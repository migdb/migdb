#!/bin/sh

#check existence of migdb configuration file.
if [ ! -f ~/migdb_config.cfg ] 
  then 
	echo Your home folder doesn\'t contain configuration file migdb_config.cfg. Check https://github.com/migdb/migdb/wiki/scripts for help
	exit 1
fi

#get working branch
branch=`git branch | grep \* | cut -d' ' -f2`
 
echo current branch: $branch

#can be modified only for tracked repositories + branches - eg visible by git remote -v 
#log changes of configuration file in origin/branch
script_dir=`dirname $0`
i=`git diff origin/$branch..$branch $script_dir/migdb_config.cfg | wc -l | cut -d' ' -f1`

if [ $i -ne 0 ]
   then
	echo NOTE: migdb_configuration.cfg has changed in branch $branch - update your local settings in it
fi
