package kr.api.review.repository;

import kr.api.review.model.ReviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<ReviewEntity, Long>, ReviewRepositoryCustom {
}
