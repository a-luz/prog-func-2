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





;; associativa
