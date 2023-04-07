struct Outer {
    mem: Vec<usize>,
    n: usize,
}

impl Outer {
    fn new(n: usize) -> Self {
        Self {
            mem: vec![0; n - 2],
            n: n,
        }
    }
    fn out(&mut self) -> usize {
        let ret = self.fib(self.n);
        // println!("{:?}: {:?}", self.n, self.mem);
        ret
    }
    fn fib(&mut self, n: usize) -> usize {
        if n <= 2 {
            return 1;
        }
        if self.mem[n - 3] != 0 {
            return self.mem[n - 3];
        }
        self.mem[n - 3] = self.fib(n - 1) + self.fib(n - 2);
        self.mem[n - 3]
    }
}

fn main() {
    // println!("{:?}", Outer::new(5).out());
    // println!("{:?}", Outer::new(8).out());
    // println!("{:?}", Outer::new(10).out());
    // println!("{:?}", Outer::new(50).out());
    Outer::new(63).out();
}
