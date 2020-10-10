(ns project-euler.ex01)

(->> (range 1000)
     (filter #(or (zero? (rem % 3))
                  (zero? (rem % 5))))
     (reduce +)
     (println))
