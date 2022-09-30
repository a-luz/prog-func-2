(ns aula8.promise)

(comment

  (def p (promise))

  (realized? p)

  (deliver p2 "entregado")

  (deref p)

  (def p2 (promise))
  (future (println (str "Promessa recebida, ebaaa!!!: " @p2)))


  (def p2 (promise))
  (future (loop []
            (if-not (realized? p2)
              (do
                (println "Promessa é divida, cade????")
                (Thread/sleep 1000)
                (recur))
              (println (str "Promessa recebida: " @p2)))))

  (deliver p2 "Sorte e saúde!")
  )

(comment
  (def emagrecer (promise))

  @emagrecer

  (def menos-netflix (promise))

  (defn cumpri-minha-promessa?
    [promessa]
    (loop []
      (if (realized?)))

    )
  (future )
  )

(comment
  ;; Deadlock


  )

(comment
  (defn tempo-tarefa []
    (let [inicio (promise)
          fim (promise)]
      (future (deliver inicio (java.util.Date.))
              (Thread/sleep 3000)
              (deliver fim (java.util.Date.))) (println "Tempo inicio: " @inicio)
      (println "Tempo fim" @fim)))
  (tempo-tarefa)
  )