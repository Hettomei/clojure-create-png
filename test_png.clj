(ns generate.video
  (:import (java.io File)
           (java.awt Color)
           (java.awt.image BufferedImage)
           (javax.imageio ImageIO)))

(def bi (BufferedImage. 500 500 BufferedImage/TYPE_INT_ARGB))
(def g (.createGraphics bi))

(defn run []
  (.drawLine g 0 0 500 500)
  (.drawLine g 0 500 500 0)
  (.drawLine g 125 0 125 500)
  (ImageIO/write bi "png"  (File. "pictures/test.png"))
  )


(defn -main [& args]
  (run)
  (println "please run :")
  (println "xdg-open pictures/test.png")
  )
