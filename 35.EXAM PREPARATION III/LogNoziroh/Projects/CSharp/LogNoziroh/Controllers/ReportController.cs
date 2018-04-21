namespace LogNoziroh.Controllers
{
    using Microsoft.AspNetCore.Mvc;
    using Models;
    using System.Linq;

    public class ReportController : Controller
    {
        private readonly LogNozirohDbContext dbContext;

        public ReportController(LogNozirohDbContext dbContext)
        {
            this.dbContext = dbContext;
        }

        [HttpGet]
        [Route("")]
        public IActionResult Index()
        {
            var task = dbContext.Reports.ToList();
            return View(task);
        }

        [HttpGet]
        [Route("details/{id}")]
        public IActionResult Details(int id)
        {
            var task = dbContext
                .Reports
                .Where(p => p.Id == id)
                .FirstOrDefault();

            return View(task);
        }

        [HttpGet]
        [Route("create")]
        public IActionResult Create()
        {
            return View();
        }

        [HttpPost]
        [Route("create")]
        [ValidateAntiForgeryToken]
        public IActionResult Create(Report report)
        {
            dbContext.Reports.Add(report);
            dbContext.SaveChanges();
            return RedirectToAction(nameof(Index));
        }

        [HttpGet]
        [Route("delete/{id}")]
        public IActionResult Delete(int id)
        {
            var proj = dbContext
                .Reports
                .Where(p => p.Id == id)
                .FirstOrDefault();

            return View(proj);
        }

        [HttpPost]
        [Route("delete/{id}")]
        [ValidateAntiForgeryToken]
        public IActionResult DeleteConfirm(Report reportModel)
        {
            var proj = dbContext
               .Reports
               .Where(p => p.Id == reportModel.Id)
               .FirstOrDefault();

            dbContext.Remove(proj);
            dbContext.SaveChanges();
            return RedirectToAction("Index");
        }
    }
}
