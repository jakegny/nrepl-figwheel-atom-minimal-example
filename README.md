# Getting ClojureScript in Atom + nREPL + Figwheel Main

Original: https://github.com/mkarp/cljs-nrepl-exercise

## How to set up

Copy `main.clj`, `nrepl_midleware.clj`, `logging.clj`, `deps.edn`, and `dev.cljs.edn`

This also assumes that you have `core.cljs` as your entry point. If you do not, change line 20 in `main.clj`

In a terminal run:
```
clj -A:nrepl
```
This comes from the deps.edn alias

Back in Atom, in the project,

Open Proto REPL
```
cmd-alt-Y
```

In Proto REPL
```
(cljs-repl)
```

You should now have Atom connected to the Browser

Proto REPL > nREPL > Figwheel > Browser


## Notes

Must have the main.clj, nrepl_midleware.clj, (and currently) logging.clj, to make this work

Each file must have a `reload` function in order for this to work. see `core.cljs`
