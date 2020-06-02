# thoth-docker-02-main

This is a test to run a custom Java application with a simple "hello world" 
`main(String...args)` method.

```bash
docker image build -t thoth-docker/main:1.0 .
docker container run -it --rm thoth-docker/main:1.0
```
