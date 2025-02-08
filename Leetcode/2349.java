class NumberContainers {
    Map<Integer, Integer> indexMap;
    Map<Integer, TreeSet<Integer>> numberMap;

    public NumberContainers() {
        indexMap = new HashMap<>();
        numberMap = new HashMap<>();
    }
    
    public void change(int index, int number) {
        if(indexMap.containsKey(index)){
            int oldNumber = indexMap.get(index);
            numberMap.get(oldNumber).remove(index);
            if(numberMap.get(oldNumber).isEmpty()){
                numberMap.remove(oldNumber);
            }
        }
        indexMap.put(index, number);
        numberMap.computeIfAbsent(number, k -> new TreeSet<>()).add(index);
    }
    
    public int find(int number) {
        if(!numberMap.containsKey(number)){
            return -1;
        }
        return numberMap.get(number).first();
    }
}