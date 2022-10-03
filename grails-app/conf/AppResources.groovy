modules = {
    angular {
        resource url:[dir:'js/angular', file:'angular.min.js'], disposition: 'head'
    }
    bootstrap {
        resource url:[dir:'css/bootstrap', file:'bootstrap.min.css']
        resource url:[dir:'js/bootstrap', file:'bootstrap.min.js']
    }
    styles {
        dependsOn 'bootstrap'
    }
    js {
        dependsOn 'angular'

        resource url:[dir:'app', file:'app.js']
    }
}