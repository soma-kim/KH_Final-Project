/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.82
 * Generated at: 2022-12-06 22:19:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class floatingButton_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Floating Button</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- CSS 스타일시트 -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/css/floatingButtonCss.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Font Awesome 아이콘 연결 -->\r\n");
      out.write("    <script src=\"https://kit.fontawesome.com/d57af49dc3.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- 1대1 채팅 연결 -->\r\n");
      out.write("	<script id=\"happytalkSDK\" src=\"https://design.happytalkio.com/sdk/happytalk.chat.v2.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <!-- 플로팅 버튼 영역 -->\r\n");
      out.write("    <div id=\"floating_container\">\r\n");
      out.write("\r\n");
      out.write("        <!-- 상하단 이동 스크롤 버튼 -->\r\n");
      out.write("        <div id=\"scroll_button_container\">\r\n");
      out.write("\r\n");
      out.write("            <!-- 상단 이동 버튼 -->\r\n");
      out.write("            <a href=\"javascript:;\" id=\"scroll_top\">\r\n");
      out.write("                <i class=\"fa-solid fa-circle-chevron-up\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("\r\n");
      out.write("            <!-- 하단 이동 버튼 -->\r\n");
      out.write("            <a href=\"javascript:;\" id=\"scroll_bottom\">\r\n");
      out.write("                <i class=\"fa-solid fa-circle-chevron-down\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- 해피톡 1:1 문의 채팅 상담 버튼 -->\r\n");
      out.write("        <script>\r\n");
      out.write("            var ht = null;\r\n");
      out.write("            (function(id, scriptSrc, callback) {\r\n");
      out.write("                var d = document,\r\n");
      out.write("                    tagName = 'script',\r\n");
      out.write("                    $script = d.createElement(tagName),\r\n");
      out.write("                    $element = d.getElementsByTagName(tagName)[0];\r\n");
      out.write("\r\n");
      out.write("                $script.id = id;\r\n");
      out.write("                $script.async = true;\r\n");
      out.write("                $script.src = scriptSrc;\r\n");
      out.write("\r\n");
      out.write("                if (callback) { $script.addEventListener('load', function (e) { callback(null, e); }, false); }\r\n");
      out.write("                $element.parentNode.insertBefore($script, $element);\r\n");
      out.write("            })('happytalkSDK', 'https://design.happytalkio.com/sdk/happytalk.chat.v2.min.js', function() {\r\n");
      out.write("                ht = new Happytalk({\r\n");
      out.write("                siteId: '5000100354',\r\n");
      out.write("                siteName: 'InsertCoin',\r\n");
      out.write("                categoryId: '152971',\r\n");
      out.write("                divisionId: '152972'\r\n");
      out.write("            });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        $(function() {\r\n");
      out.write("\r\n");
      out.write("            // 화면 스크롤 시\r\n");
      out.write("            $(window).scroll(function() {\r\n");
      out.write("\r\n");
      out.write("                // 상단 이동 버튼 상단으로부터 200px 이상에서만 표시\r\n");
      out.write("                if($(window).scrollTop() >= 200) {\r\n");
      out.write("                    $('#scroll_top').show();\r\n");
      out.write("                } else {\r\n");
      out.write("                    $('#scroll_top').hide();\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                // 하단 이동 버튼 하단으로부터 200px 이상까지만 표시\r\n");
      out.write("                if($(window).scrollTop() <= ($(window).height() - 200)) {\r\n");
      out.write("                    $('#scroll_bottom').show();\r\n");
      out.write("                } else {\r\n");
      out.write("                    $('#scroll_bottom').hide();\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                if($(window).scrollTop() >= 10) {\r\n");
      out.write("                    $('#header_container').css(\"opacity\", \"0.9\");\r\n");
      out.write("                } else {\r\n");
      out.write("                    $('#header_container').css(\"opacity\", \"1\");\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            // 상단 이동 버튼 스크롤 설정\r\n");
      out.write("            $('#scroll_top').click(function() {\r\n");
      out.write("                $('html').animate({ scrollTop: 0 });\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            // 하단 이동 버튼 스크롤 설정\r\n");
      out.write("            $('#scroll_bottom').click(function() {\r\n");
      out.write("                $('html').animate({ scrollTop: $('html').height() });\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            const $theme = document.querySelector('#theme_cb');\r\n");
      out.write("\r\n");
      out.write("            $theme.addEventListener('click', e => {\r\n");
      out.write("                if (e.target.checked) {\r\n");
      out.write("                    document.documentElement.setAttribute('color-theme', 'light');\r\n");
      out.write("                    $('#header_logo').attr(\"src\", \"resources/image/common/main-logo_light.png\");\r\n");
      out.write("                } else {\r\n");
      out.write("                    document.documentElement.setAttribute('color-theme', 'dark');\r\n");
      out.write("                    $('#header_logo').attr(\"src\", \"resources/image/common/main-logo_dark.png\");\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
