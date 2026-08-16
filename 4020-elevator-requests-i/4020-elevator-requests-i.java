class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int curr=0;
        int total=0;

        for (int floor:requests){
            total += Math.abs(floor-curr);
            curr=floor;
        }
        return total;
    }
}