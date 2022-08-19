fun substringat( s1 ,s2 ,i) =
       if String.size(s1) + i > String.size(s2) then false
       else substring (s2, i, String.size(s1)) = s1;
fun substringfrom( s1 ,s2, i) =
       if i < 0 then false
       else if substringat(s1 ,s2 ,i) then true
       else substringfrom( s1 ,s2 ,i - 1);
fun substringAll(s1, s2 )=
        substringfrom( s1,s2,String.size(s2) - 1);
   
val hm= ListHomeMarkings();
val start1="r1 1: 1`true";
val start2="r1p 1: 1`true";
fun isStartScan(n)=(substringAll(start1 ,(NodeDescriptor n))) orelse 
            (substringAll(start2, (NodeDescriptor n)));
fun findStartScan(nil)=[]
    |findStartScan(x::y)=if isStartScan(x) then x::findStartScan(y) else findStartScan(y);
val ss= findStartScan(hm);
fun races(nil,p1,p2)=[]
  | races(x::y,p1,p2)=if(substringAll(p1^" 1: 1`true" ,(NodeDescriptor x))
                      andalso substringAll(p2^" 1: 1`true" ,(NodeDescriptor x))
                      ) orelse 
            (substringAll(p1^" 1: 1`false" ,(NodeDescriptor x))
                      andalso substringAll(p2^" 1: 1`false" ,(NodeDescriptor x))
                      ) then x::races(y,p1,p2)
   else races(y,p1,p2);
   
   val racevars=races(ss,"Y_y3", "Yp_y3");

