using System;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Sacral.DTO;
using Sacral.Service;

namespace Sacral.API
{
    [Route("api/[controller]")]
    public class SacralController : Controller
    {
        private readonly SacralServiceAsync _sacralService;

        public SacralController(SacralServiceAsync sacralService)
        {
            _sacralService = sacralService;
        }

        [HttpGet]
        public async Task<IActionResult> Get()
        {
            var result = await _sacralService.PerformSacralServiceAsync();
            return Ok(result);
        }
    }
}