import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Responder {
    private Map<String, String> responsesMap;
    private String[] defaultResponses;
    private Random random;

    public Responder(){
        responsesMap = new HashMap<>();
        responsesMap.put("password", "If you're having trouble with passwords, try resetting it or verifying it.");
        responsesMap.put("slow", "Your system might be slow due to various reasons like insufficient memory.");
        responsesMap.put("crash", "If your application crashed, try restarting it and let me know if the issue persists.");
        responsesMap.put("help", "I'm here to help! Please provide more details about your issue.");
        responsesMap.put("error", "Let's troubleshoot this error. Could you describe the errors?");

        defaultResponses = new String[] {
            "That sounds interesting. Tell me more...",
            "Can you clarify that?",
            "I'd love to help! Please explain further.",
            "Hmm, that's something we can look into. Could you give more details?",
            "I see, let's dive deeper into the issue."
        };

        random = new Random();
    }

    public String generateResponse(String userInput){
        for (String key : responsesMap.keySet()) {
            if (userInput.toLowerCase().contains(key)) {
                return responsesMap.get(key);
            }
        }

        return getRandomDefaultResponse();
    }

    private String getRandomDefaultResponse() {
        int index = random.nextInt(defaultResponses.length);
        return defaultResponses[index];
    }
}
