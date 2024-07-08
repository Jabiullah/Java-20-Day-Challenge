package hash_week_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class hashMapImplementation {
    // Important Question
    // Array of Linked List.

    // Lambda = (#no. of nodes/ #no. of buckets)
    // Lambda <= k (Which is threshold value)

    // Usually put() function T.C =  O(Lambda)

    // ***
    // if #no. of nodes increasing one by one and is greater than to k.
    // Here it occurs Lambda > K
    // If lambda increase then we have increasing time complexity.
    // Here comes 'Rehashing'
    // So we have to increase the bucked size
    
    static class HashMap<K,V>{ // Here K, V is generics. Usually Generics can be any data Type.
        public class Node{
            K key;
            V value;
            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n; // 'n' is our #no. of nodes
        private int N; // 'N' is our #no. of buckets

        // This the hashMap
        private LinkedList<Node> buckets[]; // Buckets Array

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i =0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
                //      Why empty linked list created ?
                // Ans: If there is no empty linked List then
                // we can not insert data into the nodes at all.
            }
        }

        //
        private int hashFunction(K key){
            int bucketIndex = Math.abs(key.hashCode()) % N;
            return bucketIndex;
        }
        // Data Index
        private int SearchInLL(K key, int bucketIndex){
            LinkedList<Node> ll = buckets[bucketIndex];

            for(int i =0; i<ll.size(); i++){
                if(ll.get(i).key==key){
                    return i; // data Index
                }
            }
            return -1;
        }
        // ReHash
        private void ReHash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2]; //SIZE increase

            for(int i =0; i<N*2; i++){ // New LL
                buckets[i] = new LinkedList<>();
            }

            for(int i =0; i<oldBucket.length;i++){
                LinkedList<Node> ll = oldBucket[i];

                for (int j =0; j< ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }

        }

        public void put(K key, V value){
            int bucketIndex  = hashFunction(key);
            int dataIndex = SearchInLL(key,bucketIndex);
            if(dataIndex==-1){ // key does not exist
                System.out.println("Data Added "+key+" - "+value);
                buckets[bucketIndex].add(new Node(key,value));
                n++;

            }else { // key exist.
                //Update code
                Node node = buckets[bucketIndex].get(dataIndex);
                node.value = value;
            }

            double lambda = (double) n/N;
            if(lambda>2.0){
                ReHash();
            }

        }

        public boolean containsKey(K key){
            int bucketIndex  = hashFunction(key);
            int dataIndex = SearchInLL(key,bucketIndex);

            if(dataIndex==-1){ // key does not exist
                return false;
            }else { // key exist.
                return true;
            }
        }

        public V remove(K key){
            int bucketIndex  = hashFunction(key);
            int dataIndex = SearchInLL(key,bucketIndex);

            if(dataIndex==-1){ // key does not exist
                return null;
            }else { // key exist.
                Node node = buckets[bucketIndex].remove(dataIndex);
                return node.value;
            }
        }

        public V get(K key){
            int bucketIndex  = hashFunction(key);
            int dataIndex = SearchInLL(key,bucketIndex);

            if(dataIndex==-1){ // key does not exist
                return null;
            }else { // key exist.
                Node node = buckets[bucketIndex].get(dataIndex);
                return node.value;
            }

        }

        public ArrayList<String> keySet(){
            ArrayList<String> keys = new ArrayList<>();

            for(int i =0; i<buckets.length;i++){ // bucket Index
                LinkedList<Node> ll = buckets[i];
                for(int j =0; j< ll.size(); j++){// data Index
                    Node node = ll.get(j);

                    keys.add(node.key+" - "+node.value); // Keys arraylist data input
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n==0; // if there is no node (No pair)
        }


    }
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("BD", 100);
        hm.put("AFG", 100);
        hm.put("SAUDI", 100);
        hm.put("IRAN", 100);

        System.out.println(hm.keySet());

        System.out.println("SAUDI Removed => "+hm.remove("SAUDI"));

        System.out.println(hm.keySet());

        // Top 4 Questions on HASH_MAP
        // 1. Majority Element
        // 2. Union of two Arrays.
        // 3. Find Itinerary from Tickets.
        // 4. Sub-array sum equal to K

    }
}
