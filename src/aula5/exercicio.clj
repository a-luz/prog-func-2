(ns aula5.exercicio
  (:require [aula4.data :as data]))


;; Utilizar loop/recur para resolver os exercicios


;; retornar o vetor de clientes a chave `:full-name` adicionada nos mapas de clientes. (full-name deve ser a concatenacao do `:first-name` com o `:last-name`).

(defn cria-fullname
  [cliente]
  (let [fname (:first-name cliente)
        lname (:last-name cliente)]
    (assoc cliente :full-name (str fname " " lname))))

(defn adiciona-fullname
  [clientes]
  (loop [clts clientes
         acc []]
    (if (seq clts)
      (recur (rest clts) (conj acc (cria-fullname (first clts))))
      acc)))


;; retornar um mapa de compras, onde a chave deve ser o id do cliente e o valor deve ser um vetor que contendo todas as compras do cliente.

(defn adiciona-quantidade
  "Atualiza quantidade de compras no mapa de quantidades"
  [mapa item]
  (let [{:keys [item-id amount]} item
        current-amount (mapa item-id 0)]
    (assoc mapa item-id (+ amount current-amount))))

(defn total-quantidades
  [compras]
  (loop [c compras
         acc {}]
    (if (seq c)
      (recur (rest c) (adiciona-quantidade acc (first c)))
      acc)))


;; retornar o vetor de clientes com a chave `:purchases`. O valor dessa chave sera um vetor contendo mapas com `:item-id` e `:amount`.
(defn adiciona-compra-mapa
  "Adiciona compra no mapa de compras de um :client-id (chave) se ele existe no mapa,
  caso ele nao exista, adiciona o client-id como chave e a compra como valor"
  [mapa compra]
  (let [client-id (:client-id compra)
        compra-sem-client-id (dissoc compra :client-id)]
    (assoc mapa client-id (conj (get mapa client-id []) compra-sem-client-id))))

(defn criar-mapa-compras
  [compras]
  (loop [c compras
         acc {}]
    (if (empty? c)
      acc
      (recur (rest c) (adiciona-compra-mapa acc (first c))))))

(defn adiciona-compras-cliente
  [cliente compras]
  (assoc cliente :compras (get compras (:id cliente))))

(defn adiciona-compras-vetor-clientes
  [clientes compras]
  (let [mapa-compras (criar-mapa-compras compras)]
    (loop [c clientes
           acc []]
      (if (empty? c)
        acc
        (recur (rest c)
               (conj acc (adiciona-compras-cliente (first c) mapa-compras)))))))



;; escrever uma funcao que tras a frequencia de cada caracter em uma string.


;; com loop/recur
(defn adiciona-elemento-mapa
  [mapa elemento]
  (assoc mapa elemento (inc (get mapa elemento 0))))

(defn frequencia-elementos
  [sequencia]
  (loop [sq sequencia
         acc {}]
    (if (seq sq)
      (recur (rest sq) (adiciona-elemento-mapa acc (first sq)))
      acc)))

;; com reduce

(defn frequencia-elementos-reduce
  [sequencia]
  (reduce (fn [acc elemento]
            (assoc acc elemento (inc (get acc elemento 0))))
          {}
          sequencia))

;; usando funcao `frequencies`. É mais eficiente que as implementacoes aqui.
(defn frequencia-elementos-pronta
  [sequencia]
  (frequencies sequencia))
