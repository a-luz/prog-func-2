(ns aula3.destructuring
  (:require [aula3.data :as data]))


;; sequencial

(defn desestrutura-let
  [vetor arg]
  (let [[primeiro segundo terceiro] vetor]
    (println vetor)
    (str primeiro segundo terceiro)))


(defn desestrutura
  [[primeiro segundo terceiro :as sequencia] arg]
  (println sequencia)
  (str primeiro segundo terceiro))

(defn desestrutura-convencao
  [[_ _ terceiro :as sequencia] arg]
  (println sequencia)
  (str _))

(defn desestruturacao-composta
  [[{primeiro :first-name}
    {segundo :first-name} :as vetor]]
  vetor)


;; associativa

(defn desestrutura-assoc
  [{:keys [clientes]
    :as mapa
    :or {clientes [{:nome "Maria"}]}}]
  clientes)

(defn correspondencia
  [mapa]
  (:clientes mapa))


(defn destruct
  [{:keys [clientes compras] :as mapa-completo}]
  clientes)

;;(take 1 (for [[{{d :dentro} :fora}] [[{:fora {:dentro 1}}]]]
;;          d))
;;(type (for [{{d :dentro} :fora}] [[{:fora {:dentro 1}}]]]
;;        d))