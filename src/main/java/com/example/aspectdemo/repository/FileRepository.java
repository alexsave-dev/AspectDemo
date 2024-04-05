package com.example.aspectdemo.repository;

import com.example.aspectdemo.model.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {

}
