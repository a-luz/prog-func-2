(ns aula5.sequencias)

(seq? (list 1 2 3 4))
(seq? {:a 1 :b 2})
(seq? [1 2 3 4])
(seq? #{1 2 3 4 5})
(seq? "string")

;; sequencias lazy

;; map, filter e remove retornam sequencias lazy
(defn aumenta-preco-loja
  [valor-porcentagem loja]

  (map (fn [produto]
         (update produto :price (fn [valor] (+ valor (* valor-porcentagem valor)))))
       loja))