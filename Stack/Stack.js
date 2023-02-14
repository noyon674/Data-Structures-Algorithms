/////////// Basic Structure of stack
let stack = [];
let initialSize = stack.length;
let max = 5;
let count = 0;
//// Element adding
function push(x){
    if(initialSize < max){
        stack[initialSize] = x;
        console.log('Element added: '+x);
        initialSize += 1;
    }
    else{
        console.log('Ops! There is no space.');
    }
}

//// Element remove from top
function pop(){
    if(initialSize > 0){
        console.log('Element remove from top.');
        initialSize--;
    }
    else{
        console.log('Ops! Empty Stack.')
    }
}

//// Top element showing
function peek(){
    if(initialSize > 0){
        console.log('Top element of Stack: '+stack[initialSize-1]);
    }
    else{
        console.log('Ops! Empty Stack');
    }
}

///////////////// Main function
push(10);
push(20);
push(30);
push(40);
push(50);

peek();
pop();
peek()
push(90)
peek();
console.log(stack);