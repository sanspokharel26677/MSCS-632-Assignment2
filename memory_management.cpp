#include <iostream>

void allocateMemory() {
    int* numbers = new int[5];  // Dynamically allocate array

    // Fill the array with values
    for (int i = 0; i < 5; ++i) {
        numbers[i] = i + 1;
    }

    std::cout << "Numbers before deallocation: ";
    for (int i = 0; i < 5; ++i) {
        std::cout << numbers[i] << " ";
    }
    std::cout << std::endl;

    // Manually deallocate memory
    delete[] numbers;
}

int main() {
    allocateMemory();
    return 0;
}

