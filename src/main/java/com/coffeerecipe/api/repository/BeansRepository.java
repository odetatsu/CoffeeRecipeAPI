package com.coffeerecipe.api.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.coffeerecipe.api.entity.MBeans;
/**
 * ユーザー情報 Repository
 */
@Repository
public interface BeansRepository extends JpaRepository<MBeans, Integer> {
    @Query(value ="select MAX(mb.DISP_ORDER) from m_beans mb;", nativeQuery=true)
	Integer getMaxOrder();
}