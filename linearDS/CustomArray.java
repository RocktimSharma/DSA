class MyArray {

  int[] items;
  int currentIndex;

  public MyArray(int size) {
    
    this.items = new int[size];
    this.currentIndex = 0;
  }

  public void insert(int value) {
    if(this.currentIndex==this.items.length){
      int[] temp=new int[this.currentIndex*2];
      for(int i=0;i<currentIndex;i++){
        temp[i]=this.items[i];
      }
      this.items=temp;
    }
    this.items[this.currentIndex] = value;
    this.currentIndex++;
  }

 public void removeAt(int index) {
    if(index>=this.currentIndex) throw new IllegalArgumentException();
    for (int i = index; i < this.currentIndex - 1; i++) {
        this.items[i] = this.items[i + 1];
    }
    this.currentIndex--;
    items[this.currentIndex] = 0;
}


  public int indexof(int value) {
    for (int i = 0; i < this.currentIndex; i++) {
      if (this.items[i] == value) {
        return i;
      }
    }
    return -1;
  }

public void reverse() {
    int i = 0;
    int j = this.currentIndex - 1;
    while (i < j) {
        int tmp = this.items[i];
        this.items[i] = this.items[j];
        this.items[j] = tmp;
        
        i++;  
        j--;  
    }
}


  public String toString() {
    StringBuilder s = new StringBuilder();
    s.append('[');
    for (int i = 0; i < this.currentIndex; i++) {
      s.append(this.items[i]);
      if (i < this.currentIndex - 1) {
        s.append(',');
      }
    }
    s.append(']');
    return s.toString();
  }
}

class CustomArray {

  public static void main(String args[]) {
    MyArray arr = new MyArray(3);
    arr.insert(1);
    arr.insert(2);
    arr.insert(3);
    arr.insert(4);
    arr.insert(7);
    arr.insert(10);
    System.out.println(arr);
    System.out.println(arr.indexof(3));
    System.out.println(arr.indexof(0));
    arr.removeAt(0);
    arr.reverse();
    System.out.println(arr);
  }
}
