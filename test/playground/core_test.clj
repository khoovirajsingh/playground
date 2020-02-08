(ns playground.core-test
  (:require [clojure.test :refer :all]
            [playground.core :refer :all]))

(deftest a-test
  (testing "sum of numbers from a vector."
    (is (= (sum [1 2 3]) 6))))
