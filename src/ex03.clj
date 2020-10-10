(ns project-euler.ex03)

(defn largest-factor [x]
  (loop [candidate 2
         factor    1
         x         x]
    (if (= x 1)
      factor
      (if (zero? (rem x candidate))
        (recur candidate candidate (quot x candidate))
        (recur (inc candidate) factor x)))))

(println (largest-factor 600851475143))
