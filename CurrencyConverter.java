import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

public class CurrencyConverter {
    private static final String CASH_API_KEY = "KMYJ7SJCG1MYX65X";

    public static void main(String[] args) {
        if (args.length == 1 && args[0].equalsIgnoreCase("--help")) {
            showHelp();
            return;
        }

        if (args.length != 3) {
            System.out.println("Invalid arguments. Use '--help' for usage instructions.");
            return;
        }

        try {
            double origCurAmount = Double.parseDouble(args[0]);
            String origCur = args[1].toUpperCase();
            String newCur = args[2].toUpperCase();

            double newCurAmount = convertCurrency(origCurAmount, origCur, newCur);
            if (newCurAmount != -1) {
                System.out.printf("%.2f %s = %.5f %s%n", origCurAmount, origCur, newCurAmount, newCur);
            } else {
                System.out.println("Currency not supported.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount of currency.");
        }
    }

    private static void showHelp() {
        System.out.println("Currency Converter Help:");
        System.out.println("Converts money from one currency to another.");
        System.out.println("Usage: java CurrencyConverter <amount> <from_currency> <to_currency>");
        System.out.println("Example: java CurrencyConverter 20 USD INR");
        System.out.println("Use '--help' to display this help message.");
    }

    private static double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        String requestUrl = String.format(
            "https://www.alphavantage.co/query?function=CURRENCY_EXCHANGE_RATE&from_currency=%s&to_currency=%s&apikey=%s",
            fromCurrency, toCurrency, CASH_API_KEY);

        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(requestUrl).openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == 200) {
                Scanner scanner = new Scanner(connection.getInputStream());
                StringBuilder response = new StringBuilder();
                while (scanner.hasNextLine()) {
                    response.append(scanner.nextLine());
                }
                scanner.close();

                JSONObject jsonResponse = new JSONObject(response.toString());
                JSONObject exchangeRate = jsonResponse.getJSONObject("Realtime Currency Exchange Rate");
                double currentRate = Double.parseDouble(exchangeRate.getString("5. Exchange Rate"));

                return amount * currentRate;
            } else {
                System.out.println("Error in API response.");
                return -1;
            }
        } catch (IOException | org.json.JSONException e) {
            System.out.println("Currency not supported.");
            return -1;
        }
    }
}
