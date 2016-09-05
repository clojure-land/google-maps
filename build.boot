(set-env!
  :resource-paths #{"src"}
  :dependencies '[[adzerk/bootlaces           "0.1.9"           :scope "test"]
                  [hoplon/boot-hoplon         "0.1.9"           :scope "test"]
                  [hoplon/hoplon              "6.0.0-alpha14"]
                  [adzerk/env                 "0.2.0"]
                  [adzerk/cljs-console        "0.1.1"]
                  [cljsjs/google-maps         "3.18-1"]
                  [hoplon/google-loader       "0.2.0"]])

(require '[adzerk.bootlaces :refer :all]
         '[hoplon.boot-hoplon :refer :all])

(def +version+ "3.18.4")

(task-options!
 hoplon {:refers      '[adzerk.cljs-console]}
 push   {:repo        "clojars-upload"}
 pom    {:project     'rowtr/google-maps
         :version     +version+
         :description "hoplon google maps component"
         :url         "https://developers.google.com/maps/documentation/javascript/"
         :scm         {:url "https://github.com/hoplon/google-maps"}
         :license     {"" ""}})

