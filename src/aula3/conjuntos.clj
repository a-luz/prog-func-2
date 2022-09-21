(ns aula3.conjuntos
  (:require [clojure.set :as cset]))


(def vetor [:a :b :c :d])
(def conjunto #{:a :b :c :d})

;; contains?
(contains? (set vetor) :c)

(contains? conjunto :c)

(= (set ["a" "c" "b"]) (set ["a" "b" "c" "c"]))
;; => true

;; adiciona elemento
(conj conjunto :e)

;; remove elemento
(disj conjunto :c)

;; diferenca

;; A - B != B - A
(cset/difference #{1 2 3} #{1 2 4 5 6})
(cset/difference  #{1 2 4 5 6} #{1 2 3})

;; uniao
(cset/union #{1 2 3} #{4 5 6} #{4 5 7 8})


;; interseccao
(cset/intersection #{1 2 3} #{2 3 4 5})


;; map-invert
(cset/map-invert {:a teste})
