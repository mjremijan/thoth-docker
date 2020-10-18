# thoth-docker-03-bash

This is a test to run a custom Java application using a `bash` script. 

**Dockerfile**

```bash
# At this time (see timestamp below), this image is using Ubuntu.
# `Linux f88fa31c5429 5.3.0-46-generic #38-Ubuntu SMP Fri Mar 27 17:37:05 UTC 2020 x86_64 GNU/Linux`
# So bash is available in this image.
FROM openjdk:8

# The WORKDIR instruction sets the working directory for any
# RUN, CMD, ENTRYPOINT, COPY and ADD instructions that follow
# it in the Dockerfile. If the WORKDIR doesn’t exist, it will 
# be created even if it’s not used in any subsequent Dockerfile
# instruction. The WORKDIR instruction can be used multiple 
# times in a Dockerfile. If a relative path is provided, it 
# will be relative to the path of the previous WORKDIR instruction.
WORKDIR /thoth-docker/bash

# The COPY instruction copies new files or directories from
# <src> and adds them to the filesystem of the container at 
# the path <dest>. Multiple <src> resources may be specified 
# but the paths of files and directories will be interpreted 
# as relative to the source of the context of the build. Each 
# <src> may contain wildcards and matching will be done using 
# Go’s filepath.Match rules. For example:
#
# The <dest> is an absolute path, or a path relative to WORKDIR,
# into which the source will be copied inside the destination container.
COPY target/classes classes
COPY src/main/bash bin

# Set execute permission on the bash script
WORKDIR /thoth-docker/bash/bin
RUN chmod +x *.sh

# cmd
CMD ./run-bash.sh
```

**Commands**

```bash
docker image build -t thoth-docker/bash:1.0 .
docker container run --rm thoth-docker/bash:1.0
```

**Parameters**
```txt
-t    Defines the version of the image
--rm  Remove container when done executing
```
