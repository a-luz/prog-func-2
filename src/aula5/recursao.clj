(ns aula5.recursao
  (:require [aula5.data :as data]))

(defn fatorial
  [n acumulador]
  (println 123)
  (if (= n 1)
    acumulador
    (recur (dec n) (*' acumulador n))))

(defn fatorial-rec
  [n]
  (println 123)
  (loop [numero n
         acc 1]
    (if (= numero 1)
      acc
      (recur (dec numero) (*' acc numero)))))

;;caso de parada do reduce e o fim da colecao.

(defn media-idade-clientes
  [clientes]
  (loop [clts clientes
         acc 0]
    (if (empty? clts)
      (/ acc (count clientes))
      (recur (rest clts) (+ acc (:age (first clts)))))))


;; exemplo de recursao que poderia ser feita com map

(defn incrementa-por-2
  [vetor-numeros]

  (loop [vetor-nums vetor-numeros
         acc []]
    (if (empty? vetor-nums)
      acc
      (recur (rest vetor-nums) (conj acc (+ 2 (first vetor-nums)))))))