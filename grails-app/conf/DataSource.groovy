dataSource {
    pooled = true
    driverClassName = "org.h2.Driver"
    username = "sa"
    password = ""
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {

    }
    test {
        dataSource {
                dbCreate = "update"
                driverClassName = "org.postgresql.Driver"
                dialect = org.hibernate.dialect.PostgreSQLDialect
    
                //uri = new URI(System.env.DATABASE_URL?:"postgres://kfiwruukiqcqum:CpKtm5_vjBjSlM6xmLZkCuH9tS@ec2-54-243-241-130.compute-1.amazonaws.com:5432/d2nebkepkb5u3k")
                uri = new URI(System.env.DATABASE_URL?:"postgres://postgres:postgres@127.0.0.1:5432/test")
                url = "jdbc:postgresql://"+uri.host+uri.path
                username = uri.userInfo.split(":")[0]
                password = uri.userInfo.split(":")[1]        }
    }
    production {
        dataSource {
                dbCreate = "update"
                driverClassName = "org.postgresql.Driver"
                dialect = org.hibernate.dialect.PostgreSQLDialect
    
                uri = new URI(System.env.DATABASE_URL?:"postgres://kfiwruukiqcqum:CpKtm5_vjBjSlM6xmLZkCuH9tS@ec2-54-243-241-130.compute-1.amazonaws.com:5432/d2nebkepkb5u3k")

                //uri = new URI(System.env.DATABASE_URL?:"postgres://postgres:postgres@127.0.0.1:5432/test")
                url = "jdbc:postgresql://"+uri.host+uri.path
                username = uri.userInfo.split(":")[0]
                password = uri.userInfo.split(":")[1]
        }
    }
}
