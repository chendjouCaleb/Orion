package org.orion.app.persistance.repository.contract;

import org.orion.app.entity.Account;

public interface IAccountRepository {
    Account save(Account account);
}
