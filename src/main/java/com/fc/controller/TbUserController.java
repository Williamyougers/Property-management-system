//package com.fc.controller;
//
//@Controller
//@RequestMapping("user")
//public class TbUserController {
//    @Autowired
//    private TbUserService tbUserService;
//
//    @PostMapping("login")
//    public ModelAndView login(TbUser tbUser,
//                              Integer remember,
//                              HttpSession session,
//                              HttpServletResponse response,
//                              ModelAndView mv) {
//        ResultVO result = tbUserService.login(tbUser.getUsername(), tbUser.getPassword());
//
//        if (result.getCode() == 200) {
//            session.setAttribute("TbUser", result.getData());
//
//            Cookie cookie;
//
//            if (remember != null && remember == 1) {
//                cookie = new Cookie("JSESSIONID", session.getId());
//
//                cookie.setMaxAge(30 * 60);
//
//
//            } else {
//                cookie = new Cookie("JSESSIONID", null);
//
//                cookie.setMaxAge(-1);
//            }
//            response.addCookie(cookie);
//            mv.setViewName("/index.jsp");
//        } else {
//            mv.addObject("resultInfo", result);
//            mv.setViewName("redirect:/login.jsp");
//        }
//        return mv;
//    }
