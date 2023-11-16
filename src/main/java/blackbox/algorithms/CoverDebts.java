package blackbox.algorithms;

import java.util.ArrayList;
import java.util.List;

public class CoverDebts {

	public double solution(int s, int[] debts, int[] interests) {
		List<Integer> debtList = new ArrayList<>();
		List<Integer> interestList = new ArrayList<>();

		for (int i = 0; i < debts.length; i++) {
			debtList.add(debts[i]);
			interestList.add(interests[i]);
		}

		double remainingAmount = 0;
		double monthlyBudget = s * 0.1;
		double monthlyCost = 0;

		for (int month = 0; month < 12; month++) {
			remainingAmount = 0;
			monthlyCost = 0;

			for (int i = 0; i < debtList.size(); i++) {
				int debt = debtList.get(i);
				int interest = interestList.get(i);

				if (debt > 0) {
					int monthlyPayment = (int) Math.min(monthlyBudget, debt);
					debt -= monthlyPayment;
					monthlyCost += monthlyPayment;

					if (debt > 0) {
						remainingAmount += debt * (interest / 100.0);
					}
				}
			}

			if (remainingAmount == 0) {
				break;
			}

			debtList = updateDebts(debtList, remainingAmount);
			monthlyCost += remainingAmount;
		}

		return monthlyCost;
	}

	private List<Integer> updateDebts(List<Integer> debtList, double remainingAmount) {
		List<Integer> updatedDebtList = new ArrayList<>();

		for (int debt : debtList) {
			updatedDebtList.add((int) Math.round(debt + debt * (remainingAmount / 100.0)));
		}

		return updatedDebtList;
	}
}
