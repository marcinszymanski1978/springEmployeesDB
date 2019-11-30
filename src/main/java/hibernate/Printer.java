package hibernate;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Printer")
@ToString
@RequiredArgsConstructor
public class Printer implements HibernateEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "model")
    @Getter @Setter
    @NonNull
    private String model;

    @Column(name = "cmyk")
    @Getter @Setter
    @NonNull
    @ToString.Exclude
    private boolean cmyk;

    @Column(name = "localization")
    @Getter @Setter
    @NonNull
    private String localization;

    @Column(name = "userName")
    @Getter @Setter
    @NonNull
    private String userName;

    @Column(name = "userID")
    @Getter @Setter
    @NonNull
    private int userId;

    public Printer (){}


//    @OneToMany(mappedBy = "employees", orphanRemoval = true, fetch = FetchType.EAGER)
//    @Getter @Setter
//    @ToString.Exclude
//    private Set<Cars> cars;
//
//    @OneToMany(mappedBy = "employees", orphanRemoval = true, fetch = FetchType.EAGER)
//    @Getter @Setter
//    @ToString.Exclude
//    private Set<Phones> phones;
//

}
