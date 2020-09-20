package com.igreendata.accountapi.service;

import java.util.List;

import com.igreendata.accountapi.persistence.entity.AccountEntity;

public interface IAccountService {

	List<AccountEntity> getAccountList();

}
