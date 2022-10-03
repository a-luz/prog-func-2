(ns aula4.exercicio
  (:require [aula4.data :as data]))


;; retornar o vetor de clientes com a chave `:full-name` adicionada nos mapas de clientes. (full-name deve ser a concatenacao do `:first-name` com o `:last-name`).

(defn adiciona-fullname
  [clientes]
  (map (fn [cliente]
         (let [fname (:first-name cliente)
               lname (:last-name cliente)]
           (assoc cliente :full-name (str fname " " lname))))
       clientes))


;; retornar clientes que tem `:age` maior que 35. Usar tanto `filter` quanto `remove`.

;; substitui o 35 hard-coded por um parametro idade na funcao.

(defn filtra-clientes
  [clientes idade]
  (filter (fn [cliente] (> (:age cliente) idade)) clientes))

(defn remove-clientes
  [clientes idade]
  (remove (fn [cliente] (<= (:age cliente) idade)) clientes))


;; retornar um mapa, tendo a chave do item como o id do produto e o valor sendo a quantidade total comprada desse item.
(defn adiciona-quantidade
  [mapa item]
  (let [{:keys [item-id amount]} item
        current-amount (mapa item-id 0)]
    (assoc mapa item-id (+ amount current-amount))))

(defn total-quantidades
  [compras]
  (reduce adiciona-quantidade {} compras))


;; retornar um mapa de compras, onde a chave deve ser o id do cliente e o valor deve ser um vetor que contendo todas as compras do cliente.

(defn adiciona-compra-mapa
  "Adiciona compra no mapa de compras de um :client-id (chave) se ele existe no mapa,
  caso ele nao exista, adiciona o client-id como chave e a compra como valor"
  [mapa compra]
  (let [client-id (:client-id compra)
        compra-sem-client-id (dissoc compra :client-id)]
    (assoc mapa client-id (conj (get mapa client-id []) compra-sem-client-id))))


(defn criar-mapa-compras
  [compras]
  (reduce adiciona-compra-mapa {} compras))


;; retornar o vetor de clientes com a chave `:purchases`. O valor dessa chave sera um vetor contendo mapas com `:item-id` e `:amount`.

(defn adiciona-compras-vetor-clientes
  [clientes compras]
  (let [mapa-compras (criar-mapa-compras compras)]
    (map (fn [cliente]
           (assoc cliente :compras (get mapa-compras (:id cliente))))
         clientes)))
