package mediator.practice;

public class LaunchCanal {
    public static void main(String[] args) {
        Skype skype = new Skype();

        Dev dev1 =  new Dev(skype, "Kotlin");
        dev1.setCi("8080619").setName("Rene").setCargo("dev");
        Dev dev2 =  new Dev(skype, "Java");
        dev2.setCi("07876220").setName("Arturo").setCargo("dev");
        Dev dev3 =  new Dev(skype, "Python");
        dev3.setCi("7491026").setName("Jonas").setCargo("dev");

        Qa qa1 = new Qa(skype,"Master");
        qa1.setCi("717179").setName("Martin").setCargo("QA");
        Qa qa2 = new Qa(skype, "Master");
        qa2.setCi("891919").setName("Jhon").setCargo("QA");
        Qa qa3 = new Qa(skype, "Senior");
        qa3.setCi("905949").setName("Sophia").setCargo("QA");

        Sm sm1 = new Sm(skype,"React, Angular");
        sm1.setCi("99789500").setName("Hernan").setCargo("SM");
        Sm sm2 = new Sm(skype,"Android, IOS");
        sm2.setCi("0210301").setName("Jordan").setCargo("SM");
        Sm sm3 = new Sm(skype,"Python, Angular");
        sm3.setCi("771014045").setName("Jose").setCargo("SM");

        skype.addToChat(dev1.getCi(), dev1)
                .addToChat(dev2.getCi(),dev2)
                .addToChat(dev3.getCi(), dev3)
                .addToChat(qa1.getCi(), qa1)
                .addToChat(qa2.getCi(), qa2)
                .addToChat(qa3.getCi(),qa3)
                .addToChat(sm1.getCi(), sm1)
                .addToChat(sm2.getCi(),sm2)
                .addToChat(sm3.getCi(), sm3);

        qa1.enviar("Reporten avances.");
        dev3.enviar("Acelerar el trabajo.");
        sm1.enviar("Hora de la reunion.");

    }
}
