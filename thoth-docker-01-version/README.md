# thoth-docker-01-version

This is a test to run `java -version` inside a container.

**Dockerfile**

```bash
FROM openjdk:8
CMD ["java", "-version"]
```

**Commands**

```bash
docker image build -t thoth-docker/version:1.0 .
docker container run --rm thoth-docker/version:1.0
```

**Parameters**
```txt
-t    Defines the version of the image
--rm  Remove container when done executing
```