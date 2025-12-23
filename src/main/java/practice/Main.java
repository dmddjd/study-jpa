//package practice;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.criteria.CriteriaQuery;
//import javax.persistence.criteria.Root;
//import java.util.List;
//
//
//public class Main {
//    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction et = em.getTransaction();
//        et.begin();
//
//        try {
////            Orders order = new Orders();
////            order.addOrderItem(new OrderItem());
////            em.persist(order);
////
////            OrderItem orderItem = new OrderItem();
////            orderItem.setOrder(order);
////            em.persist(orderItem);
//
////            Book book = new Book();
////            book.setName("Book1");
////            book.setAuthor("Author1");
////            em.persist(book);
//
//            // JPQL
////            List<Member> result = em.createQuery("select m from Member m where m.name like '%kim%'", Member.class).getResultList();
////
////            for (Member member : result) {
////                System.out.println("member : " + member);
////            }
//
//            // Criteria
////            CriteriaBuilder cb = em.getCriteriaBuilder();
////            CriteriaQuery<Member> query = cb.createQuery(Member.class);
////
////            Root<Member> m = query.from(Member.class);
////
////            CriteriaQuery<Member> cq = query.select(m).where(cb.equal(m.get("name"),"kim"));
////            List<Member> resultList = em.createQuery(cq).getResultList();
//
//            // 네이테브 SQL
//
//            Member member = new Member();
//            member.setName("member1");
//            em.persist(member);
//
//            List<Member> resultList = em.createNativeQuery("select member_id, name, city, street, zipcode from member", Member.class).getResultList();
//
//            for (Member member1 : resultList) {
//                System.out.println("member1 : " + member1);
//            }
//
//
//
//            et.commit();
//        } catch(Exception e) {
//            System.err.println(e.getMessage());
//            et.rollback();
//        } finally {
//            em.close();
//        }
//        emf.close();
//    }
//}