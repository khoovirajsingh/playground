(ns playground.core
  (:gen-class))

(defn sum
  "Sums a vector of numbers"
  [a-seq]
  (apply + a-seq))

(slurp "numbers.txt")

(defn parse-numbers
  "Parses a string into a vector of numbers"
  [a-string]
  (clojure.string/split a-string #"\s+"))
