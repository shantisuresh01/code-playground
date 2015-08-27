#!/bin/sh

mvn compile war:war
# mvn tomcat7:deploy
mvn tomcat7:redeploy
