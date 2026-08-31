class Buckets{
   private List<Integer> container;
   public Buckets()
   {
    this.container=new LinkedList<Integer>();
   }
   public void add(Integer val)
   {
    int index=this.container.indexOf(val);
    if(index==-1)
     this.container.addFirst(val);
   }
   public void remove(Integer val)
   {
    this.container.remove(val);
   }
   public  boolean contains(Integer val)
   {
    int index=this.container.indexOf(val);
    return index!=-1;
   }
}
class MyHashSet {
   int n=756;
   Buckets[]bucket;
   public int hashfunction(int Key)
   {
    return Key%n;
   }
    public MyHashSet() {
        this.bucket=new Buckets[this.n];

        for(int i=0;i<n;i++)
        {
        this.bucket[i]=new Buckets();
        }
    } 
    public void add(int key) {
        int bi=this.hashfunction(key);
        this.bucket[bi].add(key);
        
    }
    
    public void remove(int key) {
         int bi=this.hashfunction(key);
        this.bucket[bi].remove(key);
        
    }
    
    public boolean contains(int key) {
        int bi=this.hashfunction(key);
       return this.bucket[bi].contains(key);
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */