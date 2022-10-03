package verbspractice

import grails.converters.JSON

class WeekController {
    def weekService
    def parseService
    def final ERROR_RESPONSE = [success: false, error: Error.INTERNAL_ERROR]

    def findAll() {
        def response = null

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
        def response = null

        try {
            def id = request.JSON.id as long
            response = weekService.findById(id) ?: ERROR_RESPONSE
        } catch (Exception e) {
            response = ERROR_RESPONSE
            e.printStackTrace()
        } finally {
            render (response as JSON)
        }
    }

    def create() {
        def response = null

        try {
            println request.JSON




            def week = parseService.parseWeek(request.JSON.week)

            println week
            response = weekService.create(week) ?: ERROR_RESPONSE
        } catch (Exception e) {
            response = ERROR_RESPONSE
            e.printStackTrace()
        } finally {
            render (response as JSON)
        }
    }

    def update() {
        def response = null

        try {
            def week = request.JSON.week as Week
            response = weekService.update(week) ?: ERROR_RESPONSE
        } catch (Exception e) {
            response = ERROR_RESPONSE
            e.printStackTrace()
        } finally {
            render (response as JSON)
        }
    }

    def delete() {
        def response = null

        try {
            def id = request.JSON.id as long
            response = weekService.findAll() ?: ERROR_RESPONSE
        } catch (Exception e) {
            response = ERROR_RESPONSE
            e.printStackTrace()
        } finally {
            render (response as JSON)
        }
    }
}
