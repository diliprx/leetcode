class Solution {
    public double angleClock(int hour, int minutes) {
        double a=6.0*minutes;
        double h=30.0*(hour%12)+0.5*minutes;
        double d=Math.abs(h-a);
        return Math.min(d,360.0-d);
    }
}