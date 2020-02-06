(ns playground.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(str "REPL" "is" "cool")

(str "Tim \"tpope\" Pope")

(println "Tim \"tpope\" Pope")

(prn "Tim \"tpope\" Pope")

(+ 10 10 5)

(+ 3)

(+ 10 5.5)

(- 10 3 2)

(- 3 7)

(* 10 5)

(/ 10 5)

(/ 1 3)

(+ 1 (/ 1 3))

(type 3)

(nil? nil)

(true? (> 1 0))

'(1 2 3 "hello")

[1 2 3 "bye"]

{:name "Venkat" :age 51 :job "Developer"}

{3 "is a number" "person" "khoovi"}

(coll? #{"apple" "orange"})

