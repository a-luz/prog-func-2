(ns aula6.records)

;; equivalente a interface
(defprotocol Conversa
  (ola [this])
  (tchau [this]))

(defprotocol Print
  (printa [this arg]))

(defrecord Pessoa [firstName lastName]
  Conversa
  (ola [this] (str "Ola " firstName " " lastName "!"))
  (tchau [this] (str "Tchau " firstName " " lastName "!"))

  Print
  (printa [this arg]
    (println "first-name: " firstName "; last-name: " lastName "; outro arg: " arg)))
