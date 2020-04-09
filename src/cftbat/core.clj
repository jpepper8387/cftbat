(ns cftbat.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn add100
  [num]
  (+ num 100))

(defn dec-maker
  [dec-by]
  #(- % dec-by))

(defn mapset
  [f coll]
  (set (map f coll)))
