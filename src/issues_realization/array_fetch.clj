(ns issues-realization.array-fetch)

(defn get_value_by_index
  [arr index default_value]
  (if (and (>= index 0) (< index (count arr))) 
     (arr index)
     default_value))

(defn fetch
  [arr index default_value]
  (if (> index 0)
    (get_value_by_index arr index default_value)
    (get_value_by_index arr (+ (count arr) index) default_value)))
