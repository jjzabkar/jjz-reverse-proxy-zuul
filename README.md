# jjz-reverse-proxy-zuul

A reverse proxy using [Spring Cloud Netflix's Zuul](http://cloud.spring.io/spring-cloud-netflix/spring-cloud-netflix.html).

See [src/main/resources/application.yml].

# Usage

Given:

    curl http://localhost:8181/v1/index.html
    <html><h1>This is jjz-hello-1</h1></html>

    curl http://localhost:8282/v2/index.html
    <html><h1>This is jjz-hello-2</h1></html>

This application, running on localhost:8080 will route to those endpoints, allowing for things like semantically versioned API's.

    curl http://localhost:8080/v1/index.html
    <html><h1>This is jjz-hello-1</h1></html>

    curl http://localhost:8080/v1.0/index.html
    <html><h1>This is jjz-hello-1</h1></html>
    
    curl http://localhost:8282/v2/index.html
    <html><h1>This is jjz-hello-2</h1></html>

    curl http://localhost:8282/v2.0/index.html
    <html><h1>This is jjz-hello-2</h1></html>

# Caveats

The reverse-proxy pattern has been around a long time, and tools like [NGinx](https://www.nginx.com/resources/wiki/start/topics/examples/reverseproxycachingexample/) are standard.  As a developer, I prefer NOT to rely on Ops--those guys work crazy hard already--when I can do
something simply, cheaply, and elegantly.  Bonus: Easy to consume Spring beans.

# Reference

http://cloud.spring.io/spring-cloud-netflix/spring-cloud-netflix.html