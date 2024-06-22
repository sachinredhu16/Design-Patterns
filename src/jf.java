package src;

public class jf {
    public static void main(String[] args) {
        String request = "{\"data\":\"key=IAfpK, age=58, key=WNVdi, age=64, key=jp9zt, age=47\"}";

        String data = request.split("\"data\":")[1].split("\"}")[0].replaceAll("\"", "");

        String[] items = data.split(", ");
        int varOcg = 0;
        for (String item : items) {
            String[] keyValue = item.split(",");
            for (String pair : keyValue) {
                String[] keyAgePair = pair.split("=");
                if (keyAgePair[0].trim().equals("age")) {
                    int age = Integer.parseInt(keyAgePair[1].trim());
                    if (age >= 50) {
                        varOcg++;  // Increment the count
                    }
                }
            }

            System.out.println(data);
        }
    }
}
