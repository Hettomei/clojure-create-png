set -e

clj -i test_png.clj -m generate.video
ffmpeg -y -loop 1 -t 15 -framerate 20 -i "pictures/test%02d.png"  video.mp4
