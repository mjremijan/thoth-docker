FROM openjdk:8

# The WORKDIR instruction sets the working directory for any
# RUN, CMD, ENTRYPOINT, COPY and ADD instructions that follow
# it in the Dockerfile. If the WORKDIR doesn’t exist, it will 
# be created even if it’s not used in any subsequent Dockerfile
# instruction. The WORKDIR instruction can be used multiple 
# times in a Dockerfile. If a relative path is provided, it 
# will be relative to the path of the previous WORKDIR instruction.
WORKDIR /thoth-docker/env

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

# The ENV instruction sets the environment variable <key> to the 
# value <value>. This value will be in the environment for all 
# subsequent instructions in the build stage and can be replaced 
# inline in many as well.
#
# The environment variables set using ENV will persist when a 
# container is run from the resulting image. You can view the 
# values using docker inspect, and change them using 
# docker run --env <key>=<value>.
#
# ENV <key> <value>
# ENV <key>=<value> ...
ENV thoth_name=Rita
ENV thoth_age=55

# cmd
CMD ["java", "-cp", "classes", "org.thoth.docker.env.Main"]


