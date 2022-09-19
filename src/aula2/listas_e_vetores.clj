(ns aula2.listas-e-vetores
  (:require [aula2.data :as data]))

(def novo-cliente
  {:first-name "Arthur"
   :last-name "Lima"
   :age 20
   :last-month-revenue 5000
   :location "PE"})


;; adicionando elementos em vetores e listas

(cons novo-cliente data/clientes-lista)
(cons novo-cliente data/clientes-vetor)


(conj data/clientes-lista novo-cliente)
(conj data/clientes-vetor novo-cliente)


;; acessando elementos

;; transformando lista em vetor e vice e versa

;; concatenando vetores e listas

