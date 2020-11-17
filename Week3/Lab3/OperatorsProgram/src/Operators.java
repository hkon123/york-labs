import java.util.ArrayList;

public class Operators {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		String operator = new String();
		String line = new String("");
		int sum = 0;
		
		for (int i = 0; i<args.length; i++) {
			try {
				numbers.add(Integer.parseInt(args[i]));
			}
			catch (Exception e) {
				switch(args[i].toLowerCase()) {
				case "add":
					operator = "+";
					break;
				case "subtract":
					operator = "-";
					break;
				case "multiply":
					operator = "*";
					break;
				case "divide":
					operator = "/";
					break;
				default:
					break;
			}
			continue;	
		}
		}
		
		
		switch(operator) {
		case "+":
			for(int j=0;j<numbers.size();j++) {
				sum+=numbers.get(j);
				line = line.concat(numbers.get(j).toString());
				if (j!=numbers.size()-1) {
					line = line.concat(operator);
				}
				else {
					line = line.concat("=");
				}
			}
			break;
		case "-":
			for(int j=0;j<numbers.size();j++) {
				sum-=numbers.get(j);
				line = line.concat(numbers.get(j).toString());
				if (j!=numbers.size()-1) {
					line = line.concat(operator);
				}
				else {
					line = line.concat("=");
				}
			}
			break;
		case "*":
			sum=1;
			for(int j=0;j<numbers.size();j++) {
				sum*=numbers.get(j);
				line = line.concat(numbers.get(j).toString());
				if (j!=numbers.size()-1) {
					line = line.concat(operator);
				}
				else {
					line = line.concat("=");
				}
			}
			break;
		case "/":
			sum = numbers.get(0);
			line = line.concat(numbers.get(0).toString() + "/");
			for(int j=1;j<numbers.size();j++) {
				sum/=numbers.get(j);
				line = line.concat(numbers.get(j).toString());
				if (j!=numbers.size()-1) {
					line = line.concat(operator);
				}
				else {
					line = line.concat("=");
				}
			}
			break;
		default:
			line = line.concat("Use a valid operator");
		}
		
		line = line.concat(Integer.toString(sum));
		
		System.out.println(line);
	}

}
