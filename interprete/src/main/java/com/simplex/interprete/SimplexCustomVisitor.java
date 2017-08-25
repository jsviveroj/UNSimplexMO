
package com.simplex.interprete;

import java.util.*;

public class SimplexCustomVisitor extends SimplexBaseVisitor<Object> {

	ArrayList<String> symbolTableV = new ArrayList<String>();
	ArrayList<String> symbolTableO = new ArrayList<String>();
	ArrayList<String> symbolTableR = new ArrayList<String>();
	ArrayList<String> symbolTableMaxOrMin = new ArrayList<String>();
	ArrayList<String> symbolTableHol = new ArrayList<String>();
	ArrayList<ArrayList> Matrix = new ArrayList<ArrayList>();
	ArrayList<ArrayList<Float>> Matrix1 = new ArrayList<ArrayList<Float>>();
	ArrayList<Object[]> Matrix2 = new ArrayList<Object[]>();
	ArrayList<Float> allZs = new ArrayList<Float>();
	ArrayList<ArrayList<Float>> allVs = new ArrayList<ArrayList<Float>>();
	ArrayList<ArrayList<Float>> allOCoefs = new ArrayList<ArrayList<Float>>();
	ArrayList<Float> minPaymentM = new ArrayList<>();
	ArrayList<Float> differences = new ArrayList<>();
	ArrayList<Float> S = new ArrayList <Float>();
	ArrayList<Float> Z = new ArrayList <Float>();
	ArrayList<Float> G = new ArrayList <Float>();

	@Override
	public String visitVariable(SimplexParser.VariableContext ctx) {
		symbolTableV.add(ctx.ID().getText());
		return null;
	}

	@Override
	public String visitFunc(SimplexParser.FuncContext ctx) {
		symbolTableO.add(ctx.getText());
		// System.out.println(symbolTableO.get(0));
		return null;
	}

	@Override
	public String visitRes(SimplexParser.ResContext ctx) {
		symbolTableR.add(ctx.getText());
		return null;
	}

	@Override
	public String visitObjective(SimplexParser.ObjectiveContext ctx) {
		symbolTableMaxOrMin.add(ctx.getText());
		for (int j = 0; j < symbolTableMaxOrMin.size(); j++) {
			// System.out.println(symbolTableMaxOrMin.get(j));
		}
		return null;
	}

	public String lineA(String line) {
		String answer = "";
		for (int i = 0; i < symbolTableV.size(); i++) {
			if (line.contains(symbolTableV.get(i))) {
				continue;
			} else {
				String[] temp = line.split("=");
				String t1 = temp[1];
				String t2 = "+0";
				line = temp[0] + "=" + t2 + t1;
			}
		}

		if (line.contains(">=")) {

		} else if (line.contains("<=")) {
			String[] temp = line.split("<=");
			temp[0] = temp[0].replaceAll("[a-zA-Z_][a-zA-Z0-9_]*", "&");
			temp[0] = temp[0].replace("+", "?+");
			if (line.indexOf("-") != 0) {
				line = line.replace("-", "?-");
			} else {
				line = "-" + line.substring(1, line.length()).replace("-", "?-");
			}
			String[] temp1 = temp[0].split("[?]");
			for (int i = 0; i < temp1.length; i++) {
				if (temp1[i].matches(".*\\d+.*")) {
					temp1[i] = temp1[i].replace("&", "");
					answer += temp1[i];
				} else {
					temp1[i] = temp1[i].replace("&", "1");
					answer += temp1[i];
				}
			}
			if (symbolTableHol.size() > 0) {
				for (int i = 0; i < symbolTableHol.size(); i++) {
					answer += "+0";
				}
			}
			answer += "+1";
			symbolTableHol.add("1");
			answer += "+" + temp[1];
		} else if (line.contains("=")) {
			String[] temp = line.split("=");
			temp[0] = temp[0].replaceAll("[a-zA-Z_][a-zA-Z0-9_]*", "&");
			temp[0] = temp[0].replace("+", "?+");
			if (line.indexOf("-") != 0) {
				line = line.replace("-", "?-");
			} else {
				line = "-" + line.substring(1, line.length()).replace("-", "?-");
			}
			String[] temp1 = temp[0].split("[?]");
			for (int i = 0; i < temp1.length; i++) {
				if (temp1[i].matches(".*\\d+.*")) {
					temp1[i] = temp1[i].replace("&", "");
					answer += temp1[i];
				} else {
					temp1[i] = temp1[i].replace("&", "1");
					answer += temp1[i];
				}
			}
			if (symbolTableHol.size() > 0) {
				for (int i = 0; i < symbolTableHol.size(); i++) {
					answer += "+0";
				}
			}
			answer += "+1";
			symbolTableHol.add("1");
			answer += "+" + temp[1];
		}
		return answer;
	}

	public String lineO(String line) {
		String answer = "";
		line = line.replaceAll("[a-zA-Z_][a-zA-Z0-9_]*", "&");
		line = line.replace("+", "?+");
		if (line.indexOf("-") != 0) {
			line = line.replace("-", "?-");
		} else {
			line = "-" + line.substring(1, line.length()).replace("-", "?-");
		}
		//System.out.println(line);
		String[] lines = line.split("[?]");
		for (int i = 0; i < lines.length; i++) {
			if (lines[i].matches(".*\\d+.*")) {
				lines[i] = lines[i].replace("&", "");
			} else {
				lines[i] = lines[i].replace("&", "1");
			}
		}
		ArrayList<Float> actualLine = new ArrayList<Float>();
		ArrayList<Float> tempLine = new ArrayList<Float>();
		for (int i = 0; i < lines.length; i++) {
			if (symbolTableMaxOrMin.get(0).equals("maximieren")) {
				actualLine.add(-1 * Float.parseFloat(lines[i]));
			} else {
				actualLine.add(Float.parseFloat(lines[i]));
			}
			tempLine.add(Float.parseFloat(lines[i]));
		}
		allOCoefs.add(tempLine);
		//System.out.println(allOCoefs);
		for (int i = 0; i < symbolTableHol.size() + 1; i++) {
			actualLine.add((float) 0);
		}
		//System.out.println(actualLine);
		Matrix1.add(actualLine);
		return answer;
	}
}
