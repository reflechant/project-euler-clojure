(ns ex01)

(defn divisible-by-3-or-5 [x]
    (or (zero? (rem x 3))
        (zero? (rem x 5))))

(defn -main []
    (println (reduce + (filter
        divisible-by-3-or-5
        (range 1000)))))