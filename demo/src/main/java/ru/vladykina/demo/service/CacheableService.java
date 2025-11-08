package ru.vladykina.demo.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.vladykina.demo.cache.TransactionCache;
import ru.vladykina.demo.data.TransferGeneratorService;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;

@RequiredArgsConstructor
@Slf4j
@Service
public class CacheableService {

    //@Qualifier("concurrentTransactionCache")
    private final TransactionCache concurrentTransactionCache;

    AtomicInteger count =new AtomicInteger(0);

    // Имитация перевода (без изменения баланса — фокус на кэше)
    public void executeTransfer(TransferGeneratorService.TransferOperation op)  {
        count.incrementAndGet();
        //  log.info("Cache acc from ={}. acc to={}", op.from(), op.to());
        // Добавляем транзакцию в оба счёта
        concurrentTransactionCache.addTransaction(op.from(), op);
        concurrentTransactionCache.addTransaction(op.to(), op);
        //Thread.sleep(1);
    }

    public Collection<TransferGeneratorService.TransferOperation > getTransfersByAcc(String acc){
        return concurrentTransactionCache.getLastTransactions(acc);
    }
}
