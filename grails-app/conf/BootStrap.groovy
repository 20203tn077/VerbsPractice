import grails.converters.JSON
import verbspractice.Category

class BootStrap {

    def init = { servletContext ->
        // CONFIGURACIÓN DE JSON


        // INICIALIZACIÓN DE VALORES ESTÁTICOS
        if (!Category.findByName('Irregular')) new Category(name: 'Irregular').save()
        if (!Category.findByName('Regular')) new Category(name: 'Regular').save()
    }
    def destroy = {
    }
}
