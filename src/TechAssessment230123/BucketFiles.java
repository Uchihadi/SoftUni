package TechAssessment230123;
import java.util.*;

// You are logged into some Virtual Environment, only 2 types of commands are executed
// 1) goto <bucket_name> : Move to the specified bucket bucket_name
// 2) Create <filename> : Create a new file named filename in the current bucket (if the file with the same name already exists in the current bucket, the command does nothing)
// Your task is to process all provided commands and return the bucket name that contains the largest number of files at the end
// Guaranteed that there is no tie for the largest bucket name

public class BucketFiles {
    public static String solution(String commands) {
        // Create a map to store the bucket names and their file counts
        Map<String, Integer> bucketFileCounts = new HashMap<>();

        // Split the commands into an array
        String[] commandArray = commands.split("\n");

        // Initialize the current bucket name
        String currentBucket = "";

        // Process the commands
        for (String command : commandArray) {
            String[] parts = command.split(" ");
            String commandType = parts[0];
            if (commandType.equals("goto")) {
                // Update the current bucket name
                currentBucket = parts[1];
                // Add the bucket to the map if it doesn't exist
                if (!bucketFileCounts.containsKey(currentBucket)) {
                    bucketFileCounts.put(currentBucket, 0);
                }
            } else if (commandType.equals("create")) {
                // Increment the file count for the current bucket
                bucketFileCounts.put(currentBucket, bucketFileCounts.get(currentBucket) + 1);
            }
        }

        // Find the bucket with the largest number of files
        String largestBucket = "";
        int largestCount = 0;
        for (Map.Entry<String, Integer> entry : bucketFileCounts.entrySet()) {
            if (entry.getValue() > largestCount) {
                largestBucket = entry.getKey();
                largestCount = entry.getValue();
            }
        }

        // Return the result
        return largestBucket;
    }
    public static void main(String[] args) {
        String commands = "create file1\ngoto bucket1\ncreate file2\ncreate file3\ngoto bucket2\ncreate file4\ncreate file5";
        System.out.println("The largest bucket is: " + solution(commands));
    }
}
