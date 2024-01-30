import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;

@RestController
public class MyController {

    private static final Tracer tracer = OpenTelemetry.getGlobalTracer("my-application-tracer");

    @GetMapping("/")
    public String hello() {
        Span span = tracer.spanBuilder("hello-span").startSpan();
        try (Scope scope = span.makeCurrent()) {
            // Your business logic here
            return "Hello World!";
        } finally {
            span.end();
        }
    }
}
