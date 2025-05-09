package com.example.lab3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.lab3.models.ProjectEntity;

import java.util.UUID;

public interface ProjectRepository extends JpaRepository<ProjectEntity, UUID> {
}
