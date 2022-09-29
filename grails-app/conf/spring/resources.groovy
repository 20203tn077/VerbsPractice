import grails.rest.render.json.JsonRenderer

// Place your Spring DSL code here
beans = {
    generalRenderer(JsonRenderer, GroovyObject) {
        excludes = ['class', 'declaringClass', 'errors', 'version']
    }
}
