package les.donations.backendspring.service.donation;

import les.donations.backendspring.dto.DonationDTO;
import les.donations.backendspring.dto.FileDTO;
import les.donations.backendspring.exceptions.NotFoundEntityException;

import java.util.List;

public interface IDonationService {

    /**
     * Method that creates a donation and its donation process
     * @param donationDTO the donation's information
     * @param filesDTO information about the donation's images
     * @return the inserted donations's information
     * @throws IllegalArgumentException in case any error exists in donation's information
     * @throws NotFoundEntityException in case any entity does not exist (category or address)
     */
    DonationDTO registerDonation(DonationDTO donationDTO, List<FileDTO> filesDTO) throws IllegalArgumentException, NotFoundEntityException;

    /**
     * Method that updates a donation
     * @param donationId the donation's identification
     * @param donationDTO the donation's information
     * @return the updated donation's information
     * @throws IllegalArgumentException in case any error exists in donation's information
     * @throws NotFoundEntityException in case any entity does not exist (donation, category or address)
     */
    DonationDTO updateDonation(Long donationId, DonationDTO donationDTO) throws IllegalArgumentException, NotFoundEntityException;

    /**
     * Method that gets donations by donor id
     * @param id the donor id
     * @return the list of donations made by provided donor
     */
    List<DonationDTO> getDonations();

    /**
     * Method that gets a specific donations
     * @param id the donation id
     * @return the donation
     */
    DonationDTO getDonation(Long id);

    /**
     * Method that removes specific donation
     * @param id the donation id
     */
    void deleteDonation(Long id) throws NotFoundEntityException;
}
