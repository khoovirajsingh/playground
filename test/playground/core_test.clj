(ns playground.core-test
  (:require [clojure.test :refer :all]
            [playground.core :refer :all]))

(deftest a-test-for-vector
  (testing "sum of numbers from a vector."
    (is (= (sum [1 2 3]) 6))))

(deftest a-test-for-list
  (testing "sum of numbers from a vector."
    (is (= (sum '(1 2 3)) 6))))

(deftest a-test-for-parsing-numbers
  (testing "parse numbers from a string"
    (is (= (parse-numbers "1 2 3 4 5 10 300\n") ["1" "2" "3" "4" "5" "10" "300"]))))

(deftest a-test-for-converting-string-to-long
  (testing "convert a string number to a long."
    (is (= (convert-string "100") 100))))

(deftest a-test-for-parsing-strings-to-numbers
  (testing "parse vector of numbers from a vector of strings"
    (is (= (map-to-numbers ["1" "2" "3" "4" "5" "10" "300"]) [1 2 3 4 5 10 300]))))
