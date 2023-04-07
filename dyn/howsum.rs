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
        let ret = self.how_sum(self.t.clone(), &self.a.clone());
        println!("{:?}", self.map);
        ret
    }
    fn how_sum(&mut self, t: isize, a: &Vec<isize>) -> Option<Vec<isize>> {
        if t == 0 { return Some(Vec::new()); }
        if t < 0 { return None; }
        let f = self.map.get(&t);
        if f.is_some() {
            return f.unwrap().clone();
        }
        for el in a {
            let ret = self.how_sum(t - el, &a);
            if ret.is_some() {
                let mut ret = ret.unwrap();
                ret.push(*el);
                self.map.insert(t, Some(ret.clone()));
                return Some(ret);
            }
        }
        self.map.insert(t, None);
        None
    }
}

fn main() {
    println!("{:?}", Outer::new(7, vec![2, 3]).out()); // [3, 2, 2]
    println!("{:?}", Outer::new(7, vec![5, 3, 4, 7]).out()); // [4, 3]
    println!("{:?}", Outer::new(7, vec![2, 4]).out()); // None
    println!("{:?}", Outer::new(8, vec![2, 3, 5]).out()); // [2, 2, 2, 2]
    println!("{:?}", Outer::new(300, vec![7, 14]).out()); // None
}
