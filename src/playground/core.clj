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

(defn str->long
  "Converts a string to a long"
  [x]
  (Long/valueOf x))

(defn map-to-numbers
  "Maps a sequence of strings to numbers"
  [a-seq]
  (map str->long a-seq))

(defn -main
  [& args]
  (let [text (slurp "numbers.txt")
        str-coll (parse-numbers text)
        long-coll (map-to-numbers str-coll)
        total (sum long-coll)]
    (println total)))
