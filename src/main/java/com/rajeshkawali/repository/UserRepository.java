package com.rajeshkawali.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rajeshkawali.entity.User;

/**
 * @author Rajesh_Kawali
 *
 */
@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {

}

/*
The @Transactional annotation is used to mark a method as transactional. 
When you mark a method as transactional, Spring Boot will automatically manage transactions for that method.


Options available for the @Transactional annotation in Spring Boot:-->

readOnly: This option specifies whether the transaction is read-only. If set to true, the transaction will be read-only and no updates will be allowed.

timeout: This option specifies the maximum amount of time that the transaction should be allowed to execute before it times out.

propagation: This option specifies the propagation behavior of the transaction. The propagation behavior determines how transactions are propagated between methods.

isolation: This option specifies the isolation level of the transaction. The isolation level determines how the transaction interacts with other transactions in the system.

rollbackFor: This option specifies the exception types that should trigger a rollback of the transaction.

noRollbackFor: This option specifies the exception types that should not trigger a rollback of the transaction.

value: This option is used to specify one or more transactional attributes in the same annotation.

example:-->  

@Transactional(timeout = 60, readOnly = true, propagation = Propagation.REQUIRES_NEW, rollbackFor = { RuntimeException.class, MyCustomException.class })

In the above example, we have a method called myTransactionalMethod that is marked as @Transactional. 
The method has a timeout of 60 seconds, is read-only, has a propagation behavior of Propagation.REQUIRES_NEW, 
and will roll back if a RuntimeException or MyCustomException is thrown.
*/