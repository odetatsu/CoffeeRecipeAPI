package com.coffeerecipe.api.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coffeerecipe.api.entity.MTaste;
/**
 * ユーザー情報 Repository
 */
@Repository
public interface TasteRepository extends JpaRepository<MTaste, Integer> {
}