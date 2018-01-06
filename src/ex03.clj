(ns ex03)

(defn prime-numbers
    ([] (prime-numbers ([2] 3)))
    ([vec n]
     (if (some (comp zero? (partial rem n)) vec) ; if n is divisible by any x in vec
         (lazy-seq (prime-numbers vec (inc n))) ; not a prime number, proceed to n+1
         (lazy-seq (prime-numbers (conj vec n) (inc n)))))) ; else - found new prime number, add to vec, proceed to n+1

(defn -main []
    (println (take 10 (prime-numbers))))
