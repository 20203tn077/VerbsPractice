import grails.converters.JSON
import org.joda.time.LocalDate
import verbspractice.Category

class BootStrap {

    def init = { servletContext ->
        // CONFIGURACIÓN DE JSON
        JSON.registerObjectMarshaller(LocalDate) {
            return it?.toString("yyyy-MM-dd")
        }

        // INICIALIZACIÓN DE VALORES ESTÁTICOS
        if (!Category.findByName('Irregular')) new Category(name: 'Irregular').save()
        if (!Category.findByName('Regular')) new Category(name: 'Regular').save()
    }
    def destroy = {
    }
}
