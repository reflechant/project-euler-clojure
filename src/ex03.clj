(ns ex03)

(def N 600851475143)

(defn next-prime
  ([xs] (next-prime xs (inc (first xs))))
  ([xs x] (if (some #(zero? (rem x %)) xs)
            (recur xs (inc x))
            x)))

(defn primes []
  (map first (iterate
               (fn [xs] (cons (next-prime xs) xs))
               '(2))))

(defn factors [x]
  (filter
    #(zero? (rem x %))
    (take-while (< x) (primes))))

(defn -main []
  (println (factors 10)))
