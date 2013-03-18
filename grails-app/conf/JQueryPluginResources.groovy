// Resource declarations for Resources plugin
def jqver = org.codehaus.groovy.grails.plugins.jquery.JQueryConfig.SHIPPED_VERSION

modules = {
    'jquery' {
        resource id:'js', url:[plugin: 'jquery', dir:'js/jquery', file:"jquery-${jqver}.min.js"], nominify: true
    }

    'jquery-dev' {
        resource id:'js', url:[plugin: 'jquery', dir:'js/jquery', file:"jquery-${jqver}.js"]
    }
}