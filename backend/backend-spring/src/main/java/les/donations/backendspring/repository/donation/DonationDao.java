package les.donations.backendspring.repository.donation;

import les.donations.backendspring.model.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DonationDao extends JpaRepository<Donation, Long> {

    Optional<Donation> findByIdAndActiveIsTrue(Long id);

    List<Donation> findByActiveIsTrue();

}
