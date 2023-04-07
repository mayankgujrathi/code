use std::{rc::Rc, cell::RefCell};

#[derive(Debug)]
struct Node<T> {
    val: T,
    left: Option<Rc<RefCell<Node<T>>>>,
    right: Option<Rc<RefCell<Node<T>>>>,
}

fn main() {
    let r = Node { val: 1, left: None, right: None };
    println!("{r:?}");
}
