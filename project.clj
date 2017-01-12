(defproject com.github.glo2003 "0.1.0-SNAPSHOT"
  :description "Starter kit for the GLO-2003 labs in Clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.1" :exclusions [joda-time clj-time]]
                 [ring/ring-json "0.4.0"]
                 [rethinkdb "0.10.1"]
                 [com.taoensso/timbre "4.7.4" :exclusions [org.clojure/tools.reader]]
                 [http-kit "2.2.0"]
                 [ring-cors "0.1.8"]]
  :main com.github.glo2003.core)
