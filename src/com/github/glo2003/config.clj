(ns com.github.glo2003.config
  (:require [taoensso.timbre :as log]))


(defn- env
  [env-variable]
  (if-let [env-value (System/getenv env-variable)]
    env-value
    (log/fatal (Exception. (format "You need to set %s environment variable."
                                   env-variable)))))


(defn config
  []
  {:port          (env "PORT")
   :github-token  (env "GITHUB_TOKEN")})
