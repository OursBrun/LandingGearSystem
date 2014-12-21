package landinggear.Model;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class DoorTest {
	Door D;
	int InitialPos;
	@Before
	public void setUp() throws Exception {
		System.out.println("Choisir position initial entre 0, 1 et 2");
        Scanner sc = new Scanner(System.in);
        InitialPos=sc.nextInt();
		
		D= new Door(InitialPos);
		
		
		D.openDoor();
		
		if(D.getPosition()!=2)
		{
			fail("La porte ne s'est pas ouverte");
		}
			
		D.closeDoor();
		
		if(D.getPosition()!=0)
		{
			fail("La porte ne s'est pas fermée");
		}		
	}

	@Test
	public void test() {

		// Verifier la conformité des positions
		if(D.getPosition()>2 || D.getPosition()<0)
		{
			fail("La position est hors catégorie");
		}
	}
	
}
