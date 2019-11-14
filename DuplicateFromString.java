static void duplicate(String str){
    HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
    
    char[] carray=str.toCharArray();
    for(Character c:carray)
    {
        if(hm.containsKey(c))
        {
            hm.put(c,hm.get(c)+1);
                }
                else{
                    hm.put(c,1);
                }
    }
    
    Set<Character> s=hm.keySet();
    System.out.println("dulpicate "+ str);
    for(Character c:s)

        if(hm.get(c)>1)
        {
            System.out.println(c+"---"+hm.get(c));
        }
         else{
             System.out.println("print----no duplicate");
         }
    
    
    }