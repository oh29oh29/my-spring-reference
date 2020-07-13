package pe.oh29oh29.dbautocommit;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import pe.oh29oh29.dbautocommit.entity.TestRepository;

@Component
public class AppRunner implements ApplicationRunner {

    private final TestRepository repository;

    public AppRunner(TestRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        repository.findById(1L);
    }
}
