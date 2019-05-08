# Install

Please install clojure, see https://clojure.org/guides/getting_started


# Run

```
./generate_video.sh && xdg-open video.mp4
```

# Run in details

1. Need to generate all the png

```
clj -i test_png.clj -m generate.video
```

2. Create the video

```
ffmpeg -framerate 1 -i "pictures/test%02d.png" video.mp4

# longer video
ffmpeg -loop 1 -t 15 -framerate 20 -i "pictures/test%02d.png"  video.mp4
```
