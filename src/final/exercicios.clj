(ns final.exercicios
  (:require [final.data :as data]))


;; Criar funcao que, dado um vetor de clientes, deve atualizar o endereco de um cliente e retorna o vetor de clientes.
;; A funcao deve atualizar o endereco apenas com os valores presentes no mapa do novo endereco.
;; Para saber a posicao do cliente no vetor pode usar (.indexOf <vetor> <elemento>).

(defn atualiza-endereco
  [clientes id-cliente novo-endereco]
  )

;; Criar funcao que recebe o vetor de compras e retorna um mapa de compras, onde a chave deve ser o id do cliente e o valor deve ser um vetor que contendo todas as compras do cliente.
(defn mapa-quantidades
  [compras]
  )

;; Criar funcao que filtra um vetor de clientes pela chave `:estado` do endereco.
(defn clientes-por-estado
  [clientes estado])

;; Criar funcao para retornar um mapa, tendo a chave do item como o id do produto e o valor sendo a quantidade total comprada desse item.
(defn mapa-quantidades
  [compras])


;; Dado 2 vetores de clientes (clientes e clientes-2), retornar clientes que estão presentes em ambos os vetores.
(defn clientes-duplicados
  [v-cliente v-cliente-2]
  )
