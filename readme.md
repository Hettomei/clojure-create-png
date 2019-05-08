# Install

Please install clojure, see https://clojure.org/guides/getting_started


# Run

1. Need to generate all the png

```
clj -i test_png.clj -m generate.video
```

2. Create the video

```
ffmpeg -framerate 1 -i "pictures/test%02d.png" video.avi

# longer video
ffmpeg -loop 1 -t 10 -framerate 10 -i "pictures/test%02d.png" video.avi
```
