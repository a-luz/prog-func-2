(ns maps.exercicio)


;; dado o mapa no namespace data.clj, escrever funcoes que:
;; altera a idade do cliente

(defn altera-idade
  [cliente idade]
  (assoc cliente :idade idade))

;; remove o endereco do cliente

(defn remove-endereco
  [cliente]
  (dissoc cliente :endereco))

;; atualiza o valor de um item de compra

(defn atualiza-valor
  [compras idx novo-valor]
  (assoc compras idx novo-valor))

;; adicionar o vetor de compras no mapa do cliente

(defn adicionar-compras-cliente
  [cliente compras]
  (assoc cliente :compras compras))

;; adiciona um novo item de compra

(defn nova-compra
  [compras nova-compra]
  (conj compras nova-compra))

;; retorna o nome do cliente

(defn nome-cliente
  [cliente]
  (:nome cliente))
