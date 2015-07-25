public class Faneuilhall2 {
  
  public static final int SCALE_FACTOR = 10;
  
  public static void top() {
    
    for (int line = 0; line < 1; line++) {
      { for (int i = 0; i < 3*SCALE_FACTOR; i++) {
        System.out.print(" ");
      }
        for (int i = 0; i < SCALE_FACTOR-2; i++) {          
          System.out.print("_");
        }
        System.out.print("^");
        
        for (int i = 0; i < SCALE_FACTOR-2; i++) {
          System.out.print("_");
        }
        System.out.println();
      }
    }
  }
  public static void toproof() {
    for (int line = 1; line <= SCALE_FACTOR; line++) {
      for (int i = 0; i < 3*SCALE_FACTOR - 3*line; i++) {
        System.out.print(" ");
      }
      for (int i = 0; i < 2; i++) {
        System.out.print("_");
      }
      for (int i = 0; i < 1 ; i++) {
        System.out.print("/");
      }
      for (int i = 0; i < 3*line+(SCALE_FACTOR-5); i++) {
        System.out.print(";");
      }
      for (int i = 0; i < 1; i++) {
        System.out.print("|");
      }
      for (int i = 0; i < 3*line+(SCALE_FACTOR-5); i++) {
        System.out.print(";");
      }
      for (int i = 0; i < 1 ; i++) {
        System.out.print("\\");
      } 
      for (int i = 0; i < 2; i++) {
        System.out.print("_");
      }
      System.out.println();     
    }
  }
  
  public static void layerbrick() {
    //base of top
    for (int i = 0; i < (8*SCALE_FACTOR)-3; i++) {
      System.out.print("=");  
    }
    System.out.println();
  }
  
  
  public static void rowone() {
    //start of row 1
    System.out.print("|");
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 2*SCALE_FACTOR-2; j++) {
        System.out.print(".");
      }
      System.out.print("|");
    }
    System.out.println();
  }
  
  
  //start of row 2
  public static void rowtwo() {
    
    System.out.print("|");
    for (int i = 0; i < 4; i++) {
      System.out.print(".");
      System.out.print("+");
      
      for (int j = 0; j < SCALE_FACTOR*2-6; j++) {        
        System.out.print("-");
      }
      System.out.print("+");
      System.out.print(".");
      System.out.print("|");
    }
    System.out.println();
  }   
  //start of row 3 
  public static void rowthree() {
    System.out.print("|");
    for (int i = 0; i < 4; i++) {
      System.out.print(".");
      System.out.print("|");
      
      for (int j = 0; j < SCALE_FACTOR*2-6; j++) {
        System.out.print(" ");
      }
      System.out.print("|");
      System.out.print(".");
      System.out.print("|");
    }
    System.out.println();
  }
  
  public static void rowfour() {
    System.out.print("|");
    System.out.print(".");
    System.out.print("+");   
    for (int i = 0; i < SCALE_FACTOR*2-6; i++) {     
      System.out.print("-");
    }
    System.out.print("+");
    System.out.print(".");
    System.out.print("|");
  }
  public static void rowfive() {
    for (int i = 0; i < SCALE_FACTOR-2; i++) {
      System.out.print(".");
    }
    for (int j = 0; j < SCALE_FACTOR*2+1; j++){
      System.out.print("=");
    }
     for (int k = 0; k < SCALE_FACTOR-2; k++) {
      System.out.print(".");
    }
  }
  
  public static void bottom() {
    for (int i = 0; i < SCALE_FACTOR-1; i++) {
      
      System.out.print("|");
      System.out.print(".");
      System.out.print("|");
      
      for (int z = 0; z < SCALE_FACTOR*2-6; z++) {
        System.out.print(" ");
      }
      
      System.out.print("|");
      System.out.print(".");
      System.out.print("|");
      for (int k = 0; k < SCALE_FACTOR-2; k++) {
        System.out.print(".");
      }
      System.out.print("|");
      for (int l = 0; l < i*-1 + (SCALE_FACTOR-2); l++) {
        System.out.print(" ");
      }
      System.out.print("/");
      for (int m = 0; m < i; m++) {
        System.out.print(" ");
      }
      System.out.print("|");
       for (int n = 0; n < i; n++) {
        System.out.print(" ");
      }
      System.out.print("\\");
      for (int l = 0; l < i*-1 + (SCALE_FACTOR-2); l++) {
        System.out.print(" ");
      }    
      System.out.print("|");   
      for (int k = 0; k < SCALE_FACTOR-2; k++) {
        System.out.print(".");
      }
      System.out.print("|");
      System.out.print(".");
      System.out.print("|");    
      for (int g = 0; g < SCALE_FACTOR*2-6; g++) {
        System.out.print(" ");
      }
      System.out.print("|");
      System.out.print(".");
      System.out.print("|");
      System.out.println();
    }
  }
  public static void main(String[] args) {
    top();
    toproof();
    layerbrick();
    rowone();
    rowtwo();
    rowthree();
    rowthree();
    rowtwo();
    layerbrick();
    rowtwo();
    rowthree();
    rowthree();
    rowtwo();
    rowone();
    layerbrick();
    rowfour();
    rowfive();
    rowfour();
    System.out.println();
    bottom();
    rowfour();
    rowfive();
    rowfour();
    System.out.println();
    layerbrick();
  }
  
}









