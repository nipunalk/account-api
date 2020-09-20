package com.igreendata.accountapi.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.igreendata.accountapi.persistence.entity.TransactionEntity;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity, Integer> {
	@Query("FROM TransactionEntity g where g.accountEntity.accountId = :accountId")
	List<TransactionEntity> findByAccount(@Param("accountId") Long accountId);
}
