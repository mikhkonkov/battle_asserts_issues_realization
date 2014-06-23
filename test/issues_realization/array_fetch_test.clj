(ns issues-realization.array-fetch-test
  (:require [clojure.test :refer :all]
            [issues-realization.array-fetch :refer :all]))

(deftest array_fetch_1
  (is (= \b (fetch [\a \b \c] 1 \d))))

(deftest array_fetch_5
  (is (= \d (fetch [\a \b \c] 5 \d))))

(deftest array_fetch_negative_1
  (is (= \c (fetch [\a \b \c] -1 \d))))

(deftest array_fetch_negative_5
  (is (= \d (fetch [\a \b \c] -5 \d))))