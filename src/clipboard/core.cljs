(ns clipboard.core
  (:require ["clipboard-event" :as cl]
            ["copy-paste" :as cp]))

(defn main []
  (println cl)
  
  (.startListening cl)
  
  (.on cl "change"
       (fn []
         (println (.paste cp)))))
  

