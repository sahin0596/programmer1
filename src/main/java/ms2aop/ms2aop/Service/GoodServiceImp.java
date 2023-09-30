package ms2aop.ms2aop.Service;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import ms2aop.ms2aop.Dto.GoodDto;
import org.springframework.stereotype.Service;

import java.util.Random;
@Slf4j
@Service
@RequiredArgsConstructor
public class GoodServiceImp implements GoodService{
    @Override
    @SneakyThrows
    public GoodDto sayGood1(String language) {
        long started = System.currentTimeMillis();
        Thread.sleep(new Random().nextInt(300));
        long ended = System.currentTimeMillis();
        log.info("Elapsed Time {}",ended-started);
        return new GoodDto("Hello Elgun");
    }
    @Override
    @SneakyThrows
    public GoodDto sayGood2() {
        long started = System.currentTimeMillis();
        Thread.sleep(new Random().nextInt(200));
        long ended = System.currentTimeMillis();
        log.info("Elapsed Time {}",ended-started);
        return new GoodDto("Hello Sahin");
    }
    @Override
    @SneakyThrows
    public GoodDto sayGood3() {
        long started = System.currentTimeMillis();
        Thread.sleep(new Random().nextInt(3000));
        long ended = System.currentTimeMillis();
        log.info("Elapsed Time {}",ended-started);
        return new GoodDto("Hello Developers");
    }
}
