package com.example.btl.Base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseRepository<Entity extends BaseModel> extends JpaRepository<Entity,Long> {
}
