import org.codehaus.jackson.annotate.JsonProperty;

public class FakeObject {

    @JsonProperty("RestResponse")
    RestResponse restResponse;

     public RestResponse getRestResponse() {
        return restResponse;
    }


    public void setRestResponse(RestResponse restResponse) {
        this.restResponse = restResponse;
    }
}
