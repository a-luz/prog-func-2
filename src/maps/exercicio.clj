(ns maps.exercicio
 (:require [ maps.data :refer :all]) )


;; dado o mapa no namespace data.clj, escrever funcoes que:
;; altera a idade do cliente
;; remove o endereco do cliente
;; atualiza o valor de um item de compra
;; adicionar o vetor de compras no mapa do cliente
;; adiciona um novo item de compra
;; retorna o nome do cliente


(defn altera-idade
  [cliente idade]
  (assoc cliente :idade idade))


(defn remove-endereco
  [cliente]
  (dissoc cliente :endereco ))


(defn atualiza-compra
  [compra novo-valor ]
  (assoc compra :valor novo-valor ))

(defn adciona-vetor
  [cliente compras ]
  (assoc cliente :compras compras ))


(defn adcionaitem-compra
  [item novo-item novo-valor]
  (conj item :item novo-item  :valor novo-valor  ))


(defn retorna-nome
  [cliente]
  (:nome cliente))

(defn adcionaitem-compra-cliente
  [item novo-item novo-valor]
  (conj item :item novo-item  :valor novo-valor  ))