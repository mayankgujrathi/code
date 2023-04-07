use std::collections::HashMap as Map;

struct Outer {
    map: Map<(usize, usize), usize>,
    n: usize,
    m: usize,
}

impl Outer {
    fn new(n: usize, m: usize) -> Self {
        Self {
            map: Map::new(),
            n, m
        }
    }
    fn out(&mut self) -> usize {
        let ret = self.gt(self.n, self.m);
        // println!("{:?}", self.map);
        ret
    }
    fn gt(&mut self, n: usize, m: usize) -> usize {
        if n == 0 || m == 0 { return 0; }
        if n == 1 && m == 1 { return 1; }
        let f1 = self.map.get(&(n, m));
        let f2 = self.map.get(&(m, n));
        if f1.is_some() { return *f1.unwrap(); }
        if f2.is_some() { return *f2.unwrap(); }
        let ret = self.gt(n - 1, m) + self.gt(n, m - 1);
        self.map.insert((n, m), ret);
        ret
    }
}

fn main() {
    let (n, m) = (8, 8);
    // println!("{:?}", Outer::new(n, m).out());
    Outer::new(n, m).out();
}
