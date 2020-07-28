package test.pivotal.pal.tracker;

import java.util.Map;
import io.pivotal.pal.tracker.EnvController;
import org.junit.jupiter.api.Test;

public class EnvControllerTest {
    @Test
    public void getEnv() throws Exception {
        EnvController controller = new EnvController(
            "8675",
            "12G",
            "34",
            "123.sesame.street"
        );

        Map<String, String> env = controller.getEnv();


        assert(env.get("PORT")).equals("8675");
        assert(env.get("MEMORY_LIMIT")).equals("12G");
        assert(env.get("CF_INSTANCE_INDEX")).equals("34");
        assert(env.get("CF_INSTANCE_ADDR")).equals("123.sesame.street");
    }

}
