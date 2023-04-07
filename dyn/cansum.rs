use std::collections::HashMap as Map;

struct Outer {
    t: isize,
    a: Vec<isize>,
    map: Map<isize, bool>,
}

impl Outer {
    fn new(t: isize, a: Vec<isize>) -> Self {
        Self {
            t, a,
            map: Map::new()
        }
    }
    fn out(&mut self) -> bool {
        let ret = self.can_sum(self.t.clone(), &self.a.clone());
        println!("{:?}", self.map);
        ret
    }
    fn can_sum(&mut self, t: isize, a: &Vec<isize>) -> bool {
        if t == 0 { return true; }
        if t < 0 { return false; }
        let f = self.map.get(&t);
        if f.is_some() {
            return *f.unwrap();
        }
        for el in a {
            if self.can_sum(t - el, &a) {
                self.map.insert(t, true);
                return true;
            }
        }
        self.map.insert(t, false);
        false
    }
}

fn main() {
    println!("{:?}", Outer::new(7, vec![2, 3]).out()); // t
    println!("{:?}", Outer::new(7, vec![5, 3, 4, 7]).out()); // t
    println!("{:?}", Outer::new(7, vec![2, 4]).out()); // f
    println!("{:?}", Outer::new(8, vec![2, 3, 5]).out()); // t
    println!("{:?}", Outer::new(300, vec![7, 14]).out()); // f
}
