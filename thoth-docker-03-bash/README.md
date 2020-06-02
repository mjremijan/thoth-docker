# thoth-docker-03-bash

This is a test to run a custom Java application using a `bash` script. 

For this test, docker FROM is configured as:

`FROM openjdk:8`

At this time (see timestamp below), this image is using Ubuntu.

`Linux f88fa31c5429 5.3.0-46-generic #38-Ubuntu SMP Fri Mar 27 17:37:05 UTC 2020 x86_64 GNU/Linux`

With `bash` available, I can try to use a script to start a Java application.

```bash
docker image build -t thoth-docker/bash:1.0 .
docker container run -it --rm thoth-docker/bash:1.0
```
