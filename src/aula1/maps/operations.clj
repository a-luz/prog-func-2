(ns maps.operations
  (:require [maps.data :refer [cliente]]))

;; retorna campo
(get cliente :nome)

(get-in cliente [:endereco :rua])

;; adicionar

(defn adiciona-sobrenome
  [cliente sobrenome]
  (assoc cliente :sobrenome sobrenome))




(defn adiciona-cidade
  [cliente cidade]
  (assoc-in cliente [:endereco :cidade] cidade))

;; remover
(defn remove-chave
  [mapa chave]
  (dissoc mapa chave))


;; atualizar
