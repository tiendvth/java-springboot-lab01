package fpt.aptech.t2009m1.repository;

import fpt.aptech.t2009m1.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
