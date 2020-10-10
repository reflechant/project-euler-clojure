(ns project-euler.ex02)

(defn fibonacci
  ([] (fibonacci 1 2))
  ([x y] (lazy-seq (cons x (fibonacci y (+ x y))))))

(->> (fibonacci)
     (take-while #(<= % 4000000))
     (filter even?)
     (reduce +)
     (println))
