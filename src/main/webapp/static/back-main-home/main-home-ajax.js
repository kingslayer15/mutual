$(function () {
    $.ajax({
        url:"/admin/orderCount",
        type:"GET",
        contentType: "application/json",
        success: function (data) {
            if (data != "") {
                $("#todayOrderCount").text(data);
            }else {
                $("#todayOrderCount").text(0);
            }
        }
    });

    $.ajax({
        url:"/admin/sumAmount",
        type:"GET",
        contentType: "application/json",
        success: function (data) {
            if (data != "") {
                $("#todayTotalAmount").text("￥" + data);
            }else {
                $("#todayTotalAmount").text("￥" + 0);
            }
        }
    });
    $.ajax({
        url:"/admin/sumAmountYesterday",
        type:"GET",
        contentType: "application/json",
        success: function (data) {
            if (data != "") {

                $("#YesterdayTotalAmount").text("￥" + data);
            } else {
                $("#YesterdayTotalAmount").text("￥" + 0);
            }
        }
    });

})




//订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单

//待付款
var order0Num = 0;
//待发货
var order1Num = 0;
//已发货
var order2Num = 0;
//已完成
var order3Num = 0;

$(function () {
    $.ajax({
        url:"/admin/countByStatus",
        type:"GET",
        contentType: "application/json",
        success: function (data) {

            $(data).each(function (index, item) {
                if(item.status === 0){
                    order0Num = item.num;
                }else if(item.status === 1){
                    order1Num = item.num;
                }else if(item.status === 2){
                    order2Num = item.num;
                }else if(item.status === 3){
                    order3Num = item.num;
                }else if(item.status === 4){
                    order4Num = item.num;
                }


                $("#order0Num").text("(" +order0Num+")");
                $("#order1Num").text("(" +order1Num+")");
                $("#order2Num").text("(" +order2Num+")");
                $("#order3Num").text("(" +order3Num+")");
                $("#order4Num").text("(" +order4Num+")");

            })


        }
    });


    $.ajax({
        url:"/admin/countByConfirm",
        type:"GET",
        contentType: "application/json",
        success: function (data) {
            if (data != "") {

                $("#TotalUnconfirm").text("(" + data + ")");
            } else {
                $("#TotalUnconfirm").text("(" + 0 + ")");
            }
        }
    });

    $.ajax({
        url:"/admin/countByLowStock",
        type:"GET",
        contentType: "application/json",
        success: function (data) {
            if (data != "") {
                $("#lackStock1").text("(" + data + ")");
                $("#lackStock2").text(data);
            } else {
                $("#lackStock1").text("(" + 0 + ")");
                $("#lackStock2").text(0);
            }
        }
    });

    $.ajax({
        url:"/admin/countByReturnApply?status=0",
        type:"GET",
        contentType: "application/json",
        success: function (data) {

            if (data != "") {
                $("#TotalReturnApply0").text("(" + data + ")");
            } else {
                $("#TotalReturnApply0").text("(" + 0 + ")");
            }
        }
    });

    $.ajax({
        url:"/admin/countByReturnApply?status=1",
        type:"GET",
        contentType: "application/json",
        success: function (data) {

            if (data != "") {
                $("#TotalReturnApply1").text("(" + data + ")");
            } else {
                $("#TotalReturnApply1").text("(" + 0 + ")");
            }
        }
    });

    $.ajax({
        url:"/admin/countByEndTime",
        type:"GET",
        contentType: "application/json",
        success: function (data) {
            if (data != "") {
                $("#TotalByEndTime").text("(" + data + ")");
            } else {
                $("#TotalByEndTime").text("(" + 0 + ")");
            }
        }
    });
    $.ajax({
        url:"/admin/countByPublishStatus0",
        type:"GET",
        contentType: "application/json",
        success: function (data) {

            if (data != "") {
                $("#TotalByPublishStatus0").text(data);
            } else {
                $("#TotalByPublishStatus0").text(0);
            }
        }
    });

    $.ajax({
        url:"/admin/countByPublishStatus1",
        type:"GET",
        contentType: "application/json",
        success: function (data) {

            if (data != "") {
                $("#TotalByPublishStatus1").text(data);
            } else {
                $("#TotalByPublishStatus1").text(0);
            }
        }
    });

    $.ajax({
        url:"/admin/countAll",
        type:"GET",
        contentType: "application/json",
        success: function (data) {
            if (data != "") {
                $("#allProduct").text(data);
            } else {
                $("#allProduct").text(0);
            }
        }
    });

    $.ajax({
        url:"/admin/countByCreateTime?dayNum=0",
        type:"GET",
        contentType: "application/json",
        success: function (data) {
            if (data != "") {
                $("#todayNewMember").text(data);
            } else {
                $("#todayNewMember").text(0);
            }
        }
    });

    $.ajax({
        url:"/admin/countByCreateTime?dayNum=1",
        type:"GET",
        contentType: "application/json",
        success: function (data) {
            if (data != "") {

                $("#yesterdayNewMember").text(data);
            } else {
                $("#yesterdayNewMember").text(0);
            }
        }
    });

    $.ajax({
        url:"/admin/countByCreateTimeMonth",
        type:"GET",
        contentType: "application/json",
        success: function (data) {
            if (data != "") {

                $("#monthNewMember").text(data);
            } else {
                $("#monthNewMember").text(0);
            }
        }
    });

    $.ajax({
        url:"/admin/countMemberAll",
        type:"GET",
        contentType: "application/json",
        success: function (data) {
            if (data != "") {

                $("#totalMember").text(data);
            } else {
                $("#totalMember").text(0);
            }
        }
    });

    $.ajax({
        url:"/admin/countOrderByCreateTimeThisMonth",
        type:"GET",
        contentType: "application/json",
        success: function (data) {
            if (data != "") {

                $("#thisMonthOrder").text(data);
            } else {
                $("#thisMonthOrder").text(0);
            }
        }
    });

    $.ajax({
        url:"/admin/countOrderByCreateTimeLastMonth",
        type:"GET",
        contentType: "application/json",
        success: function (data) {
            if (data != "") {

                $("#lastMonthOrder").text(data + "%");
            } else {
                $("#lastMonthOrder").text(0 + "%");
            }
        }
    });

    $.ajax({
        url:"/admin/countOrderByCreateTimeWeek",
        type:"GET",
        contentType: "application/json",
        success: function (data) {
            if (data != "") {

                $("#thisWeekOrder").text(data);
            } else {
                $("#thisWeekOrder").text(0);
            }
        }
    });

    $.ajax({
        url:"/admin/countOrderByCreateTimeLastWeek",
        type:"GET",
        contentType: "application/json",
        success: function (data) {

            if (data != "") {
                $("#lastWeekOrder").text(data + "%");
            } else {
                $("#lastWeekOrder").text(0 + "%");
            }
        }
    });

    $.ajax({
        url:"/admin/sumAmountThisMonth",
        type:"GET",
        contentType: "application/json",
        success: function (data) {


            if (data != "") {

                $("#thisMonthAmount").text(data);
            } else {
                $("#thisMonthAmount").text(0);
            }
        }
    });

    $.ajax({
        url:"/admin/sumAmountLastMonth",
        type:"GET",
        contentType: "application/json",
        success: function (data) {
            if (data != "") {
                $("#lastMonthAmount").text(data + "%");
            } else {
                $("#lastMonthAmount").text(0 + "%");
            }
        }
    });

    $.ajax({
        url:"/admin/sumAmountThisWeek",
        type:"GET",
        contentType: "application/json",
        success: function (data) {


            if (data != "") {

                $("#thisWeekAmount").text(data);
            } else {
                $("#thisWeekAmount").text(0);
            }
        }
    });

    $.ajax({
        url:"/admin/sumAmountLastWeek",
        type:"GET",
        contentType: "application/json",
        success: function (data) {


            if (data != "") {
                $("#lastWeekAmount").text(data + "%");
            } else {
                $("#lastWeekAmount").text(0 + "%");
            }
        }
    });







})
