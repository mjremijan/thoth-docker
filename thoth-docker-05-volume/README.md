# thoth-docker-04-emv

This is a test of Docker volumes.

Information at: <https://dzone.com/articles/tutorial-how-to-use-docker-volumes-to-code-faster?utm_medium=feed&utm_source=feedpress.me&utm_campaign=Feed:%20dzone-microservices>

Set environment values with `ENV`:

```bash
ENV thoth_name=Rita
ENV thoth_age=55
```

Get them in a Java applicaiton:

```java
System.getenv("thoth_name");
```

```bash
docker image build -t thoth-docker/env:1.0 .
docker container run -it --rm thoth-docker/env:1.0
```
