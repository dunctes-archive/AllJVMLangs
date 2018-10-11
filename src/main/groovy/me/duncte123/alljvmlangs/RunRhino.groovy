package me.duncte123.alljvmlangs

import org.mozilla.javascript.Context

/**
 * Little hack to run rhino :)
 */
class RunRhino extends LangBase {
    @Override
    void printMessage() {
        def mozillaJsContext = Context.enter()
        def scope = mozillaJsContext.initStandardObjects()
        def script = new FileReader("src/main/rhino/me/duncte123/alljvmlangs/RhinoClass.js").readLines().join("")
        mozillaJsContext.evaluateString(scope, script, "RhinoClass", 1, null)
    }
}
