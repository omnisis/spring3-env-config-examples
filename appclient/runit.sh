#!/bin/sh
(cd target && tar zxvf appclient-1.0-SNAPSHOT-configfiles.tar.gz)
java -Dapp.name='overriden' -cp target/conf:target/appclient-1.0-SNAPSHOT-shaded.jar com.nextinstruction.AppDriver
