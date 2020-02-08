(ns playground.core
  (:gen-class))

(defn sum
  "Sum a vector of numbers"
  [a-vector]
  (apply + a-vector))
