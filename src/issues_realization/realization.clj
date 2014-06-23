(ns issues-realization.realization)

(defn fetch
  [arr index defaul_value]
  (if 
    (< index (count arr))  
    (arr index) 
    defaul_value))
