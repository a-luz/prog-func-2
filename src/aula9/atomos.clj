(ns aula9.atomos)



(def arthur (atom {}))

(def cliente (atom {}))

(def cliente-antes (atom {}))


(defn cabelinho-na-regua?
  []
  (let [na-regua? (:cabelinho @arthur)
        na-regua-mesmo? (swap! arthur
                               (fn [arthur-atual]
                                 (update arthur-atual :cabelinho not)))]
    (println "na régua? " na-regua?)
    (println "na-regua-mesmo? " (:cabelinho
                                 na-regua-mesmo?))

    (if na-regua?
      "cabelinho na régua"
      "vai cortar o cabelo, rapá!")))


(defn adiciona-procedimento
  [cliente procedimento valor]
  (let [estado-anterior-cliente cliente]
   (swap! cliente-antes (fn [_] estado-anterior-cliente)) 
   (println "procedimentos do cliente até agora " estado-anterior-cliente)
  (-> cliente
      (merge procedimento)
      (update :valor-total #(+ (or % 0) valor)))))