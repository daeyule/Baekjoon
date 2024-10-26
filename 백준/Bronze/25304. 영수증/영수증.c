#include <stdio.h>

int main() {
	int sum, V_numbers ,price , P_numbers, S_cal = 0 ;
	scanf("%d\n", &sum);
	scanf("%d\n", &V_numbers);

	for (int i = 1; i <= V_numbers; i++) {
		scanf("%d %d", &price, &P_numbers);
		S_cal += (price * P_numbers);
	}
	if (S_cal == sum) {
		printf("Yes");
	}
	else
		printf("No");
}