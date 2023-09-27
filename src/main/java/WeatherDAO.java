import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

public class WeatherDAO {

    private EntityManagerFactory emf = HibernateConfig.getEntityManagerFactoryConfig();

        public WeatherEntity save(WeatherEntity weatherEntity) {
            EntityManager em = emf.createEntityManager();
            EntityTransaction transaction = em.getTransaction();

            transaction.begin();
            em.persist(weatherEntity);
            transaction.commit();

            em.close();

            return weatherEntity;
        }

        public WeatherEntity delete(Long id) {
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

            return weatherEntity;
        }

        public WeatherEntity findWeatherById(Long id) {
            EntityManager em = emf.createEntityManager();
            EntityTransaction transaction = em.getTransaction();

            transaction.begin();

            WeatherEntity foundWeatherEntity = em.find(WeatherEntity.class, id);

            if (foundWeatherEntity == null) {
                System.out.println("Weather object with ID " + id + " not found.");
            }

            transaction.commit();

            em.close();

            return foundWeatherEntity;
        }

        public void getAllWeatherData() {
            EntityManager em = emf.createEntityManager();
            EntityTransaction transaction = em.getTransaction();

            transaction.begin();

            em.createQuery("SELECT w FROM WeatherEntity w", WeatherEntity.class)
                    .getResultList()
                    .forEach(System.out::println);

            transaction.commit();

            em.close();
        }

        public WeatherEntity update(WeatherEntity weatherEntity) {
            EntityManager em = emf.createEntityManager();
            EntityTransaction transaction = em.getTransaction();

            transaction.begin();

            WeatherEntity updatedWeatherEntity = em.merge(weatherEntity);

            transaction.commit();

            em.close();

            return updatedWeatherEntity;
        }
    }

