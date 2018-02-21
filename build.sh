#!/bin/bash

# compile source file
javac -d . -classpath ./lib/expressions-1.0.0.jar:./lib/message-flow-1.0.0.jar: ./callout/src/main/java/FormatResponse.java
jar -cvf ./lib/FormatResponse.jar ./com/apigeesample/*

# copy jar file 
cp ./lib/FormatResponse.jar ./apiproxy/resources/java/

# create proxy archive zip file
jar -cvf apiproxy.zip apiproxy