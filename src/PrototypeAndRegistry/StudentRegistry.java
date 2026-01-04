package PrototypeAndRegistry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> studentRegistryMap;

    public StudentRegistry() {
        this.studentRegistryMap = new HashMap<>();
    }

    public void register(String key, Student student) {
        this.studentRegistryMap.put(key, student);
    }

    public void remove(String key) {
        this.studentRegistryMap.remove(key);
    }

    public Student getStudent(String key) {
        return this.studentRegistryMap.get(key).copy();
    }

    public void fillRegistry() {
        studentRegistryMap.put("nov25", new Student("Tuhin", 1, "Nov 2025"));
        studentRegistryMap.put("dec25", new Student("Sabyasahi", 2, "Dec 2025"));
        studentRegistryMap.put("sep25", new Student("Anish", 3, "Sep 2025"));
    }
}
