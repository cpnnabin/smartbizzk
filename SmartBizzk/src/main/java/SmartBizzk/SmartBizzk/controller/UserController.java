//package SmartBizzk.SmartBizzk.controller;
//
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
//public class UserController {
//    @Controller
//    public class UserController {
//
//        @GetMapping("/profile")
//        public String profile() {
//            return "profile"; // profile.html template
//        }
//
//        @GetMapping("/settings")
//        public String settings() {
//            return "settings"; // settings.html template
//        }
//
//        @PostMapping("/logout")
//        public String logout(HttpServletRequest request, HttpServletResponse response) {
//            // If you're using Spring Security:
//            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//            if (auth != null) {
//                new SecurityContextLogoutHandler().logout(request, response, auth);
//            }
//            return "redirect:/login?logout";
//        }
//    }
//
//}
