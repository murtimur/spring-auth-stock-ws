package com.muratyildirim.app.depodetaylienvanter;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DepodetayliEnvanterRepository extends JpaRepository<DepodetayliEnvanter, Integer> {

	DepodetayliEnvanter findByStokIdAndSubeId(Integer stokId, Short subeId);

}
