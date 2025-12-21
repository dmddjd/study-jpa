//package jpa2;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class ValueMain {
//    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction et = em.getTransaction();
//        et.begin();
//
//        try {
//            // 기본 값 타입
////            int a1 = 10;
////            int b1 = a1;
////            a1 = 20;
////            System.out.println("a1 : " + a1);
////            System.out.println("b1 : " + b1);
////            Integer a2 = 10;
////            Integer b2 = a2;
////            a2 = 20;
////            System.out.println("a2 : " + a2);
////            System.out.println("b2 : " + b2);
//
//            // 임베디드 타입
////            Address address = new Address("city", "street", "zipcode");
////
////            Member member1 = new Member();
////            member1.setUserName("member1");
////            member1.setHomeAddress(address);
////            em.persist(member1);
////
////            Address copyAddress = new Address(address.getCity(), address.getStreet(), address.getZipcode());
////            Member member2 = new Member();
////            member2.setUserName("member1");
////            member2.setHomeAddress(copyAddress);
////            em.persist(member2);
////
////            member1.getHomeAddress().setCity("newCity");
//
//            // 값 타입 비교
//    //        int a = 10;
//    //        int b = 10;
//    //        System.out.println("a == b : " + (a == b));
//    //
//    //        Address address1 = new Address("city", "street", "zipcode");
//    //        Address address2 = new Address("city", "street", "zipcode");
//    //
//    //        System.out.println("address1 == address2 : " + (address1 == address2));
//    //        System.out.println("address1 equals address2 : " + (address1.equals(address2)));
//
//            // 값 타입 컬렉션
//            Member member = new Member();
//            member.setUserName("user1");
//            member.setHomeAddress(new Address("city1", "street1", "zipcode1"));
//
//            member.getFavoriteFoods().add("치킨");
//            member.getFavoriteFoods().add("피자");
//            member.getFavoriteFoods().add("햄버거");
//
//    //        member.getAddressHistory().add(new Address("city2", "street2", "zipcode2"));
//    //        member.getAddressHistory().add(new Address("city3", "street3", "zipcode3"));
//            member.getAddressHistory().add(new AddressEntity("city2","street2","zipcode2"));
//            member.getAddressHistory().add(new AddressEntity("city3","street3","zipcode3"));
//
//
//            em.persist(member);
//
//            em.flush();
//            em.clear();
//
//            System.out.println("============ START ============");
//            Member findMember = em.find(Member.class, member.getId());
//
//            // 조회
//    //        List<Address> addressHistory = findMember.getAddressHistory();
//    //        for (Address address : addressHistory) {
//    //            System.out.println("address : " + address);
//    //        }
//    //
//    //        Set<String> favoriteFoods =  findMember.getFavoriteFoods();
//    //        for (String favoriteFood : favoriteFoods) {
//    //            System.out.println("favoriteFood : " + favoriteFood);
//    //        }
//
//            // 수정
//    //        Address a = findMember.getHomeAddress();
//    //        findMember.setHomeAddress(new Address("newCity", a.getStreet(), a.getZipcode()));
//
//            findMember.getFavoriteFoods().remove("치킨");
//            findMember.getFavoriteFoods().add("족발");
//
//    //        findMember.getAddressHistory().remove(new Address("city2", "street2", "zipcode2"));
//    //        findMember.getAddressHistory().add(new Address("newCity2", "newStreet2", "newZipcode2"));
//            et.commit();
//        } catch(Exception e) {
//            e.printStackTrace();
//            et.rollback();
//        } finally {
//            em.close();
//        }
//        emf.close();
//
//
//    }
//}
