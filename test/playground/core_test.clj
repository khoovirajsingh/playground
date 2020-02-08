(ns playground.core-test
  (:require [clojure.test :refer :all]
            [playground.core :refer :all]))

(deftest a-test-for-vector
  (testing "sum of numbers from a vector."
    (is (= 6 (sum [1 2 3])))))

(deftest a-test-for-splitting-numbers
  (testing "split numbers from a string"
    (is (= ["1" "2" "3" "4" "5" "10" "300"] (split-words "1 2 3 4 5 10 300\n")))))

(deftest a-test-for-converting-string-to-long
  (testing "convert a string number to a long."
    (is (= 100 (str->long "100")))))

(deftest a-test-for-parsing-strings-to-numbers
  (testing "parse vector of numbers from a vector of strings"
    (is (= [1 2 3 4 5 10 300] (map-to-numbers ["1" "2" "3" "4" "5" "10" "300"])))))

(deftest sum-test
  (testing "Adding up numbers in collections of different lengths and types."
    (is (= 10 (sum [5 5])))
    (is (= 0 (sum '(10 -5 -3 -1 -1))))
    (is (= 100 (sum #{25 75})))
    (is (= 0 (sum [])))))
