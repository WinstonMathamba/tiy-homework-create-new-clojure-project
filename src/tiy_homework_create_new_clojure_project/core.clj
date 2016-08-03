(ns tiy-homework-create-new-clojure-project.core)
;; this is the project name
(defn -main []
  ;; I defined the main directly above
  ;; now i'll assign some values to variables

  (def firstName 'Winston')
  (def lastName 'Mathamba')
  (def address "Foxwood Dr")
  (def x (+ 45 7))
  (def y (* 8 2))
  (def hairColor 'Brown')
  (def shoeColor 'Black')
  (def favoriteSport 'Football')
  (def carModel 'Infinity')
  (def dogName 'Luna')


  ;; Now i'll set instructions to output
  (println firstName)
  (println lastName)
  (println address)
  (println x)
  (println y)
  (println hairColor)
  (println shoeColor)
  (println favoriteSport)
  (println carModel)
  (println dogName)

  )

(-main)