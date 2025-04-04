@Controller
public class dashboardController {
  @GetMapping("/dashboard")
  public String dashboard(Model model) {
    return "dashboard";
  }
}
