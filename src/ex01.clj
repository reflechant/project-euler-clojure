(ns ex01)

(defn -main []
    (println (reduce + (filter
                        #(or (zero? (rem % 3))
                             (zero? (rem % 5)))
                        (range 1000)))))
