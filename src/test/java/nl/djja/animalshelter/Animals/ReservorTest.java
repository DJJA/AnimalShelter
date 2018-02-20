package nl.djja.animalshelter.Animals;

import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.BeforeEach;

import java.util.Date;

class ReservorTest {

    @BeforeEach
    void testConstructor(){
        Date reservedAt = new Date();
        Reservor reservor = new Reservor("Klaas", reservedAt);
        Assert.check(reservor.getName() == "Klaas");
        Assert.check(reservor.getReservedAt().getTime() == reservedAt.getTime());
    }
}