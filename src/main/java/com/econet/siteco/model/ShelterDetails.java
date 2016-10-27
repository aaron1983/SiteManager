package com.econet.siteco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Aaron on 10/10/2016.
 */
@Entity
@Table(name="shelter_details")
public class ShelterDetails  implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Integer id;
}
