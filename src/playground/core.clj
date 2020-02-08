(ns playground.core
  (:gen-class))

(defn sum
  "Sums a vector of numbers"
  [a-seq]
  (apply + a-seq))

(slurp "numbers.txt")

(defn split-words
  "Turns a string of numbers into a collection of numbers"
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
  (let [file-name (first args)
        text (slurp file-name)
        str-coll (split-words text)
        long-coll (map-to-numbers str-coll)
        total (sum long-coll)]
    (println total)))
