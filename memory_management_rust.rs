fn allocate_vector() {
    let mut numbers = vec![1, 2, 3, 4, 5];  // Vector dynamically allocated
    println!("Numbers before modification: {:?}", numbers);

    modify_vector(&mut numbers);  // Borrowing the vector mutably
    println!("Numbers after modification: {:?}", numbers);
}

fn modify_vector(nums: &mut Vec<i32>) {
    nums.push(6);  // Ownership is not transferred; nums is borrowed and modified
}

fn main() {
    allocate_vector();  // Ownership is returned to main after execution
}

