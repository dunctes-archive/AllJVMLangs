package me.duncte123.alljvmlangs

import org.mozilla.javascript.Context

/**
 * Little hack to run rhino :)
 */
class RunRhino {
    String getMessage() {
        def mozillaJsContext = Context.enter()
        def scope = mozillaJsContext.initStandardObjects()
        def reader = new FileReader("src/main/rhino/me/duncte123/alljvmlangs/RhinoClass.js")
        def evaled = mozillaJsContext.evaluateReader(
                scope,
                reader,
                "RhinoClass.js",
                1,
                null
        )

        return mozillaJsContext.toString(evaled)
    }
}