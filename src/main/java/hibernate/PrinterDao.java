package hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PrinterDao {


    public void savePrinter(Printer printer) {
        Transaction transaction = null;
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(printer);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List<Printer> getPrinters() {
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            return session.createQuery("from Printer", Printer.class).list();
        }
    }

    public void updatePrinter(Printer printer) {
        Transaction transaction = null;
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(printer);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deletePrinter(int id) {

        Printer printerToDelete = getPrinters().get(id);

        Transaction transaction = null;
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.delete(printerToDelete);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
