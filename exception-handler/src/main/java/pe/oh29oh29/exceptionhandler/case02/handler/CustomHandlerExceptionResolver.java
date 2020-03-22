package pe.oh29oh29.exceptionhandler.case02.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Custom HandlerExceptionResolver
 * <p>
 * The combination of DefaultHandlerExceptionResolver and ResponseStatusExceptionResolver goes a long way towards providing a good error handling mechanism for a Spring RESTful Service.
 * The downside is – as mentioned before – no control over the body of the response.
 * <p>
 * Ideally, we'd like to be able to output either JSON or XML, depending on what format the client has asked for (via the Accept header).
 * <p>
 * One detail to notice here is that we have access to the request itself, so we can consider the value of the Accept header sent by the client.
 * <p>
 * For example,
 * if the client asks for application/json then, in the case of an error condition, we'd want to make sure we return a response body encoded with application/json.
 * <p>
 * The other important implementation detail is that we return a ModelAndView – this is the body of the response and it will allow us to set whatever is necessary on it.
 */
@Component
public class CustomHandlerExceptionResolver extends AbstractHandlerExceptionResolver {

    @Override
    protected ModelAndView doResolveException(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler,
            Exception ex
    ) {
        try {
            if (ex instanceof IllegalArgumentException) {
                return handleIllegalArgument((IllegalArgumentException) ex, response);
            }
        } catch (Exception ignored) {
        }

        return null;
    }

    private ModelAndView handleIllegalArgument(
            IllegalArgumentException ex,
            HttpServletResponse response
    ) throws IOException {
        response.sendError(HttpServletResponse.SC_CONFLICT);
        System.out.println("[ExceptionHandler] CustomHandlerExceptionResolver handle IllegalArgument");

        return new ModelAndView();
    }
}
