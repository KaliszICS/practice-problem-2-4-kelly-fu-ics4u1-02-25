public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static void selectionSortName(String[] names, int[] ages){
		for (int i = 0; i<names.length; i++){
			names[i] = names[i].toLowerCase();
		}
		for (int i = 0; i<names.length -1; i++){
			//find the min
			int indexOfMin = i;
			for (int j = i + 1; j <names.length; j++){
				if (names[j].compareTo(names[indexOfMin])<0){
					indexOfMin = j;
				}
			}
			String tempName = names[i];
			names[i] = names[indexOfMin];
			names[indexOfMin] = tempName;
			int tempAges = ages[i];
			ages[i] = ages[indexOfMin];
			ages[indexOfMin] = tempAges;
		}
	}


	public static void selectionSortAge(String[] names, int[] ages){
		for (int i = 0; i<names.length -1; i++){
			//find the min
			int indexOfMin = i;
			for (int j = i + 1; j <names.length; j++){
				if (names[j].compareTo(names[indexOfMin])<0){
					indexOfMin = j;
				}
			}
			String tempName = names[i];
			names[i] = names[indexOfMin];
			names[indexOfMin] = tempName;
			int tempAges = ages[i];
			ages[i] = ages[indexOfMin];
			ages[indexOfMin] = tempAges;
		}
	}

	

}
