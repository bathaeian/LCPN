fun substringAll(s1, s2 )=
   let
     val l1 = size s1;
     val l2 = size s2;

     fun substringat( s1 ,s2 ,i) =
       if l1 + i > l2 then false
       else substring (s2, i, l1) = s1;

     fun substringfrom( s1 ,s2, i) =
       if i < 0 then false
       else if substringat(s1 ,s2 ,i) then true
       else substringfrom( s1 ,s2 ,i - 1);
   in
     substringfrom( s1,s2,l2 - 1)
   end;
   
val hm= ListHomeMarkings();
fun isStartScan(n)=(substringAll( "r1:1 1`true",(NodeDescriptor n))) orelse 
            (substringAll("rp1:1 1`true", (NodeDescriptor n)));
fun findStartScan(nil)=[]
    |findStartScan(x::y)=if isStartScan(x) then x::findStartScan(y) else findStartScan(y);
val ss= findStartScan(hm);

st_Mark.t'r1 1 10

