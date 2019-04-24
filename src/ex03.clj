(ns ex03)

(defn next-prime
  ([xs] (next-prime xs (inc (first xs))))
  ([xs x]
   (if (some #(zero? (rem x %)) xs)
     (recur xs (inc x))
     x)))

(defn primes []
   (map first (iterate (fn [xs] (cons (next-prime xs) xs)) '(2))))

(defn main []
  (println (take 100 (primes))))
