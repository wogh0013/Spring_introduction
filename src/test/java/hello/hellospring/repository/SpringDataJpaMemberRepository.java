package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//인터페이스가 인터페이스를 상속받을 땐 extends임 (implements X)
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository
{
    @Override
    Optional<Member> findByName(String name);
}
