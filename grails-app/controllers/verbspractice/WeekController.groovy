package verbspractice

import grails.converters.JSON

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

class WeekController {
    def weekService
    def final ERROR_RESPONSE = [success: false, error: Error.INTERNAL_ERROR]

    def findAll() {
        def response

        try {
            response = weekService.findAll() ?: ERROR_RESPONSE
        } catch (Exception e) {
            response = ERROR_RESPONSE
            e.printStackTrace()
        } finally {
            render (response as JSON)
        }
    }

    def findById() {
        def response

        try {
            long id = request.JSON.id as long
            response = weekService.findById(id: id) ?: ERROR_RESPONSE
        } catch (Exception e) {
            response = ERROR_RESPONSE
            e.printStackTrace()
        } finally {
            render (response as JSON)
        }
    }

    def create() {
        def response

        try {
            response = weekService.findAll() ?: ERROR_RESPONSE
        } catch (Exception e) {
            response = ERROR_RESPONSE
            e.printStackTrace()
        } finally {
            render (response as JSON)
        }
    }

    def update() {
        def response

        try {
            response = weekService.findAll() ?: ERROR_RESPONSE
        } catch (Exception e) {
            response = ERROR_RESPONSE
            e.printStackTrace()
        } finally {
            render (response as JSON)
        }
    }

    def delete() {
        def response

        try {
            response = weekService.findAll() ?: ERROR_RESPONSE
        } catch (Exception e) {
            response = ERROR_RESPONSE
            e.printStackTrace()
        } finally {
            render (response as JSON)
        }
    }
}
