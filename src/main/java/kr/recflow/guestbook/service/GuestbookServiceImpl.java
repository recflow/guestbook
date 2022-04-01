package kr.recflow.guestbook.service;

import kr.recflow.guestbook.dto.GuestbookDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class GuestbookServiceImpl implements GuestbookService{

    @Override
    public Long register(GuestbookDTO dto) {
        return null;
    }
}
