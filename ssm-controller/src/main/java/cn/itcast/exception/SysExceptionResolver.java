package cn.itcast.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SysExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView modelAndView = new ModelAndView();
        if(ex instanceof SysException){
            String message = ex.getMessage();
            modelAndView.addObject("errorMessage",message);
        }else{
            String message = "未知错误!";
            modelAndView.addObject("errorMessage",message);
        }
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
