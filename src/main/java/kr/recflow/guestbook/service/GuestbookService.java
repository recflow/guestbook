package kr.recflow.guestbook.service;

import kr.recflow.guestbook.dto.GuestbookDTO;

public interface GuestbookService {
    Long register(GuestbookDTO dto);
}
