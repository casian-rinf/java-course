package com.rinftech.animals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class DomesticAnimalTest {

    DomesticAnimal animal;

    @BeforeEach
    public void setup() {
        animal = new GoldenRetriever("Dog", 12.0f, "John", "White");
    }

    @Test
    void testTrainSkill() {
        int skillTrainer = 5;
        int expected = 10;
        animal.trainSkill(skillTrainer);
        animal.trainSkill(skillTrainer);

        int actual = animal.getSkillLevel();

        assertEquals(expected, actual);
    }
}