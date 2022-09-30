(ns aula8.exercicio)

;; 1- Criar um temporizador que exibe a hora
;; durante uma quantidade determinada de tempo.
;; Possibilitar que uma vez iniciado ele seja interrompido a qualquer momento via repl
;; Segue algumas funcoes auxiliares:

(defn minutos->milisegundos
  [minutos]
  (* minutos 60 1000))

;(minutos->milisegundos 15)=> 900000

(defn hora-agora []
  (java.util.Date.))

;(hora-agora)=> #inst"2022-09-30T10:06:29.477-00:00"

(defn pausa [mls]
  (Thread/sleep mls))

;(pausa 1000)
;"Elapsed time: 1005.258208 msecs"
;=> nil

(defn temporizador [minutos]
  ;;;
  )


;; 2- Criar uma funcao que recebe uma mensagem-prometida,
;; entao imprime repetidamente um contador de segundos
;; até que uma mensagem seja entregue via uma promise, deve imprimir
;; a mensagem e o valor acumulado do contador

(defn imprime-msg-prometida
  [msg-prometida]
  (future
    ;;;
    ))

(def mensagem-prometida (promise))

(imprime-msg-prometida mensagem-prometida)

(deliver mensagem-prometida "Oi!")
