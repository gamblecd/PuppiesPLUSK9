grails.servlet.version = "2.5" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
grails.project.source.level = 1.6
//grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // specify dependency exclusions here; for example, uncomment this to disable ehcache:
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve

    repositories {
        inherits true // Whether to inherit repository definitions from plugins

        grailsPlugins()
        grailsHome()
        grailsCentral()

        mavenLocal()
        mavenCentral()

        // uncomment these (or add new ones) to enable remote dependency resolution from public Maven repositories
        mavenRepo "http://repository.codehaus.org"
        mavenRepo "http://download.java.net/maven/2/"
        mavenRepo "http://repo.desirableobjects.co.uk/"
		mavenRepo "http://repository.jboss.com/maven2/"
		mavenRepo "http://snapshots.repository.codehaus.org"
		mavenRepo "http://repository.ow2.org/nexus/content/repositories/public"
		
    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.

        // runtime 'mysql:mysql-connector-java:5.1.200'
        runtime 'postgresql:postgresql:9.1-901-1.jdbc4'
        compile 'com.google.apis:google-api-services-calendar:v3-rev57-1.16.0-rc'
		compile 'com.google.apis:google-api-services-oauth2:v2-rev47-1.16.0-rc'
        compile 'com.google.api.client:google-api-client:1.4.1-beta'
    }

    plugins {
        runtime ":hibernate:$grailsVersion"
        runtime ":jquery:1.8.0"
        runtime ":resources:1.1.6"

        // Uncomment these (or add new ones) to enable additional resources capabilities
        //runtime ":zipped-resources:1.0"
        //runtime ":cached-resources:1.0"
        //runtime ":yui-minify-resources:0.1.4"

        build ":tomcat:$grailsVersion"

        runtime ":database-migration:1.1"

        compile ':cache:1.0.0'
        
        compile ":webxml:1.4.1"
        compile ":database-session:1.1.2"
        compile ":jetty:2.0.3"
		compile ":newrelic:1.0-2.18.0"
		
		// Google Calendar
		compile ":oauth:2.1.0"
		
		// Heroku
		compile ':heroku:1.0.1'
		compile ':cloud-support:1.0.8'
    }
}
