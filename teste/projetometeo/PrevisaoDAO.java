import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PrevisaoDAO {
    private SessionFactory sessionFactory;

    public PrevisaoDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Previsao buscarPrevisao(String cidade) {
        Transaction transaction = null;
        Previsao previsao = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            previsao = session.createQuery("FROM Previsao WHERE cidade = :cidade", Previsao.class)
                              .setParameter("cidade", cidade)
                              .uniqueResult();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            System.err.println("Erro ao buscar previsão: " + e.getMessage());
        }
        return previsao;
    }
}