
const OPTIONS = {
	ROCK: 'rock',
	PAPER: 'paper',
	SCISSORS: 'scissors'
}

const getWinner = (player) => {
	return `Player ${player} won!`
}

const rps = (p1, p2) => {
	switch (p1) {
		case OPTIONS.ROCK: {
			return p2 === OPTIONS.SCISSORS
				? getWinner(1)
				: p2 === OPTIONS.PAPER
					? getWinner(2)
					: p2 === OPTIONS.ROCK
						? "Draw"
						: "Wrong Input";
		}
		case OPTIONS.PAPER: {
			return p2 === OPTIONS.ROCK
				? getWinner(1)
				: p2 === OPTIONS.SCISSORS
					? getWinner(2)
					: p2 === OPTIONS.PAPER
						? "Draw"
						: "Wrong Input";
		}
		case OPTIONS.SCISSORS: {
			return p2 === OPTIONS.PAPER
				? getWinner(1)
				: p2 === OPTIONS.ROCK
					? getWinner(2)
					: p2 === OPTIONS.SCISSORS
						? "Draw"
						: "Wrong Input";
		}
	}
};

console.log(rps(OPTIONS.PAPER, OPTIONS.PAPER))