(ns aula2.exercicio
  (:require [aula2.data :as data]))


;; criar um vetor com nome de clientes que conterá todos os clientes de ambas as colecões do namespace `aula2.data`.

;; adicionar um cliente no vetor `clientes`.

(defn adiciona-cliente
  [clientes novo-cliente]
  (conj clientes novo-cliente))

;; retornar o nome do cliente mais novo do vetor `clientes`.

(defn nome-cliente-mais-novo
  [clientes]
  (:first-name (peek clientes)))

;; remover o cliente mais novo do vetor `clientes`.

(defn remove-cliente-mais-novo
  [clientes]
  (pop clientes))

;; retornar o nome do cliente mais antigo do vetor `clientes`.

(defn nome-cliente-mais-antigo
  [clientes]
  (:first-name (first clientes)))

;; remover o cliente mais antigo do vetor `clientes`.

(defn remove-cliente-mais-novo
  [clientes]
  (rest clientes))

;; retornar o cliente na posicão `p` do vetor clientes.

(defn retorna-cliente-por-indice
  [clientes idx]
  (get clientes idx))


;; remover do vetor `clientes` os clientes com o `last-year-revenue` menor que 50000 (dica: usar `remove` ou `filter`, procurar na documentacão);

(defn filtra-clientes
  [clientes]
  (filter #(>= (:last-year-revenue %) 50000) clientes))


(defn remove-clientes
  [clientes]
  (remove #(< (:last-year-revenue %) 50000) clientes))
