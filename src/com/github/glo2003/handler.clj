(ns com.github.glo2003.handler
  (:require [com.github.glo2003.routes :refer [app-routes]]
            [compojure.core :as compojure]
            [ring.middleware [json :as json]]))

(def app
  (compojure/routes
   (-> #'app-routes
       (json/wrap-json-response)
       (json/wrap-json-body {:keywords? true}))))
