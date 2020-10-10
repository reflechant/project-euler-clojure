(ns project-euler.ex04
  (:require [clojure.string :as string]))

(defn products [lower upper]
  (let [nums (range lower upper)]
    (for [i     nums
          j     nums
          :when (<= i j)]
      (* i j))))

(defn palindrome? [n]
  (let [s (str n)]
    (= s (string/reverse s))))

(->> (products 100 1000)
     (filter palindrome?)
     (reduce max)
     (println))
