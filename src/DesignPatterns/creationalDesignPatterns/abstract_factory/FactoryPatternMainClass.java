package src.DesignPatterns.creationalDesignPatterns.abstract_factory;

import java.util.Optional;

public class FactoryPatternMainClass {
	
	public static void main(String[] args) {
		AbstractFactory traineeProfession = AbstractFactoryProducer.getProfession(true);
		Profession traineeDoctor = traineeProfession.getProfession("Teacher");
		traineeDoctor.print();

		AbstractFactory profession = AbstractFactoryProducer.getProfession(false);
		Profession doctor = profession.getProfession("Teacher");
		doctor.print();

	}

}
