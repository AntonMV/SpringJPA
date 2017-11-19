package com.prospring4.ch8.hibernateEnvers;

import java.util.List;

public interface ContactAuditService {
    List<ContactAudit> findAll();
    ContactAudit findById(Long id);
    ContactAudit save(ContactAudit contact);
    ContactAudit findAuditByRevision(Long id, int revision);
}
