## About Project
This is not a Project. I want to show how to use log4j `SocketAppender`.

## How To Use
### First, Run `SimpleSocketServer`
`log4j-server.properties` is log4j config for `SimpleSocketServer`. You should run that file. 

Like this,
```console
java -classpath ${project.base.dir}/libs/log4j-1.2.11.jar org.apache.log4j.net.SimpleSocketServer 9999 ${project.base.dir}/resource/log4j-server.properties
```
### Second, Run `Log4jSocketAppenderTest.java`

Check `${project.base.dir}/libs/log4j-1.2.11.jar` in build path. If not, add jar to your build path and run `Log4jSocketAppenderTest.java`.

## Related
[log4j: SocketAppender 사용하기](https://velog.io/@_choongyul/log4j-SocketAppender-%EC%82%AC%EC%9A%A9%ED%95%98%EA%B8%B0)
