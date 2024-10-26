#include <stdio.h>

int main() {
	int numbers;
	scanf("%d", &numbers);

	for (int i = 1; i <= 9; i++) {
		printf("%d * %d = %d\n",numbers ,i, numbers * i);
	}
	return 0;
}