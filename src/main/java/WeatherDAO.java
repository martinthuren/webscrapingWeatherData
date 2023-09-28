import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

public class WeatherDAO {

    static public EntityManagerFactory emf = HibernateConfig.getEntityManagerFactoryConfig();

        public static WeatherEntity save(WeatherEntity weatherEntity) {
            EntityManager em = emf.createEntityManager();

            em.getTransaction().begin();
            em.persist(weatherEntity);
            em.getTransaction().commit();
            em.close();
            return weatherEntity;
        }

        public static void delete(Long id) {
            EntityManager em = emf.createEntityManager();
            EntityTransaction transaction = em.getTransaction();

            transaction.begin();
            WeatherEntity weatherEntity = findWeatherById(id);

            if (weatherEntity != null) {
                System.out.println("Weather object with ID " + id + " has been removed.");
                em.remove(weatherEntity);
            }

            transaction.commit();

            em.close();
        }

        public static WeatherEntity findWeatherById(Long id) {
            EntityManager em = emf.createEntityManager();


            em.getTransaction().begin();

            WeatherEntity foundWeatherEntity = em.find(WeatherEntity.class, id);

            if (foundWeatherEntity == null) {
                System.out.println("Weather object with ID " + id + " not found.");
            }
            em.getTransaction().commit();

            em.close();

            return foundWeatherEntity;
        }

        public static void getAllWeatherData() {
            EntityManager em = emf.createEntityManager();
            EntityTransaction transaction = em.getTransaction();

            transaction.begin();

            em.createQuery("SELECT w FROM WeatherEntity w", WeatherEntity.class)
                    .getResultList()
                    .forEach(System.out::println);

            transaction.commit();

            em.close();
        }

        public static WeatherEntity update(WeatherEntity weatherEntity) {
            EntityManager em = emf.createEntityManager();


            em.getTransaction().begin();

            WeatherEntity updatedWeatherEntity = em.merge(weatherEntity);

            em.getTransaction().commit();

            em.close();
            return updatedWeatherEntity;
        }
    }

