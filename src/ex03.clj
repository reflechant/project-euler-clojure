(ns ex03)

(defn next-prime
  ([xs] (next-prime xs (inc (last xs))))
  ([xs x]
   (if (some #(zero? (rem x %)) xs)
     (next-prime xs (inc x))
     x)))

(defn primes
  ([] (primes [2]))
  ([xs]
   (lazy-seq (conj xs (next-prime xs)))))

(println (take 10 (primes)))