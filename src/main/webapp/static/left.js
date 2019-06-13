var a = 0;
var b = 0;
var c = 0;

function a1() {

    if(a==0){
        $("#a").attr('style', 'background-color: rgb(48, 65, 86); ');
        a=1;
    } else if(a==1){
        $("#a").attr('style', 'display:none; ');
        a=0;
    }
}
function b1() {

    if(b==0){
        $("#b").attr('style', 'background-color: rgb(48, 65, 86); ');
        b=1;
    } else if(b==1){
        $("#b").attr('style', 'display:none; ');
        b=0;
    }
}
function c1() {

    if(c==0){
        $("#c").attr('style', 'background-color: rgb(48, 65, 86); ');
        c=1;
    } else if(c==1){
        $("#c").attr('style', 'display:none; ');
        c=0;
    }
}