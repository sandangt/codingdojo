# Build docker image

```bash
docker build -t my-c-home .
```

# Run docker container from image

```bash
docker run -it --rm -v ./src:/usr/app/src -v ./Makefile:/usr/app/Makefile my-c-home
```
