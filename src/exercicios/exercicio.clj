(ns exercicios.exercicio
  (:require [exercicios.data :as data]))


(defn filtrar-por-id
  [clientes id-cliente]
  (loop [clts clientes]
    (if (= id-cliente (:id (first clts)))
      (first clts)
      (recur (rest clts)))))

(defn atualizar-endereco
  "Deve atualizar o endereco de um cliente e retorna o vetor de clientes.
   A funcao deve atualizar o endereco apenas com os valores presentes no mapa do novo endereco."
  [clientes id-cliente novo-endereco]
  (let [idx-cliente (.indexOf clientes (filtrar-por-id clientes id-cliente))]
    (update-in clientes [idx-cliente :endereco] merge novo-endereco)))


(defn- creditar-conta
  "adiciona valor ao saldo da conta"
  [conta valor]
  (update conta :saldo #(+ % valor)))


(defn- debitar-conta
  "remove valor do saldo da conta"
  [conta valor]
  (update conta :saldo #(- % valor)))


(defn atualizar-conta
  "funcao que atualiza conta a partir de uma funcao f. Deve retornar o mapa de contas"
  [contas f id-conta valor]
  (f (get contas id-conta) valor))


