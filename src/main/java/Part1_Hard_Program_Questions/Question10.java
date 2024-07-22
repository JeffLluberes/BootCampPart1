package Part1_Hard_Program_Questions;

public class Question10 {

    public static void main(String[] args) {
        int adjMat[][] = {
                {0, 2, 0, 4, 0, 0},
                {0, 0, 3, 2, 0, 0},
                {2, 0, 0, 0, 0, 4},
                {0, 0, 0, 0, 2, 0},
                {0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0}};

        int[] distance = new int[adjMat.length];

        int source = 0;

        boolean[] visited = new boolean[adjMat.length];

        distance[source] = 0;

        for (int i = 0; i < adjMat.length; i++) {
            if (i == source) continue;
            distance[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < adjMat.length; i++) {
            int minDistVertex = findMinDistVertex(distance, visited);

            visited[minDistVertex] = true;

            for (int j = 0; j < adjMat.length; j++) {
                if (adjMat[minDistVertex][j] != 0 && visited[j] == false && distance[minDistVertex] != Integer.MAX_VALUE) {
                    int newDist = distance[minDistVertex] + adjMat[minDistVertex][j];
                    if (newDist < distance[j]) {
                        distance[j] = newDist;
                    }
                }
            }
        }

        for (int i = 0; i < adjMat.length; i++) {
            System.out.println("Vertex : " + i + " & Distance from Source : " + distance[i]);
        }
    }

    public static int findMinDistVertex(int[] distance, boolean[] visited) {

        int minVertex = -1;

        for (int i = 0; i < distance.length; i++) {
            if (visited[i] == false && (minVertex == -1 || distance[i] < distance[minVertex])) {
                minVertex = i;
            }
        }
        return minVertex;
    }
}