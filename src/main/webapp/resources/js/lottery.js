var lottery = {
	index : 1, // 起点
	speed : 400, // 初始速度
	roll : 0, // 定时器id
	cycle : 1, // 已跑的圈速
	times : 3, // 至少跑几圈
	prize : -1, // 中奖索引
	btn : 0,
	run : function() {
		var before = lottery.index == 1 ? 8 : lottery.index - 1;
		//var after = lottery.index == 8 ? 1 : lottery.index + 1;
		$(".roll-" + lottery.index).addClass("active");
		$(".roll-" + before).removeClass("active");

		// 初步加快的过程
		lottery.upSpeed();
		lottery.downSpeed();
		lottery.index += 1;
		lottery.index = lottery.index == 9 ? 1 : lottery.index;
	},
	// 提速
	upSpeed : function() {
		if (lottery.cycle < 2 && lottery.speed > 100) {
			lottery.speed -= lottery.index * 8;
			lottery.stop();
			lottery.start();
		}
	},
	// 降速
	downSpeed : function() {
		if (lottery.index == 8) {
			lottery.cycle += 1;
		}
		if (lottery.cycle > lottery.times - 1 && lottery.speed < 400) {
			lottery.speed += 20;
			lottery.stop();
			lottery.start();
		}

		if (lottery.cycle > lottery.times && lottery.index == lottery.prize) {
			lottery.stop();
			lottery.showPrize();

		}

	},
	// 先停止再显示结果 按钮显示出来
	showPrize : function() {

		setTimeout(function() {
			layer.alert('恭喜中奖，奖品为：' + $("#roll-" + lottery.prize).html(), {icon: 1});
			lottery.btn.show();
		}, 700);
	},

	// 重新开始
	reset : function(data) {
		lottery.btn = $(this);
		lottery.btn.hide();
		lottery.speed = 400;
		lottery.cycle = 0;
		lottery.prize = data;
		lottery.run();
	},
	start : function() {
		lottery.roll = setInterval(lottery.run, lottery.speed);
	},

	stop : function() {
		clearInterval(lottery.roll);
	}
}