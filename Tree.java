class Tree{
  
  private String name;
  private String type;
  private boolean fall;
  private String color;
 
  Tree(){
    treeName = "";
    treeType = "";
    leavesFall = false;
    leafColor = "";
  }

  
  Tree(String theName, String theType, boolean leavesFall, String leafColor) {
		name = treeName;
    type = treeType;
    fall = leavesFall;
    color = leafColor;
	}


  
  String getName() {
		return name;
	}

  String getType(){
    return type;
  }

  boolean getFall(){
    return fall;
  }

  String getColor(){
    return color;
  }


  
  void setName(String treeName) {
		name = treeName;
	}

  void setType(String treeType) {
		type = treeType;
	}

  void setFall(boolean leavesFall){
    fall = leavesFall;
  }
  
  void setColor(String treeColor){
    color = leafColor;
  }


		
	}