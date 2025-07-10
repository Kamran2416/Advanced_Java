import java.util.*;

//class to return multiple arrays from dijkstra function 
class DistanceAndPred {
    int[] distance;
    int[] pred;

    public DistanceAndPred(int[] distance, int[] pred) {
        this.distance = distance;
        this.pred = pred;
    }
}

class DijkstraMap {
    public static Scanner sc = new Scanner(System.in);
    static final int infinity = 9999;

    static DistanceAndPred dijkstra(int graph[][], int start) {
        // variable declaration
        int n = graph.length;
        int[][] cost = new int[n][n];
        int[] distance = new int[n];
        int[] pred = new int[n];
        boolean[] visited = new boolean[n];
        int count, mindistance, nextnode = -1;

        // creating the cost matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j] == 0)
                    cost[i][j] = infinity;
                else
                    cost[i][j] = graph[i][j];
            }
        }

        // initialization
        for (int i = 0; i < n; i++) {
            distance[i] = cost[start][i];
            pred[i] = start;
            visited[i] = false;
        }

        // distance of the starting location from the map
        distance[start] = 0;
        // mark the start location as visited
        visited[start] = true;
        count = 1;

        // loop to visit all the locations in the map and calculate minimum distance
        while (count < n) {

            mindistance = infinity;
            // selecting the location which is at minimum distance and not visited yet
            for (int i = 0; i < n; i++) {
                if (!visited[i] && distance[i] < mindistance) {
                    mindistance = distance[i];
                    nextnode = i;
                }
            }

            // mark that location as visited
            visited[nextnode] = true;

            // check for the locations at minimum distances from the selected location
            // which are not visited yet
            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    // if the calculated distance from the selected location is less than the
                    // current distance
                    if (mindistance + cost[nextnode][i] < distance[i]) {
                        // assign that distance to current location
                        distance[i] = mindistance + cost[nextnode][i];
                        pred[i] = nextnode;
                    }
                }
            }
            count++;
        }
        DistanceAndPred distanceAndPred = new DistanceAndPred(distance, pred);
        return distanceAndPred;
    }

    // function to print distance
    static void printDistance(Map<Integer, String> map, int[] distance, int[] pred, int start) {
        for (int i = 0; i < distance.length; i++)
            if (i != start) {
                // printing the minimum distance
                System.out.println("\nMinimum Distance from " + map.get(start) + " to " + map.get(i) + " is "
                        + distance[i] + "KM.");

                // printinf the path
                StringBuffer str = new StringBuffer();
                str.append(" --> " + map.get(i));
                calcPath(map, pred, i, start, str);
                System.out.println("Path: " + str);
            }
    }

    // recursive function to calculate the path
    static int calcPath(Map<Integer, String> map, int[] pred, int i, int start, StringBuffer str) {
        // if the given location's pre-location is not start
        if (pred[i] != start) {
            // then insert it in the front of string and pass it to the function again for
            // same process of finding its pre-location
            str.insert(0, " --> " + map.get(pred[i]));
            return calcPath(map, pred, pred[i], start, str);
        } else {
            // else if pre-location is start, insert start and return the termination
            // condition
            str.insert(0, map.get(start));
            return start;
        }
    }

    // main function
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "Home");
        map.put(1, "Restaurant");
        map.put(2, "Hospital");
        map.put(3, "Park");
        map.put(4, "University");
        map.put(5, "School");
        map.put(6, "Market");
        map.put(7, "College");
        int graph[][] = new int[][] { { 0, 0, 1, 2, 0, 0, 0,0 },
                { 0, 0, 2, 0, 0, 3, 0,3 },
                { 1, 2, 0, 1, 3, 0, 0,0 },
                { 2, 0, 1, 0, 0, 0, 1,0 },
                { 0, 0, 3, 0, 0, 2, 0,0 },
                { 0, 3, 0, 0, 2, 0, 1,0 },
                { 0, 0, 0, 1, 0, 1, 0, 2 },
                { 1, 0, 0, 3, 1, 0, 0, 0 }};

        int start = 0;
        DistanceAndPred distanceAndPred = dijkstra(graph, start);
        printDistance(map, distanceAndPred.distance, distanceAndPred.pred, start);
    }
}
