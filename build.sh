#!/usr/bin/env bash

# Build the image from the Dockerfile and t(ag) it restDocker:latest
docker image build -t rest-docker:latest . 	

# Run the container with port to localhost:5000 and name rest7
docker run -it -p 5000:8080 --name rest-docker rest-docker:latest
