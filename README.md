# Prometheus Demo
A simple Prometheus demo webapp that can be deployed to Weblogic. It contains a couple of REST services that demonstrate how metrics are produced and collected. You will need the prometheus jars on your cotainer classpath eg:

```bash
CLASSPATH="$CLASSPATH:$HOME/.m2/repository/io/prometheus/simpleclient/0.0.26/simpleclient-0.0.26.jar"
CLASSPATH="$CLASSPATH:$HOME/.m2/repository/io/prometheus/simpleclient_common/0.0.26/simpleclient_common-0.0.26.jar"
```
