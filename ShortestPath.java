public class ShortestPath{
    public static float findPath(String path){
    int x=0,y=0;
    for(int i =0;i<path.length();i++){
        char dir = path.charAt(i);
        if(dir=='E'){
            x++;
        }
        else if(dir=='W'){
            x--;
        }
        else if(dir=='N'){
            y++;
        }
         else{
            y--;
        }
    }
    int X2 = x*x;                                             //X2 : (x2-x1)^2 {where x1 =0} so,x^2
    int Y2 =y*y;
    return (float)Math.sqrt(X2 + Y2);                        //this is sqrt((x2-x1)^2 + (y2-y1)^2) dist. formula
    }
    public static void main(String[] args){
        String path = "WNEENESENNN";
        System.out.println("the shortest path is: " + findPath(path));
    }
}