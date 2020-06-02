# thoth-docker-01-version

This is simply a test running `java -version`. No custom code is being run yet.

```bash
docker image build -t thoth-docker/version:1.0 .
docker container run -it --rm thoth-docker/version:1.0
```