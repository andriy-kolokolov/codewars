function XO(str) {
	let xCounter = 0;
	let oCounter = 0;
	
	for (let i = 0; i < str.length; i++) {
		str[i].toLowerCase() === 'x' ? xCounter++ : str[i].toLowerCase() === 'o' ? oCounter++ : null;
	}
	return xCounter === oCounter;
}

console.log(XO('xxooo'))