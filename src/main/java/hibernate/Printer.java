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
    @Setter @Getter
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



    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "EMPLOYEE_ID", nullable = false, referencedColumnName = "ID")
    @Getter @Setter
    @NonNull
    public Employees employees;

    public Printer (){}



}
