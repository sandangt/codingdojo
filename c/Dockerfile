# Use an official Alpine Linux as a base image
FROM alpine:3.20

# Install build tools
RUN apk update && \
    apk add --no-cache \
    build-base \
    cmake \
    gdb \
    valgrind \
    linux-headers \
    # Basic C/C++ libraries
    musl-dev \
    libc-dev \
    gcc \
    g++ \
    # Advanced and common libraries
    boost-dev \
    openssl-dev \
    zlib-dev \
    bzip2-dev \
    xz-dev \
    libxml2-dev \
    libxslt-dev \
    curl-dev \
    fftw-dev \
    gmp-dev \
    mpfr-dev \
    gsl-dev \
    eigen-dev \
    libx11-dev \
    libxft-dev \
    libxext-dev

# Create a directory for your project
RUN mkdir -p /usr/app/

# Set the working directory
WORKDIR /usr/app/

# Set permission for all direcotry
RUN chmod -R 777 /usr/app

# Copy your source code into the container
# (Assuming your source code is in the same directory as the Dockerfile)
# COPY ./src /usr/mysrc

# Command to run when the container starts
# (Optional, you can override this with docker run command)
CMD ["sh"]

