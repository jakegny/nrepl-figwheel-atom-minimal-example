(ns hello-world.core
  (:require react-dom))

(enable-console-print!)

(println "Hello world")

(.render js/ReactDOM
         (.createElement js/React "h2" nil "Hello, React how about now!")
         (.getElementById js/document "app"))

;; Must have reload
(defn reload []
  (js/console.log "Reload"))
