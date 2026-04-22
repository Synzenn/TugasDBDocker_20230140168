package PraktikumDB._April.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table (name = "20230140187_users")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
}