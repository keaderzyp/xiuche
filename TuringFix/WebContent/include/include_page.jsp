<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript">
		$(".pageTag").html('<div id="customers2_length" class="dataTables_length">'+
         	'	<label>'+
         	'	<span>当前显示</span>'+
         	'	<select id="rows" onchange="turnRows()" class="form-control" name="customers2_length" aria-controls="customers2">'+
         	'		<option value="10" ${data.pageSize==6?"selected":"" }>6</option>'+
         	'		<option value="25" ${data.pageSize==10?"selected":"" }>10</option>'+
         	'		<option value="50" ${data.pageSize==30?"selected":"" }>30</option>'+
         	'		<option value="100" ${data.pageSize==50?"selected":"" }>50</option>'+
         	'	</select>'+
         	'	<span>条</span>'+
         	'	&nbsp;从 <span id="rowFrom" >${data.pageSize*(data.pageNo-1)+1 }</span> 到 <span id="rowTo" >${(data.pageSize*(data.pageNo-1)+data.pageSize)<=data.pageTotalSize?data.pageSize*(data.pageNo-1)+data.pageSize:data.pageTotalSize}</span>条 '+
			'	共 <span id="rowCount" >${data.pageTotalSize }</span> 条'+
        ' 	</label>'+
     '   </div>'+
	'		<div id="customers2_paginate" class="dataTables_paginate ">'+
     		
     '			<a class="paginate_button " href="javascript:turnPage(1)">首页</a>'+
     '			<c:if test="${data.pageGroup!=1 }">'+
     '			<a class="paginate_button " href="javascript:turnPage(${data.pageGroup-1>0?(data.pageGroup-2)*data.pageGroupSize+1:1 })">...</a>'+
     '			</c:if>'+
      '  		<c:forEach begin="${(data.pageGroup-1)*data.pageGroupSize+1 }" end="${(data.pageGroup-1)*data.pageGroupSize+data.pageGroupSize<=data.pageCount?(data.pageGroup-1)*data.pageGroupSize+data.pageGroupSize:data.pageCount }" varStatus="i">'+
      '  			<a class="paginate_button " href="javascript:turnPage(${(data.pageGroup-1)*data.pageGroupSize+i.count })">${(data.pageGroup-1)*data.pageGroupSize+i.count }</a>'+
      '  		</c:forEach>'+
       ' 		<c:if test="${data.pageGroup!=data.pageTotalGroup }">'+
     '			<a class="paginate_button " href="javascript:turnPage(${data.pageGroup<data.pageTotalGroup?(data.pageGroup*data.pageGroupSize)+1:data.pageTotalGroup })">...</a>'+
     '			</c:if>'+
     '   		<a class="paginate_button " href="javascript:turnPage(${data.pageCount })">尾页</a>'+
        	
     '	</div>');
		
	</script>