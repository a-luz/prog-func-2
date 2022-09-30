(ns aula8.future)

(comment
  (future (do
            (Thread/sleep 5000)
            (println "Futuro é agora!")))

  (future (Thread/sleep 5000)
          "OI"
          (println "Futuro é agora!"))

  (def futuro-controlado
    (future
      (do
        (Thread/sleep 15000)
        (println "Acabei!")
        "Valor retornado do futuro!")))

  (deref futuro-controlado)
  (realized? futuro-controlado)
  (future-cancel futuro-controlado)
  (future-cancelled? futuro-controlado)
  (future? futuro-controlado)

  )

(comment
  (/ 1 0)
  (def erro-divisao-zero (future (/ 1 0)))
  (deref erro-divisao-zero)
  (def retorno @erro-divisao-zero)
  (try
    @erro-divisao-zero
    (catch Exception e
      (println e)
      ))
  )

(comment
  (def futuro-demorado (future (Thread/sleep 10000)))

  @futuro-demorado

  (+ 1 1)
  )

(comment
  (def calculo-demorado
    (future (reduce
              (fn [acc n]
                (Thread/sleep 100)
                (println n)
                (+ acc n))
              0
              (range 100))))

  (realized? calculo-demorado)
  (future-done? calculo-demorado)
  (future? calculo-demorado)

  (future-cancel calculo-demorado)
  (deref calculo-demorado)


  (time
    (let [numero-demorado' (future (reduce
                                     (fn [acc n]
                                       (Thread/sleep 1)
                                       (+ acc n))
                                     0
                                     (range 100)))]
      (println @numero-demorado')))



  (def enviar-email
    (future (do
              (Thread/sleep 5000)
              (str "Email enviado!" (java.util.Date.)))))

  (deref enviar-email)



  (let [enviar-email
        (future (do
                  (Thread/sleep 5000)
                  (str "Email enviado!" (java.util.Date.))))]
    (println @enviar-email)
    (println "Agora sim"))

  (loop []
    (if (future-done? enviar-email)
      @enviar-email
      (do
        (println "Ainda nada...")
        (recur)))))

(comment

  (defn f-no-args []
    (Thread/sleep 5000)
    "Futuro via call")

  (def f-call (future-call f-no-args))
  @f-call

  (future-done? f-call)
  )

(comment

  (defn busca [loja produto]
    (let [estoque {:loja1 {:produto1 5
                           :produto2 6
                           :produto3 7
                           :produto4 8
                           :produto5 9}
                   :loja2 {:produto1 9
                           :produto2 8
                           :produto3 7
                           :produto4 6
                           :produto5 5}
                   :loja3 {:produto1 0
                           :produto2 2
                           :produto3 4
                           :produto4 8
                           :produto5 12}}]
      (println "Buscando " loja " estoque do " produto)
      (Thread/sleep 2)
      {[loja produto] (get-in estoque [loja produto])}))

  (busca :loja1 :produto5)
  (busca :loja3 :produto1)

  (deref (future (busca :loja1 :produto1)))

  (defn busca-loja [lojas produto]
    (let [futures (doall
                    (for [loja lojas]
                      (future (busca loja produto))))]
      (map deref futures)))

  (= [(busca-loja [:loja1 :loja2 :loja3] :produto1)
   (busca-loja [:loja1 :loja2 :loja3] :produto2)
   (busca-loja [:loja1 :loja2 :loja3] :produto3)
   (busca-loja [:loja1 :loja2 :loja3] :produto4)
   (busca-loja [:loja1 :loja2 :loja3] :produto5)]

  (mapv (partial busca-loja [:loja1 :loja2 :loja3]) [:produto1
                                                    :produto2
                                                    :produto3
                                                    :produto4
                                                    :produto5]))

  )

(comment
  (defn longo [num1 num2]
    (Thread/sleep 2000)
    (* num1 num2))

  (defn sequencial []
    (let [x (longo 11 13)
          y (longo 13 17)
          z (longo 17 19)]
      (* x y z)))

  (time (sequencial))

  (defn concorrente []
    (let [x (future (longo 11 13))
          y (future (longo 13 17))
          z (future (longo 17 19))]
      (* @x @y @z)))

  (time (concorrente))

  )
