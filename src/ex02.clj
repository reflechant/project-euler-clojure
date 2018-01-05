(ns ex02)

(defn fibonacci
    ([] (fibonacci 1 2))
    ([a b] (lazy-seq (cons a (fibonacci b (+ a b))))))

(defn -main []
    (println (reduce + (filter even? (take-while (partial > 4000000) (fibonacci))))))
        
