package co.edu.udistrital.mdp.caminatas.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity

public class ReaccionEntity extends BaseEntity {
    private Integer like;
    private Integer dislike;
      
}
