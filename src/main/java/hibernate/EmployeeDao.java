package hibernate;

public class EmployeeDao implements HibernateEntity{

//    public void saveEmployee(Employees employee) {
//        Transaction transaction = null;
//        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
//            transaction = session.beginTransaction();
//            session.save(employee);
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }
//    }
//
//    public List<Employees> getEmployees() {
//        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
//            return session.createQuery("from Employees", Employees.class).list();
//        }
//    }
//
//    public void updateEmployees(Employees employee) {
//        Transaction transaction = null;
//        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
//            transaction = session.beginTransaction();
//            session.update(employee);
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }
//    }
//
//    public void deleteEmployees(int id) {
//        Employees employee = getEmployees().get(id);
//
//        Transaction transaction = null;
//        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
//            transaction = session.beginTransaction();
//            session.delete(employee);
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }
//    }
}
