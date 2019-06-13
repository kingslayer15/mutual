
$(function () {
    $.ajax({
        url: "/admin/getEchartsData",
        type: "GET",
        contentType: "application/json",
        success: function (data) {


            var myChart = echarts.init(document.getElementById('main'));

            option = {
                title: {
                    text: ''
                },
                tooltip: {
                    trigger: 'axis',
                    axisPointer: {
                        type: 'cross',
                        label: {
                            backgroundColor: '#6a7985'
                        }
                    }
                },
                legend: {
                    data: ['销量']
                },
                toolbox: {
                    feature: {
                        saveAsImage: {}
                    }
                },
                grid: {
                    left: '3%',
                    right: '4%',
                    bottom: '3%',
                    containLabel: true
                },
                xAxis: {
                    type: 'category',
                    boundaryGap: false,
                    data: data.date
                },
                yAxis: {
                    type: 'value'
                },
                series: [{
                    name: "OrderCount",
                    data: data.count,
                    type: 'line',
                    smooth: true
                },

                    // {
                    //     name:"OrderAmount",
                    //     data: [841, 912, 111, 111, 321, 111, 111],
                    //     type: 'line',
                    //
                    //     smooth: true
                    // }
                ]
            };


            // 使用刚指定的配置项和数据显示图表。
            myChart.setOption(option);
        }
    });
});


// 使用刚指定的配置项和数据显示图表。
myChart.setOption(option);
