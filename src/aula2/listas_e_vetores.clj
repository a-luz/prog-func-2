(ns aula2.listas-e-vetores
  (:require [aula2.data :as data]))

(def novo-cliente
  {:first-name "Arthur"
   :last-name "Lima"
   :age 20
   :last-year-revenue 45000
   :location "PE"})


;; adicionando elementos em vetores e listas

(cons novo-cliente data/clientes-lista)
(cons novo-cliente data/clientes-vetor)


(conj data/clientes-lista novo-cliente)
(conj data/clientes-vetor novo-cliente)

;; acessando elementos

;; LISTAS:
(peek data/clientes-lista);; primeiro elemento

(pop data/clientes-lista) ;; remove o primeiro elemento


;; VETORES

(peek data/clientes-vetor);; ultimo elemento

(pop data/clientes-vetor) ;; remove o ultimo elemento

;; nth
(nth [1 2 3 4] 3)

;; get


;; retornam o primeiro elemento
(first data/clientes-vetor)
(first data/clientes-list)


;; transformando lista em vetor e vice e versa

;; lista em vetor
(into [] data/clientes-lista)

;; vetor em lista
(into '() data/clientes-vetor)

;; cria mapa a partir de duas sequencias
(zipmap [:a :b :c] [1 2 3])


;; concatenando vetores e listas

;; concat retorna uma sequencia lazy
(concat [1 2 3] [4 5 6])
