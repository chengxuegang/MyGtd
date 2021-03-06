// 页面初始化：填充数据
window.onload = function() {
	 initCollectionThisngs();
};
function initCollectionThisngs(){
	var urlt = "http://127.0.0.1/gtd/cList";
	var $table;
	$table = $("#ctGrid").bootstrapTable({
		url:urlt,
		method:'GET',
		striped : true,
		pagination: true,
		sortable : true,
		sortOrder : "asc",
		pageNumber : 1,
        // pageSize: rows,                     //每页的记录行数（*）
		pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
    	search: false,                      //是否显示表格搜索
        strictSearch: true,
        showColumns: true,                  //是否显示所有的列（选择显示的列）
        showRefresh: true,                  //是否显示刷新按钮
        minimumCountColumns: 2,             //最少允许的列数
        clickToSelect: true,                //是否启用点击选中行
		//height: 500,                      //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
        uniqueId: "id",                     //每一行的唯一标识，一般为主键列
        showToggle: true,                   //是否显示详细视图和列表视图的切换按钮
        cardView: false,                    //是否显示详细视图
        detailView: false,                  //是否显示父子表

		columns:[
			{
			checkbox:true,
			visible:true,
			},
			{field:'id',
			align:'center',          
			title:'编号'
			},
            {field:'owner',
        	 align:'center',          
			 title:'当前人员'
            },
            {field:'summary',
           	 align:'center',
             title:'摘要'
			},
            {field:'content',
        	 align:'center',
             title:'内容'
            },
            {field:'scene',
           	 align:'center',
			 title:'场景'
			},
            {field:'importanceDegree',
        	 align:'center',
			 title:'重要程度'
			},
            {field:'urgencyDegree',
        	 align:'center',
			 title:'紧急程度'
			},
            {field:'dealMethod',
        	 align:'center',
			 title:'处理方法'
			},
			{field : "operate", 
				title : "操作", 
				align: "center",
				events: "operateEvents", 
				width : "100px", 
				formatter: operateFormatter
			}],
		onLoadSuccess:function(){

		},
		onLoadError:function () {
			showTips("数据加载失败");
        },
		onDblClickRow:function(row, $element){
			var id = row.id;
			EditViewById(id,'view');
		}
	});
}

function operateFormatter(value, row, index) {
	var tesx = getOperHtml();
	return [''+tesx
		].join('');
}
		
window.operateEvents = {
		'click #operId li a': function (e, value, row, index) {
        collectionsChange(value);
         }
};
function getOperHtml(){
	var text = '<div class="dropdown"> '
		+ '<button type="button" class="btn btn-default ?btn-sm  dropdown-toggle" style="margin-right:15px;" id="operList" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">操作</button>'
		+ ' <ul class="dropdown-menu" aria-labelledby="operList" id="operId">'
		+ ' <li><a href="#"  onclick="collectionsChange(\"1\")">复制到清单中</a></li>'
		+ ' <li><a href="#"  onclick="collectionsChange(\"2\")">复制到日历中</a></li>'
		+ ' <li><a href="#"  onclick="collectionsChange(\"3\")">复制到五万米中</a></li>'
		+ ' <li role="separator" class="divider"></li>'
		+ ' <li><a href="#"  onclick="collectionsChange(\"4\")">编辑</a></li>'
		+ ' <li><a href="#"  onclick="collectionsChange(\"5\")">删除</a></li>'
		+ ' </ul>'
		+ '</div> ';
	return text;
}
function collectionsChange(value){
	alert(value);
}		
// 按钮点击进行文章详情页
$("#showArticle").click(function() {
	var articleId = $(this).attr("articleId");
	var url = "article.html?articleId=" + articleId;
	window.location.href = url;
});


