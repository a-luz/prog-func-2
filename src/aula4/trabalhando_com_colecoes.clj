(ns aula4.trabalhando-com-colecoes
  (:require [aula4.data :as data]))


;; filter e remove

(defn filtrar-por-idade
  [idade f clientes]
  (filter (fn [cliente]
            (f (:age cliente) idade))
          clientes))

(defn remove-por-idade
  [idade f clientes]
  (remove (fn [cliente]
            (f (:age cliente) idade))
          clientes))

;; map
;; Aumentar o preco de todos os items da loja em X%

(defn aumenta-preco-loja
  [valor-porcentagem loja]
  (map (fn [produto]
         (update produto :price (fn [valor] (+ valor (* valor-porcentagem valor)))))
       loja))

;; https://clojuredocs.org/clojure.core/zipmap

;; [1 2 3 4 5]
;; inc
;; (2 3 4 5 6)


;; reduce

(defn total-itens-vendidos
  [compras]
  (reduce (fn [acc item]
            (+ acc (:amount item)))
          0
          compras))

(defn somar-colecao
  [coll]
  (reduce (fn [acc item]
            (+ acc item))
          coll))


(defn media-idade-clientes
  [clientes]
  (/ (reduce (fn [acc cliente]
            (+ acc (:age cliente)))
          0
          clientes)
     (count clientes)))



;; apply

(apply + [1 2 3 4 5])
(apply str ["foo" " teste" " aaaa"])