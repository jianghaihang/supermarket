var series = [{
    // 地图数据列
    type: 'map',
    mapData: Highcharts.maps["cn/china"],
    joinBy: 'hc-key',
    name: '随机数据',
    states: {
        hover: {
            color: '#a4edba'
        }
    },
    showInLegend: false
}],
    lastLevel = null;
// 中国城市分布数据
// https://data.jianshukeji.com/geochina/cities.json
// 这里用 JSONP 跨域访问
$.getJSON('https://data.jianshukeji.com/jsonp?filename=geochina/cities.json&callback=?', function(data) {
    for(var name in data) {
        var d = data[name];
        if(d.level.level !== lastLevel) {
            series.push({
                name: d.level.name,
                visible: series.length < 4,
                data: []
            });
            lastLevel = d.level.level;
        }
        series[series.length -1].data.push({
            name: name,
            properties: d,
            x: d.x,
            y: -d.y
        });
    }
    for(var i=1;i<series.length;i++) {
        series[i].name += '（' + series[i].data.length + ' 个）';
    }
    // return false;
    var map = new Highcharts.Map('container', {
        chart: {
            type: 'mappoint'
        },
        title: {
            text: '中国城市分布'
        },
        subtitle: {
            text: '城市排名来源：<a href="https://mp.weixin.qq.com/s?src=3&timestamp=1499825981&ver=1&signature=HLumD31p7Ox5k-9UJUYn4X4j-aO3JXNNu7ATNqIRAVPg-cKDgji9qBPq58t0z56fdvPBPL1IE8-k-bfTY*5SQQbIgCdN0mCXzpVTYk5OEGGXUpL0-CE-F3uBoQQdP0uyNz-d9*dpTz0GByvgq8x8zdCBQs4ZwyP*mgEB54AFT6I=">人民日报</a>'
        },
        mapNavigation: {
            enabled: true,
            buttonOptions: {
                verticalAlign: 'bottom'
            }
        },
        legend: {
            layout: 'vertical',
            align: 'left',
            floating: true,
            x: 30
        },
        tooltip: {
            useHTML: true,
            headerFormat: '<small>{point.key}</small><table>',
            pointFormat: '<tr><td>城市级别</td><td>{series.name}</td></tr>' 	+
            '<tr><td>所属省份</td><td>{point.properties.province}</td></tr>' + 
            '<tr><td>经纬度</td><td>({point.properties.lon:.2f}, {point.properties.lat:.2f})</td></tr>' + 
            '<tr><td>城市编号</td><td>{point.properties.cityNo}</td></tr>',
            footerFormat: '</table>',
        },
        plotOptions: {
            series: {
                dataLabels: {
                    enabled: false
                },
                marker: {
                    radius: 3
                }
            }
        },
        series: series
    });
});
