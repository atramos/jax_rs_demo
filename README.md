# jax_rs_demo

quick test/demo using JAX-RS on Eclipse, Maven, Tomcat7

## pre-requisites
`apt-get install tomcat7 maven`

# build
```
git clone https://github.com/atramos/jax_rs_demo.git
cd jax_rs_demo/jax_rs_demo
mvn install
```
# install on Linux
`cp target/*.war /var/lib/tomcat7/webapps/jax_rs_demo.war`

# test
`curl http://localhost:8080/jax_rs_demo/test/hello/world`
