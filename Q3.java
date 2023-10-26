
/**
 * Q3 : The following even sized array shows on and off times of an electric
vehicle alternately on a particular day in 24 hour format: (850 means
8:50AM, 1330 means 1:30PM)
int[] ev = {850,945,1145,1155,1230,1245,1330,1340,1425,1445};
Calculate the running time of the electric vehicle.
Expected output: 1 hr 50 min

Note: In the above array: 850 is the In-Time, 945 is the Out-Time, 1145 is the In-
Time, 1155 is the Out-Time and so on ...
 */
class Q3 {
public static void main(String[] args) {
    int[] ev = {850,945,1145,1155,1230,1245,1330,1340,1425,1445};
    int hr = 0;
    int min = 00;
    int hrout = 0;
    int minout = 00;
    int total = 00;
    for (int i = 0; i < ev.length; i+=2) {
            int t = ev[i];
            //in
            int tout = ev[i+1];    
            //out        
            int inhr = t/100;
            int inmin = t%100;
            int outhr = tout/100;
            int outmin = tout%100;
            int mini = inhr * 60+inmin;
            int outmini = outhr *60+outmin;
        total+= (outmini-mini);       
    }
    int hri = total/60;
    int mini = total%60;
    System.out.println("time : "+hri+":"+mini);
}
    
}