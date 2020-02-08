(ns playground.core-test
  (:require [clojure.test :refer :all]
            [playground.core :refer :all]))

(deftest a-test-for-vector
  (testing "sum of numbers from a vector."
    (is (= (sum [1 2 3]) 6))))

(deftest a-test-for-list
  (testing "sum of numbers from a vector."
    (is (= (sum '(1 2 3)) 6))))

(deftest a-test-for-parsing_numbers
  (testing "parse numbers from a string"
    (is (= (parse-numbers "1 2 3 4 5 10 300\n") ["1" "2" "3" "4" "5" "10" "300"]))))
