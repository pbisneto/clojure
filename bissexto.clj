(ns bissexto)

(defn bissexto? [ano]
  (cond
    (int? (/ year 400)) true
    (int? (/ year 100)) false
    (int? (/ year 4)) true
    :else false
    )
  )

(defn aleatorio []
  (rand-int 3000))

(println "O ano" (aleatorio) "é bissexto?:" (bissexto?  (aleatorio)))
