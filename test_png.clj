(ns generate.video
  (:import (java.io File)
           (java.awt Color)
           (java.awt.image BufferedImage)
           (javax.imageio ImageIO)))

(def bi (BufferedImage. 500 500 BufferedImage/TYPE_INT_ARGB))
(def g (.createGraphics bi))

(defn generate-picture [number]
  (print ". ")
  (.drawLine g 0 0 (* 5 number) (* 10 number))
  (.drawLine g 500 0 (* 5 number) (* 10 number))
  (ImageIO/write bi "png"  (File. (str "pictures/" "test" (format "%02d" number) ".png")))
  )


(defn -main [& args]
  (dotimes [n 50] (generate-picture n))
  (println "")
  (println "please run :")
  (println "xdg-open pictures")
  )
