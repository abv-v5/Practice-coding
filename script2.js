async function hello(){
    return "hello";
}

const result = hello();

result.then((message) =>{
    console.log(message);
});
