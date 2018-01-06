(ns ex03)

(defn next-prime
    ([coll] (next-prime coll (inc(peek coll))))
    ([coll n] (if (some (comp zero? (partial rem n)) coll)
                (next-prime coll (inc n))
                (conj coll n))))

(defn prime-numbers []
    (iterate next-prime [2]))

(defn -main []
    ; (println (take 5 (iterate fib '(2 1)))))
    (println (take 10 (prime-numbers))))
    ; (println (take 5 (iterate next-prime-coll '(2)))))
    ; (println (next-prime (lazy-seq [2 3]) 4)))