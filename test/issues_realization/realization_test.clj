(ns realization.test
  (:require [clojure.test :refer :all]))
(load-file "realization.clj")

(deftest array-fetch
  (is (= \b (realization/fetch [\a \b \c] 1 \d))))

; (deftest array-interleave-test
;   (is (= [1 2 3 4 5 6] (realization/interleave [1 3 5] [2 4 6])))) 
