use std::collections::HashMap as Map;

struct Outer {
    t: isize,
    a: Vec<isize>,
    map: Map<isize, Option<Vec<isize>>>
}

impl Outer {
    fn new(t: isize, a: Vec<isize>) -> Self {
        Self {
            t, a,
            map: Map::new(),
        }
    }
    fn out(&mut self) -> Option<Vec<isize>> {
        let ret = self.best_sum(self.t.clone(), &self.a.clone());
        println!("{:?}", self.map);
        ret
    }
    fn best_sum(&mut self, t: isize, a: &Vec<isize>) -> Option<Vec<isize>> {
        if t == 0 { return Some(Vec::new()); }
        if t < 0 { return None; }
        let f = self.map.get(&t);
        if f.is_some() { return f.unwrap().clone(); }
        let mut ret: Option<Vec<isize>> = None;
        for el in a {
            let comb = self.best_sum(t - el, &a);
            if comb.is_some() {
                let mut comb = comb.unwrap();
                comb.push(*el);
                if ret.is_none() || ret.as_ref().unwrap().len() > comb.len() {
                    ret = Some(comb);
                }
            }
        }
        self.map.insert(t, ret.clone());
        ret
    }
}

fn main() {
    // println!("{:?}", Outer::new(7, vec![5, 3, 4, 7]).out()); // [7]
    // println!("{:?}", Outer::new(8, vec![2, 3, 5]).out()); // [3, 5]
    // println!("{:?}", Outer::new(8, vec![1, 4, 5]).out()); // [4, 4]
    println!("{:?}", Outer::new(100, vec![1, 2, 5, 25]).out()); // [25, 25, 25, 25]
}
