#!/bin/bash
cd `dirname $0`
cd ..
APP_DIR=`pwd`
PIDS=`ps -ef | grep java | grep "$APP_DIR" |awk '{print $2}'`
if [  -z "$PIDS"  ]; then
    echo "ERROR: The $APP_DIR does not started!"
else
kill -9 $PIDS
fi