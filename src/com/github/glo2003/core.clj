(ns com.github.glo2003.core
  (:require [taoensso.timbre :as log]
            [com.github.glo2003.config :refer [config]]
            [com.github.glo2003.handler :as handler]
            [org.httpkit.server :as httpkit]))


(defonce server (atom nil))


(defn start-server
  ([port github-token]
    (reset! server (httpkit/run-server handler/app {:port port}))
    (log/info (str "Started server on port " port)))
  ([]
   (let [{:keys [port github-token]} (config)]
     (start-server port github-token))))


(defn stop-server
  []
  (when-let [stop-fn @server]
    (stop-fn)
    (reset! server nil)))


(defn -main
  []
  (start-server))
