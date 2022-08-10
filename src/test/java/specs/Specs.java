package specs;

import config.AppConfig;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static helpers.CustomApiListener.withCustomTemplates;

public class Specs {
    public static final RequestSpecification REQ_SPEQ =
            new RequestSpecBuilder()
                    .addFilter(withCustomTemplates())
                    .setBaseUri(AppConfig.ApiUrl)
                    .setBasePath("/w/api.php?")
                    .setContentType(ContentType.JSON)
                    .log(LogDetail.ALL)
                    .build();
}
