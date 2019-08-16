import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

Path projectPath = Paths.get(request.outputDirectory, request.artifactId)

if("requester".equals(request.properties["ServiceType"].toLowerCase())) {

    // delete Provider APIs
    Path apis = projectPath.resolve("src/main/synapse-config/api/SampleAPI.xml")
    Files.deleteIfExists apis

    // delete Provider Proxy-service
    Path proxyies = projectPath.resolve("src/main/synapse-config/proxy-services/SampleProviderProxy.xml")
    Files.deleteIfExists proxyies

} else if ("provider".equals(request.properties["ServiceType"].toLowerCase())) {

    // delete Requester Proxy-service
    Path proxyies = projectPath.resolve("src/main/synapse-config/proxy-services/SampleRequestProxy.xml")
    Files.deleteIfExists proxyies

}