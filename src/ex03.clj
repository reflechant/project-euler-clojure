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

; (defn prime-numbers
;     ([] (prime-numbers [2] 3))
;     ([vec n]
;      (if (some (comp zero? (partial rem n)) vec) ; if n is divisible by any x in vec
;          (lazy-seq (conj vec (prime-numbers vec (inc n)))) ; not a prime number, proceed to n+1
;          (lazy-seq (conj vec n (prime-numbers vec (inc n))))))) ; else - found new prime number, add to vec, proceed to n+1

; (defn prime-numbers
;     ([] (prime-numbers [2]))
;     ([vec] (lazy-seq (conj
;                             vec
;                             (next-prime vec (inc (peek vec)))))))

; (defn prime-numbers
;     ([] (prime-numbers '(2)))
;     ([coll] (cons (next-prime coll (inc (first coll)))
;                   coll)))

; (defn prime-numbers
;     ([] (prime-numbers 2))
;     ([n] (lazy-seq (cons (next-prime  (inc (peek vec)))
;                          (prime-numbers)))))
    ; ([n] (if (some (comp zero? (partial rem (inc n)) (prime-numbers)))
    ;          (lazy-seq (cons n (prime-numbers (+ n 2))))
    ;          (lazy-seq (cons n (prime-numbers (inc n)))))))
                  
; (defn fib[coll]
;     (cons   (+  (first coll)
;                 (second coll))
;             coll))
