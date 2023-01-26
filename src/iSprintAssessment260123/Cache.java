package iSprintAssessment260123;

// Create an Object cache class, Cache, where the key of cache must be a String. It should have:
// Expiry of 1 minute (Cache get method should not return the element when the element has expired)
// Size limit (configurable via the Cache constructor)
// Least Recently Used (LRU) for auto eviction when the size limit is reached

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Cache <A> {
    private Map<String, CacheValue<A>> cacheMap;
    private int sizeLimit;
    private long expiry;

    public Cache(int sizeLimit, long expiry, TimeUnit timeUnit) {
        this.sizeLimit = sizeLimit;
        this.expiry = TimeUnit.MILLISECONDS.convert(expiry, timeUnit);
        this.cacheMap = new LinkedHashMap<String, CacheValue<A>>() {
            protected boolean removeEldestEntry(Map.Entry<String, CacheValue<A>> eldest) {
                return size() > sizeLimit || (System.currentTimeMillis() - eldest.getValue().lastAccessTime > expiry);
            }
        };
    }

    public void put(String key, A value) {
        cacheMap.put(key, new CacheValue<>(value));
    }

    public A get(String key) {
        CacheValue<A> cacheValue = cacheMap.get(key);
        if (cacheValue != null) {
            long currentTime = System.currentTimeMillis();
            if (currentTime - cacheValue.lastAccessTime > expiry) {
                cacheMap.remove(key);
                return null;
            } else {
                cacheValue.lastAccessTime = currentTime;
                return cacheValue.value;
            }
        } else {
            return null;
        }
    }

    public void remove(String key) {
        cacheMap.remove(key);
    }

    public Map<String, A> getAll() {
        Map<String, A> allValues = new LinkedHashMap<>();
        for (Map.Entry<String, CacheValue<A>> entry : cacheMap.entrySet()) {
            allValues.put(entry.getKey(), entry.getValue().value);
        }
        return allValues;
    }

    private class CacheValue<A> {
        A value;
        long lastAccessTime;

        public CacheValue(A value) {
            this.value = value;
            this.lastAccessTime = System.currentTimeMillis();
        }
    }

// Methods:
// Put/Add an element to the Cache
// Remove an element from the Cache
// Get an element from the Cache
// Get all elements from the Cache
// (Note) please do not use a cache library as the question is for you to create a Cache class.

    public static void main (String[] args) throws InterruptedException {
        Cache<Integer> cache = new Cache<>(5, 1, TimeUnit.MINUTES);
        cache.put("a", 1);
        cache.put("b", 2);
        cache.put("c", 3);
        cache.put("d", 4);
        cache.put("e", 5);
        System.out.println(cache.get("a")); // Output: 1
        System.out.println(cache.get("b")); // Output: 2
        System.out.println(cache.get("c")); // Output: 3
        System.out.println(cache.get("d")); // Output: 4
        System.out.println(cache.get("e")); // Output: 5

        Thread.sleep(60000);
    }
}
