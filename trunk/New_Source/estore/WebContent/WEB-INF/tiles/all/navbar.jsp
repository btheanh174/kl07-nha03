<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<div id="navbar" class="navbar section"><div id="Navbar1" class="widget Navbar"><script type="text/javascript">
    function setAttributeOnload(object, attribute, val) {
      if(window.addEventListener) {
        window.addEventListener("load",
          function(){ object[attribute] = val; }, false);
      } else {
        window.attachEvent('onload', function(){ object[attribute] = val; });
      }
    }
    function showRelatedContent(args) {
      var el = document.getElementById('related-iframe');
      if (el.parentNode.style.display != 'none') {
        el.parentNode.style.display = 'none';
        document.onclick = showRelatedContent.prevOnClick;
        return;
      }
      
      var match = /(?:^[?]|&amp;)c=([0-9]+)(?:&amp;|(?!.))/.exec(args);
      if (match !== null) {
        document.getElementById('related-loading').style.left = match[1] + 'px';
        el.style.left = Math.max(0, match[1] - parseInt(el.width) / 2) + 'px';
      }
      el.src = "http://www.blogger.com"
          + '/related-content.g?q='
          + window.location.href
          + '&amp;id=' + "3128207676477954990";
      el.parentNode.style.display = 'block';
      showRelatedContent.prevOnClick = document.onclick;

      // Hide related-content dropdown when clicking anywhere but on it.
      document.onclick = function() {
        var el = document.getElementById('related-iframe');
        if (el.parentNode.style.display != 'none') {
          el.parentNode.style.display = 'none';
        }
        document.onclick = showRelatedContent.prevOnClick;
      };
    }
  </script>
<iframe width="100%" scrolling="no" height="30px" frameborder="0" title="Blogger Navigation and Search" allowtransparency="true" id="navbar-iframe" marginheight="0" marginwidth="0" src=""></iframe>

<div></div></div></div>
