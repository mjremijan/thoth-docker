
docker image build -t thoth-docker/version:1.0 .

docker container run -it --rm thoth-docker/version:1.0
